package com.apiparty.parties.com.apiparty.parties.service;

import com.apiparty.parties.com.apiparty.parties.entity.Parties;
import com.apiparty.parties.com.apiparty.parties.repository.PartiesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by minishtera on 4/15/18.
 */
@Service
public class PartiesSrvc {
    @Autowired
    PartiesRepo partiesRepo;

    public Parties getParty(Integer id){
        return partiesRepo.findById(id).orElseThrow( () -> new RuntimeException("Exception"));

    }
}
