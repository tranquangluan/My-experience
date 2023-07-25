package com.example.thilai.service;

import com.example.thilai.entity.TinTuc;
import com.example.thilai.repository.TinTucRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TinTucServiceImpl implements TinTucService{
    @Autowired
    private TinTucRepository tinTucRepository;
    @Override
    public void create(TinTuc tinTuc) {
        tinTucRepository.save(tinTuc);
    }

    @Override
    public TinTuc findById(String id) {
        return  tinTucRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(String id) {
        tinTucRepository.deleteById(id);
    }

    @Override
    public List<TinTuc> findAll() {
        return tinTucRepository.findAll();
    }

    @Override
    public List<TinTuc> findAllByTieuDeContaining(String tieuDde) {
        return tinTucRepository.findAllByTieuDeContaining(tieuDde);
    }

    @Override
    public List<TinTuc> findAllByTieuDeContainingAndDanhMuc_Id(String tieuDde, String danhMuc) {
        return tinTucRepository.findAllByTieuDeContainingAndDanhMuc_Id(tieuDde,danhMuc);
    }
}
