package com.examination.candidateservice.repository;
import com.examination.candidateservice.model.Candidate; import org.springframework.data.jpa.repository.JpaRepository;
public interface CandidateRepository extends JpaRepository<Candidate,Long>{}
