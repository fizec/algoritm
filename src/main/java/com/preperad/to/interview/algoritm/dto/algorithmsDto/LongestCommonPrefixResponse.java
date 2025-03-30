package com.preperad.to.interview.algoritm.dto.algorithmsDto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Date;

@Schema
public class LongestCommonPrefixResponse extends Response{
    public LongestCommonPrefixResponse(Date responseDate, String customer, String prefix) {
        super(responseDate, customer);
        this.prefix = prefix;
    }

    @JsonProperty(value = "PREFIX")
    private String prefix;
}
