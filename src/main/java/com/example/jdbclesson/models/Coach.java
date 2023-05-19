package com.example.jdbclesson.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Coach {
    private int id;
    private String name;
    private int age;
    private String rank;
}
