package com.preperad.to.interview.algoritm.dto.algorithmsDto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class LongestCommonPrefixResponse extends Response{
    public LongestCommonPrefixResponse(Date responseDate, String customer, String prefix) {
        super(responseDate, customer);
        this.prefix = prefix;
    }

    @JsonProperty(value = "PREFIX")
    private String prefix;
}
