package com.preperad.to.interview.algoritm.dto.algorithmsDto;

import com.preperad.to.interview.algoritm.cons.AlgorithmType;
import lombok.Data;

import java.util.List;

@Data
public class TwoSumRequest extends Request {
    public static final String DISCRIMINATOR = AlgorithmType.twoSum;

    private List<Integer> numsList;

    private Integer target;
}
