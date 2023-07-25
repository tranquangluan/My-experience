package com.example.thilai.service;

import com.example.thilai.entity.TinTuc;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface TinTucService {
    void create(TinTuc tinTuc);
    TinTuc findById(String id);
    void delete(String id);
    List<TinTuc> findAll();
    List<TinTuc> findAllByTieuDeContaining(String tieuDde);
    List<TinTuc> findAllByTieuDeContainingAndDanhMuc_Id(String tieuDde, String danhMuc);


}
