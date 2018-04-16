package com.apiparty.parties.com.apiparty.parties.repository;

import com.apiparty.parties.com.apiparty.parties.entity.Parties;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by minishtera on 4/15/18.
 */
@Repository
public interface PartiesRepo extends JpaRepository<Parties, Integer> {

}
