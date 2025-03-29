package com.preperad.to.interview.algoritm.algoritms;

import com.preperad.to.interview.algoritm.dto.algorithmsDto.Request;
import com.preperad.to.interview.algoritm.dto.algorithmsDto.Response;
import com.preperad.to.interview.algoritm.exceptions.SubstractionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class SubtractionService {
    @Autowired
    Map<String, AlgorithmsCalculator> serviceMap;

    public Response subtraction(Request request) throws Exception {
        if (!serviceMap.containsKey(request.getAlgorithmType())) {
            throw new SubstractionException("Wrong type request");
        }
        return serviceMap.get(request.getAlgorithmType()).solve(request);
    }
}
