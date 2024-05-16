package com.preperad.to.interview.algoritm.dto.algorithmsDto;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.Data;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.EXISTING_PROPERTY,
        property = Request.DISCRIMINATOR
)
@JsonSubTypes({
        @JsonSubTypes.Type(value = TwoSumRequest.class, name = TwoSumRequest.DISCRIMINATOR),
        @JsonSubTypes.Type(value = PalindromeRequest.class, name = PalindromeRequest.DISCRIMINATOR),
        @JsonSubTypes.Type(value = LongestCommonPrefixRequest.class, name = LongestCommonPrefixRequest.DISCRIMINATOR),
        @JsonSubTypes.Type(value = MergeTwoSortedListsRequest.class, name = MergeTwoSortedListsRequest.DISCRIMINATOR)
})
@Data
public abstract class Request {
    public static final String DISCRIMINATOR = "type";
    private String customer;
    private String algorithmType;
}
