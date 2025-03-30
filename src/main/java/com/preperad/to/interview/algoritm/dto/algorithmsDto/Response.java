package com.preperad.to.interview.algoritm.dto.algorithmsDto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.Date;

@Data
@Schema(oneOf = {
        LongestCommonPrefixResponse.class,
        MergeTwoSortedListsResponse.class,
        PalindromeResponse.class,
        TwoSumResponse.class
})
public class Response {
    public Response(Date responseDate, String customer) {
        this.responseDate = responseDate;
        this.customer = customer;
    }

    @JsonProperty(value = "DATE")
    private Date responseDate;
    @JsonProperty(value = "CUSTOMER")
    private String customer;
}
