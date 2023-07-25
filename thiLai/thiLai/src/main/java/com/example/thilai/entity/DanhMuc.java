package com.example.thilai.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.Set;

@Entity
public class DanhMuc {
    @Id
    @Column(name = "id", columnDefinition = "varchar(10)")
    private String id;
    private String danhMuc;

    @JsonBackReference
    @OneToMany(mappedBy = "danhMuc", fetch = FetchType.LAZY)
    private Set<TinTuc> tinTucs;

    public DanhMuc() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDanhMuc() {
        return danhMuc;
    }

    public void setDanhMuc(String danhMuc) {
        this.danhMuc = danhMuc;
    }

    public Set<TinTuc> getTinTucs() {
        return tinTucs;
    }

    public void setTinTucs(Set<TinTuc> tinTucs) {
        this.tinTucs = tinTucs;
    }
}
