package com.process.one.respositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.process.one.model.FTTIssueBase;

@Repository
public interface FTTIssueBaseRespository extends JpaRepository<FTTIssueBase,String> {

}
