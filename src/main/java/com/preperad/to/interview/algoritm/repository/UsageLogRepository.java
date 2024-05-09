package com.preperad.to.interview.algoritm.repository;

import com.preperad.to.interview.algoritm.dto.UsageLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsageLogRepository extends JpaRepository<UsageLog, Long> {

}
