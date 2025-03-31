package com.preperad.to.interview.algoritm.dto.algorithmsDto;

import com.fasterxml.jackson.annotation.JsonTypeName;
import com.preperad.to.interview.algoritm.cons.AlgorithmType;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.List;

@Data
@Schema
public class MergeTwoSortedListsRequest extends Request{
    public static final String DISCRIMINATOR = AlgorithmType.mergeTwoSortedLists;

    @Schema(description = "first list int to merge", defaultValue = "", required = true)
    @Size(min = 1, message = "Array number 1 size must be more than 0")
    private List<Integer> list1;
    @Schema(description = "second list int to request", required = true)
    @Size(min = 1, message = "Array number 2 size must be more than 0")
    private List<Integer> list2;
}
