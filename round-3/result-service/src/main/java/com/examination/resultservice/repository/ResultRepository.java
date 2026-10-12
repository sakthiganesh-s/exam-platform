package com.examination.resultservice.repository;
import com.examination.resultservice.model.Result; import org.springframework.data.jpa.repository.JpaRepository;
public interface ResultRepository extends JpaRepository<Result,Long>{}
