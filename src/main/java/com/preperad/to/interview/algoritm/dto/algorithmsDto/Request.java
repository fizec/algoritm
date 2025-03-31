package com.preperad.to.interview.algoritm.dto.algorithmsDto;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
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
@Schema(description = "Базовый класс для запроса пользователя", discriminatorProperty = "type")
public abstract class Request {
    @Schema(description = "User name", required = true)
    @NotEmpty(message = "Type cannot be empty")
    public static final String DISCRIMINATOR = "type";
    @Schema(description = "Type request", required = true)
    @NotEmpty(message = "Customer name cannot be empty")
    private String customer;
    @Schema(description = "algorithmType", required = true)
    @NotEmpty(message = "Algorithm type cannot be empty")
    private String algorithmType;
}
