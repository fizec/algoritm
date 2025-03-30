package com.preperad.to.interview.algoritm.dto.algorithmsDto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Date;

@Schema
public class PalindromeResponse extends Response{
    public PalindromeResponse(Date responseDate, String customer, Boolean isPalindrome) {
        super(responseDate, customer);
        this.isPalindrome = isPalindrome;
    }

    @JsonProperty(value = "isPalindrome")
    private Boolean isPalindrome;
}
