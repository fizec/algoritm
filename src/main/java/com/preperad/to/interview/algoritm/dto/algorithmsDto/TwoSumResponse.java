package com.preperad.to.interview.algoritm.dto.algorithmsDto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Date;
import java.util.List;

@Schema
public class TwoSumResponse extends Response {
    public TwoSumResponse(Date responseDate, String customer, List<Integer> output) {
        super(responseDate, customer);
        this.output = output;
    }

    @JsonProperty(value = "OUTPUT")
    private List<Integer> output;
}
