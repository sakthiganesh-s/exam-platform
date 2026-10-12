package com.examination.examservice.repository;
import com.examination.examservice.model.Exam; import org.springframework.data.jpa.repository.JpaRepository;
public interface ExamRepository extends JpaRepository<Exam,Long>{}
