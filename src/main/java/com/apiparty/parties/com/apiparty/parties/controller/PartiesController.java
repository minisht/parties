package com.apiparty.parties.com.apiparty.parties.controller;

import com.apiparty.parties.com.apiparty.parties.entity.Parties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by minishtera on 4/15/18.
 */
@RestController
public class PartiesController {
    @GetMapping(path = "/parties/{id}")
    public Parties getParty(@PathVariable(name="id") Integer id) {
        return null;
    }


}
