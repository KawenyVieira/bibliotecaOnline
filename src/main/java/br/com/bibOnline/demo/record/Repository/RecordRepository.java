package br.com.bibOnline.demo.record.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.bibOnline.demo.model.Record;

@Repository
public interface RecordRepository extends JpaRepository<Record, Long> {

}
