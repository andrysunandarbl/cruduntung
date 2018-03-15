package com.untung.demo.repository;

import com.untung.demo.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by andry.sunandar01 on 15/03/2018.
 */
@Repository
public interface PersonRepository extends JpaRepository<Person, Long>{
}
