package com.preperad.to.interview.algoritm.dto.algorithmsDto;

import com.fasterxml.jackson.annotation.JsonTypeName;
import com.preperad.to.interview.algoritm.cons.AlgorithmType;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
@Schema
public class PalindromeRequest  extends Request{
    public static  final String DISCRIMINATOR = AlgorithmType.palindromeNumber;

    @Schema(description = "polindrome candidate", defaultValue = "1123454321", required = true)
    @NotNull(message = " Number cannot be null")
    private Integer number;
}
