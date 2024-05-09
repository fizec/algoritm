package com.preperad.to.interview.algoritm.dto.algorithmsDto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class PalindromeResponse extends Response{
    public PalindromeResponse(Date responseDate, String customer, Boolean isPalindrome) {
        super(responseDate, customer);
        this.isPalindrome = isPalindrome;
    }

    @JsonProperty(value = "isPalindrome")
    private Boolean isPalindrome;
}
