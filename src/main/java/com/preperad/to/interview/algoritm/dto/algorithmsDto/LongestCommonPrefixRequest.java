package com.preperad.to.interview.algoritm.dto.algorithmsDto;

import com.preperad.to.interview.algoritm.cons.AlgorithmType;
import lombok.Data;

import java.util.List;

@Data
public class LongestCommonPrefixRequest extends Request{
    public static  final String DISCRIMINATOR = AlgorithmType.longestCommonPrefix;

    private List<String> strs;
}
