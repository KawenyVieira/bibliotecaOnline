package br.com.bibOnline.demo.record.Controller;


import br.com.bibOnline.demo.record.Service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import br.com.bibOnline.demo.model.Record;

import java.util.List;

@RestController
public class RecordController {
    @Autowired
    private RecordService recordService;

    //READ LIST...
    @GetMapping("/record/list")
    public List<Record> getAllRecord() {
        return recordService.getAllRecord();
    }
    //READ
    @GetMapping("/record/{idRecord}")
    public Record getById(@PathVariable("idRecord") long idRecord) {
        Record response = recordService.getById(idRecord);
        return response;
    }
    //CREATE
    @PostMapping("/record")
    public Record create(@RequestBody final Record record) {
        return recordService.create(record);
    }
    //UPDATE
    @PutMapping("/record")
    public Record update(@RequestBody Record record){
        return recordService.update(record);
    }
    //DELETE
    @DeleteMapping("/record/{idRecord}")
    public void delete(@PathVariable("idRecord") long idRecord) {
        recordService.delete(idRecord);
    }
}
