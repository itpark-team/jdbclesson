package com.example.jdbclesson.repositories;

import com.example.jdbclesson.models.Team;
import lombok.AllArgsConstructor;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@AllArgsConstructor
public class TeamsRepository {

    private JdbcTemplate jdbcTemplate;

    public List<Team> getAll() {
        //return jdbcTemplate.query("SELECT * FROM teams", new TeamRowMapper());
        return jdbcTemplate.query("SELECT * FROM teams", new BeanPropertyRowMapper<>(Team.class));
    }

    public Team getById(int id) {
        return jdbcTemplate.queryForObject("SELECT * FROM teams WHERE id=?", new TeamRowMapper(), id);
    }
}
