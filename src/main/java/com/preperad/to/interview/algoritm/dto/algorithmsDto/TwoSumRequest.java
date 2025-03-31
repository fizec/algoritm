package com.preperad.to.interview.algoritm.dto.algorithmsDto;

import com.preperad.to.interview.algoritm.cons.AlgorithmType;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.List;

@Data
@Schema
public class TwoSumRequest extends Request {
    public static final String DISCRIMINATOR = AlgorithmType.twoSum;

    @Schema(description = "List of number", defaultValue ="{2, 7, 11, 15}", required = true)
    @Size(min = 1, message = "Array size must be more than 0")
    private List<Integer> numsList;
    @Schema(description = "target number", defaultValue ="9", required = true)
    @NotNull(message = "Target number cannot be empty")
    private Integer target;
}
