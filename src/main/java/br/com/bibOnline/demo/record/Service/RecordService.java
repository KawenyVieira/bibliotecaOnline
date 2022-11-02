package br.com.bibOnline.demo.record.Service;


import br.com.bibOnline.demo.record.Repository.RecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.bibOnline.demo.model.Record;

import java.util.List;

@Service
public class RecordService {
    @Autowired
    private RecordRepository repository;

    public RecordService(RecordRepository repository) {
        this.repository = repository;
    }
    //CREATE
    public Record create(Record record){
        System.out.println(record.toString());
        return repository.save(record);
    }
    //READ
    public Record getById(Long idRecord){
        return repository.findById(idRecord).get();
    }
    //UPDATE
    public Record update(Record record){
        return repository.save(record);
    }
    //DELETE
    public void delete (Long idRecord){
        repository.deleteById(idRecord);
    }
    //READ LIST
    public List<Record> getAllRecord() {
        return repository.findAll();
    }
}
