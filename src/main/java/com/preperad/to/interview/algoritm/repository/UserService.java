package com.preperad.to.interview.algoritm.repository;

import com.preperad.to.interview.algoritm.dto.UsageLog;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {
    private final UsageLogRepository usageLogRepository;

    public void saveUserLog(UsageLog log) {
        usageLogRepository.save(log);
    }

}
