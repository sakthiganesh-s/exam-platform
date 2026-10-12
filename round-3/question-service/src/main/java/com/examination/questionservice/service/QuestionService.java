package com.examination.questionservice.service;
import com.examination.questionservice.model.Question; import com.examination.questionservice.repository.QuestionRepository; import org.springframework.stereotype.Service; import java.util.List;
@Service public class QuestionService { private final QuestionRepository repository; public QuestionService(QuestionRepository r){repository=r;} public List<Question> all(){return repository.findAll();} public Question byId(Long id){return repository.findById(id).orElseThrow();} public Question save(Question x){return repository.save(x);} }
