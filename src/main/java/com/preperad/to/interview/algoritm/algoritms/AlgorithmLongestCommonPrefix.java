package com.preperad.to.interview.algoritm.algoritms;

import com.preperad.to.interview.algoritm.aopFunctional.UsageLogging;
import com.preperad.to.interview.algoritm.cons.AlgorithmType;
import com.preperad.to.interview.algoritm.dto.algorithmsDto.LongestCommonPrefixRequest;
import com.preperad.to.interview.algoritm.dto.algorithmsDto.LongestCommonPrefixResponse;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service(value = AlgorithmType.longestCommonPrefix)
public class AlgorithmLongestCommonPrefix implements AlgorithmsCalculator<LongestCommonPrefixRequest, LongestCommonPrefixResponse> {
    @UsageLogging
    @Override
    public LongestCommonPrefixResponse solve(LongestCommonPrefixRequest request) {
        int minimumWordLength = getMinimumWordLength(request.getStrs());
        List<Character> characterList = new ArrayList<>();
        StringBuilder prefix = new StringBuilder();
        boolean isContinue;

        for (int j = 0; j < minimumWordLength; j++) {
            isContinue = false;

            characterList.addAll(getIdenticalLetters(request.getStrs(), j));

            if (characterList.size() == request.getStrs().size()) {
                prefix.append(characterList.get(0));
                isContinue = true;
            }
            characterList.clear();
            if (!isContinue) {
                break;
            }
        }

        return new LongestCommonPrefixResponse(new Date(), request.getCustomer(), prefix.toString());
    }

    private Integer getMinimumWordLength(List<String> strs) {
        return strs.stream()
                .map(String::length)
                .mapToInt(v -> v)
                .min()
                .orElseThrow(RuntimeException::new);
    }

    private List<Character> getIdenticalLetters(List<String> strs, int letterPosition) {
        return strs.stream()
                .map(str -> str.charAt(letterPosition))
                .filter(ch -> ch.equals(strs.get(0).charAt(letterPosition)))
                .toList();
    }
}
