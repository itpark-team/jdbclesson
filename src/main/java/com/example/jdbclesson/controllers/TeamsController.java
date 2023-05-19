package com.example.jdbclesson.controllers;

import com.example.jdbclesson.models.Team;
import com.example.jdbclesson.repositories.TeamsRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/teams")
@AllArgsConstructor
public class TeamsController {
    private TeamsRepository teamsRepository;

    @GetMapping("/get-all")
    public List<Team> getAll() {
        return teamsRepository.getAll();
    }

    @GetMapping("/get-by-id/{id}")
    public Team getAll(@PathVariable int id) {
        return teamsRepository.getById(id);
    }
}
