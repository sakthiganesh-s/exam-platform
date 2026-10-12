package com.examination.candidateservice.service;
import com.examination.candidateservice.model.Candidate; import com.examination.candidateservice.repository.CandidateRepository; import org.springframework.stereotype.Service; import java.util.List;
@Service public class CandidateService { private final CandidateRepository repository; public CandidateService(CandidateRepository r){repository=r;} public List<Candidate> all(){return repository.findAll();} public Candidate byId(Long id){return repository.findById(id).orElseThrow();} public Candidate save(Candidate x){return repository.save(x);} }
