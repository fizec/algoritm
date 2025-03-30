package com.preperad.to.interview.algoritm.dto.algorithmsDto;

import com.preperad.to.interview.algoritm.cons.AlgorithmType;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.List;

@Data
@Schema
public class TwoSumRequest extends Request {
    public static final String DISCRIMINATOR = AlgorithmType.twoSum;

    @Schema(description = "List of number", defaultValue ="{2, 7, 11, 15}", required = true)
    private List<Integer> numsList;
    @Schema(description = "target number", defaultValue ="9", required = true)
    private Integer target;
}
