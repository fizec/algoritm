package com.preperad.to.interview.algoritm.controllers;

import com.preperad.to.interview.algoritm.algoritms.SubtractionService;
import com.preperad.to.interview.algoritm.dto.algorithmsDto.*;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/task")
@AllArgsConstructor
@Tag(name = "Users", description = "Методы работы с пользователями")
public class AlgorithmsController {

    @Autowired
    SubtractionService service;

    @PostMapping(value = "/solve")
    @Operation(
            summary = "Получить тип использованного алгоритма и данные для обработки",
            description = "Возвращает результат и информацию о пользователе и дату"
    )
    public ResponseEntity<Response> subtractionController(@Valid @RequestBody Request request) throws Exception {
        return new ResponseEntity<>(service.subtraction(request), HttpStatus.OK);
    }

}
