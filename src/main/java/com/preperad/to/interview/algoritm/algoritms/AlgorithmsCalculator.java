package com.preperad.to.interview.algoritm.algoritms;

import com.preperad.to.interview.algoritm.dto.algorithmsDto.Request;
import com.preperad.to.interview.algoritm.dto.algorithmsDto.Response;

public interface AlgorithmsCalculator<T extends  Request, R extends Response>{
    R solve(T request);
}
