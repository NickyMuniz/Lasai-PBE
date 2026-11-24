package com.dest1.lasai.repositories;

import com.dest1.lasai.entities.Lasai;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
    public interface LasaiRepository extends JpaRepository<Lasai, Integer>{
    }

