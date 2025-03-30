package com.preperad.to.interview.algoritm.dto.algorithmsDto;

import com.fasterxml.jackson.annotation.JsonTypeName;
import com.preperad.to.interview.algoritm.cons.AlgorithmType;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.List;

@Data
@Schema
public class LongestCommonPrefixRequest extends Request{
    public static  final String DISCRIMINATOR = AlgorithmType.longestCommonPrefix;

    @Schema(description = "List words", defaultValue = "{flowable, flow, flight, flower}", required = true)
    private List<String> strs;
}
