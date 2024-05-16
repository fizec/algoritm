package com.preperad.to.interview.algoritm.algoritms;

import com.preperad.to.interview.algoritm.aopFunctional.UsageLogging;
import com.preperad.to.interview.algoritm.cons.AlgorithmType;
import com.preperad.to.interview.algoritm.dto.algorithmsDto.MergeTwoSortedListsRequest;
import com.preperad.to.interview.algoritm.dto.algorithmsDto.MergeTwoSortedListsResponse;
import org.springframework.stereotype.Service;

import java.util.*;

@Service(value = AlgorithmType.mergeTwoSortedLists)
public class AlgorithmMergeTwoSortedLists implements AlgorithmsCalculator<MergeTwoSortedListsRequest, MergeTwoSortedListsResponse> {
    @UsageLogging
    @Override
    public MergeTwoSortedListsResponse solve(MergeTwoSortedListsRequest request) {
        List<Integer> resultList = request.getList1().stream().sorted().toList();
        return new MergeTwoSortedListsResponse(new Date(), request.getCustomer(), resultList);
    }

}
