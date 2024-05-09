package com.preperad.to.interview.algoritm.dto.algorithmsDto;

import com.preperad.to.interview.algoritm.cons.AlgoritmType;
import lombok.Data;

@Data
public class PalindromeRequest  extends Request{
    public static  final String DISCRIMINATOR = AlgoritmType.PalindromeNumber;

    private Integer number;
}
