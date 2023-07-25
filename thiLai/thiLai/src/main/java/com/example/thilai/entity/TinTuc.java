package com.example.thilai.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
public class TinTuc {
    @Id
    @Column(name = "id", columnDefinition = "varchar(10)")
    //@Pattern(regexp = "ST-\\d{3}", message = "{create.id}")
    private String id;
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "danhMuc", referencedColumnName = "id")
    private DanhMuc danhMuc;

    @Size(max=50, message = "Qua 50 ki tu")
    private String tieuDe;

    @Size(max=500, message = "Qua 500 ki tu")
    private String noiDung;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date ngayDangTin;

    @NotEmpty(message = "khong de trong")
    private String phongVien;

    public TinTuc() {
    }

    public TinTuc(String id, DanhMuc danhMuc, String tieuDe, String noiDung, Date ngayDangTin, String phongVien) {
        this.id = id;
        this.danhMuc = danhMuc;
        this.tieuDe = tieuDe;
        this.noiDung = noiDung;
        this.ngayDangTin = ngayDangTin;
        this.phongVien = phongVien;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTieuDe() {
        return tieuDe;
    }

    public void setTieuDe(String tieuDe) {
        this.tieuDe = tieuDe;
    }

    public String getNoiDung() {
        return noiDung;
    }

    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }

    public Date getNgayDangTin() {
        return ngayDangTin;
    }

    public void setNgayDangTin(Date ngayDangTin) {
        this.ngayDangTin = ngayDangTin;
    }

    public String getPhongVien() {
        return phongVien;
    }

    public void setPhongVien(String phongVien) {
        this.phongVien = phongVien;
    }

    public DanhMuc getDanhMuc() {
        return danhMuc;
    }

    public void setDanhMuc(DanhMuc danhMuc) {
        this.danhMuc = danhMuc;
    }
}
