package com.example.thilai.service;

import com.example.thilai.entity.DanhMuc;

import java.util.List;

public interface DanhMucService {
    List<DanhMuc> findAll();

    DanhMuc findById(String id);
}
