package com.example.thilai.repository;

import com.example.thilai.entity.TinTuc;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TinTucRepository extends JpaRepository<TinTuc, String> {
    List<TinTuc> findAllByTieuDeContaining(String tieuDe);
    List<TinTuc> findAllByTieuDeContainingAndDanhMuc_Id(String tieuDe, String danhMuc);


}
