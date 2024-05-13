package com.preperad.to.interview.algoritm.algoritms;

import com.preperad.to.interview.algoritm.aopFunctional.UsageLogging;
import com.preperad.to.interview.algoritm.cons.AlgorithmType;
import com.preperad.to.interview.algoritm.dto.algorithmsDto.PalindromeRequest;
import com.preperad.to.interview.algoritm.dto.algorithmsDto.PalindromeResponse;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

@Service(value = AlgorithmType.palindromeNumber)
public class AlgorithmPalindromeNumber implements AlgorithmsCalculator<PalindromeRequest, PalindromeResponse> {
    @UsageLogging
    @Override
    public PalindromeResponse solve(PalindromeRequest request) {
        int[] ints = String.valueOf(request.getNumber()).chars().toArray();
        List<Integer> arrayList =  Arrays.stream(ints).boxed().toList();
        LinkedList<Integer> linkedList = new LinkedList<>(arrayList);
        boolean result = true;
        for (Integer element: arrayList) {
            result = element.equals(linkedList.removeLast());
            if (!result) {
                break;
            }
        }

        return new PalindromeResponse(new Date(), request.getCustomer(), result);
    }
}
