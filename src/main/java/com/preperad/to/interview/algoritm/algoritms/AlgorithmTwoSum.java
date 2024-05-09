package com.preperad.to.interview.algoritm.algoritms;

import com.preperad.to.interview.algoritm.aopFunctional.UsageLogging;
import com.preperad.to.interview.algoritm.cons.AlgoritmType;
import com.preperad.to.interview.algoritm.dto.algorithmsDto.TwoSumRequest;
import com.preperad.to.interview.algoritm.dto.algorithmsDto.TwoSumResponse;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service(value = AlgoritmType.twoSum)
public class AlgorithmTwoSum implements AlgorithmsCalculator<TwoSumRequest, TwoSumResponse> {
    @UsageLogging
    @Override
    public TwoSumResponse solve(TwoSumRequest request) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < request.getNumsList().size() -1; i++) {
            if (request.getTarget() == request.getNumsList().get(i) + request.getNumsList().get(i + 1)) {
                result.add(i);
                result.add(i + 1);
                break;
            }
        }
        return new TwoSumResponse(new Date(), request.getCustomer(), result);
    }
}
