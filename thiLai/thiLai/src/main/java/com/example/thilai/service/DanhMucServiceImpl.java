package com.example.thilai.service;

import com.example.thilai.entity.DanhMuc;
import com.example.thilai.repository.DanhMucRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DanhMucServiceImpl implements DanhMucService {
    @Autowired
    private DanhMucRepository danhMucRepository;

    @Override
    public List<DanhMuc> findAll() {
        return danhMucRepository.findAll();
    }

    @Override
    public DanhMuc findById(String id) {
        return danhMucRepository.findById(id).orElse(null);
    }
}
