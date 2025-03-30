package com.preperad.to.interview.algoritm.dto.algorithmsDto;

import com.fasterxml.jackson.annotation.JsonTypeName;
import com.preperad.to.interview.algoritm.cons.AlgorithmType;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.List;

@Data
@Schema
public class MergeTwoSortedListsRequest extends Request{
    public static final String DISCRIMINATOR = AlgorithmType.mergeTwoSortedLists;

    @Schema(description = "first list int to merge", defaultValue = "", required = true)
    private List<Integer> list1;
    @Schema(description = "second list int to request", required = true)
    private List<Integer> list2;
}
