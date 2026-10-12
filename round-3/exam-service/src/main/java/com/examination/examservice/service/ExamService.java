package com.examination.examservice.service;
import com.examination.examservice.model.Exam; import com.examination.examservice.repository.ExamRepository; import org.springframework.stereotype.Service; import java.util.List;
@Service public class ExamService { private final ExamRepository repository; public ExamService(ExamRepository r){repository=r;} public List<Exam> all(){return repository.findAll();} public Exam byId(Long id){return repository.findById(id).orElseThrow();} public Exam save(Exam x){return repository.save(x);} }
