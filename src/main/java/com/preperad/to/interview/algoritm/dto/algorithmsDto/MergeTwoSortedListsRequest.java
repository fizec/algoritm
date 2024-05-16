package com.preperad.to.interview.algoritm.dto.algorithmsDto;

import com.preperad.to.interview.algoritm.cons.AlgorithmType;
import lombok.Data;

import java.util.List;

@Data
public class MergeTwoSortedListsRequest extends Request{
    public static final String DISCRIMINATOR = AlgorithmType.mergeTwoSortedLists;

    private List<Integer> list1;
    private List<Integer> list2;
}
