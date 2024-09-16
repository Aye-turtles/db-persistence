package org.ayeturtles.dbpersistence.service.impl;

import org.ayeturtles.dbpersistence.dto.Records;
import org.ayeturtles.dbpersistence.entities.records.RecordsReq;
import org.ayeturtles.dbpersistence.entities.records.RecordsRes;
import org.ayeturtles.dbpersistence.mapper.RecordMapper;
import org.ayeturtles.dbpersistence.repository.RecordRepository;
import org.ayeturtles.dbpersistence.service.IRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RecordServiceImpl implements IRecordService {
    @Autowired
    private RecordRepository repository;
    @Autowired
    private RecordMapper mapper;

    @Override
    public Page<RecordsRes> getRecords(Pageable pageable) {
        return repository.findAll(pageable).map(mapper::toRes);
    }

    @Override
    public RecordsRes getRecordById(Integer id) {
        return mapper.toRes(repository.getReferenceById(id));
    }

    @Override
    public RecordsRes createRecord(RecordsReq RecordsReq) {
        Records res = repository.saveAndFlush(mapper.toDto(RecordsReq));
        return mapper.toRes(res);
    }

    @Override
    public RecordsRes updateRecord(RecordsReq RecordsReq) {
        Records res = repository.saveAndFlush(mapper.toDto(RecordsReq));
        return mapper.toRes(res);
    }

    @Override
    public void deleteRecord(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public List<RecordsRes> getRecords() {
        return repository.findAll().stream().map(mapper::toRes).collect(Collectors.toList());
    }
}
