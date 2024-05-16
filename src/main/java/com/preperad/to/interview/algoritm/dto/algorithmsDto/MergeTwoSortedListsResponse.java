package com.preperad.to.interview.algoritm.dto.algorithmsDto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
import java.util.List;

public class MergeTwoSortedListsResponse extends Response{
    public MergeTwoSortedListsResponse(Date responseDate, String customer, List<Integer> outputList) {
        super(responseDate, customer);
        this.outputList = outputList;
    }

    @JsonProperty(value = "outputList")
    private List<Integer> outputList;
}
