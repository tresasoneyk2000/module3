package com.without.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.without.entity.Entity1;

@Repository
public interface Repo extends JpaRepository<Entity1,Long> {

}
