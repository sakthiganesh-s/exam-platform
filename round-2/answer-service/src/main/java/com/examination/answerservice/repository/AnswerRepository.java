package com.examination.answerservice.repository;
import com.examination.answerservice.model.Answer; import org.springframework.data.jpa.repository.JpaRepository;
public interface AnswerRepository extends JpaRepository<Answer,Long>{}
