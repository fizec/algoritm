package com.preperad.to.interview.algoritm.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "usageLogTable")
public class UsageLog {
    @Id
    @GeneratedValue
    private Long id;
    private String customer;
    private String algorithm;
    private Date date;
}
