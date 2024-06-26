package com.preperad.to.interview.algoritm.dto.algorithmsDto;

import com.preperad.to.interview.algoritm.cons.AlgorithmType;
import lombok.Data;

@Data
public class PalindromeRequest  extends Request{
    public static  final String DISCRIMINATOR = AlgorithmType.palindromeNumber;

    private Integer number;
}
