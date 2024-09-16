package org.ayeturtles.dbpersistence.service;

import org.ayeturtles.dbpersistence.entities.records.RecordsReq;
import org.ayeturtles.dbpersistence.entities.records.RecordsRes;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IRecordService {
    Page<RecordsRes> getRecords(Pageable pageable);
    RecordsRes getRecordById(Integer id);
    RecordsRes createRecord(RecordsReq nestReq);
    RecordsRes updateRecord(RecordsReq nestReq);
    void deleteRecord(Integer id);

    List<RecordsRes> getRecords();
}
