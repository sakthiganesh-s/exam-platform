package com.examination.answerservice.service;
import com.examination.answerservice.model.Answer; import com.examination.answerservice.repository.AnswerRepository; import org.springframework.stereotype.Service; import java.util.List;
@Service public class AnswerService { private final AnswerRepository repository; public AnswerService(AnswerRepository r){repository=r;} public List<Answer> all(){return repository.findAll();} public Answer byId(Long id){return repository.findById(id).orElseThrow();} public Answer save(Answer x){return repository.save(x);} }
