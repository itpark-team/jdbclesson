package com.example.jdbclesson.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Team {
    private int id;
    private String teamName;
    private String city;
    private String amount;
    private int coachId;
}
