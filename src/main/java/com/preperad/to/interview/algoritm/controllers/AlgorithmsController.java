package com.preperad.to.interview.algoritm.controllers;

import com.preperad.to.interview.algoritm.algoritms.AlgorithmsCalculator;
import com.preperad.to.interview.algoritm.dto.algorithmsDto.Request;
import com.preperad.to.interview.algoritm.dto.algorithmsDto.Response;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
@RequestMapping(value = "/task")
@AllArgsConstructor
public class AlgorithmsController {

    @Autowired
    Map<String, AlgorithmsCalculator> serviceMap;

    @PostMapping(value = "/solve")
    public ResponseEntity<Response> subtractionController(@RequestBody Request request) {
        if (serviceMap.containsKey(request.getAlgorithmType())) {
            return new ResponseEntity<>(serviceMap.get(request.getAlgorithmType()).solve(request), HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }

}
