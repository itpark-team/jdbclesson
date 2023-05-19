package com.example.jdbclesson.repositories;

import com.example.jdbclesson.models.Team;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TeamRowMapper implements RowMapper<Team> {
    @Override
    public Team mapRow(ResultSet rs, int rowNum) throws SQLException {
        return Team.builder()
                .id(rs.getInt("id"))
                .teamName(rs.getString("team_name"))
                .city(rs.getString("city"))
                .amount(rs.getString("amount"))
                .coachId(rs.getInt("coach_id"))
                .build();
    }
}
