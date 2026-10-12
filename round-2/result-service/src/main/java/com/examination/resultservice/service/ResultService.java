package com.examination.resultservice.service;
import com.examination.resultservice.model.Result; import com.examination.resultservice.repository.ResultRepository; import org.springframework.stereotype.Service; import java.util.List;
@Service public class ResultService { private final ResultRepository repository; public ResultService(ResultRepository r){repository=r;} public List<Result> all(){return repository.findAll();} public Result byId(Long id){return repository.findById(id).orElseThrow();} public Result save(Result x){return repository.save(x);} }
