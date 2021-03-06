package com.sqa.nhom15.SQANhom15.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "monhoc")
public class MonHoc {

    @Id
    @Column(name = "ma_monhoc")
    private String maMonHoc;

    @Column(name = "ten_monhoc")
    private String tenMonHoc;

    @Column(name = "so_tc")
    private int soTC;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "cauhinhdiem_ma_cauhinh")
    private CauHinhDiem cauHinhDiem;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "monHoc")
    private List<NhomMonHoc> nhomMonHocs;

    public MonHoc() {

    }

    public MonHoc(String maMonHoc, String tenMonHoc, int soTC, CauHinhDiem cauHinhDiem, List<NhomMonHoc> nhomMonHocs) {
        this.maMonHoc = maMonHoc;
        this.tenMonHoc = tenMonHoc;
        this.soTC = soTC;
        this.cauHinhDiem = cauHinhDiem;
        this.nhomMonHocs = nhomMonHocs;
    }

    public String getMaMonHoc() {
        return maMonHoc;
    }

    public void setMaMonHoc(String maMonHoc) {
        this.maMonHoc = maMonHoc;
    }

    public String getTenMonHoc() {
        return tenMonHoc;
    }

    public void setTenMonHoc(String tenMonHoc) {
        this.tenMonHoc = tenMonHoc;
    }

    public int getSoTC() {
        return soTC;
    }

    public void setSoTC(int soTC) {
        this.soTC = soTC;
    }

    public CauHinhDiem getCauHinhDiem() {
        return cauHinhDiem;
    }

    public void setCauHinhDiem(CauHinhDiem cauHinhDiem) {
        this.cauHinhDiem = cauHinhDiem;
    }

    public List<NhomMonHoc> getNhomMonHocs() {
        return nhomMonHocs;
    }

    public void setNhomMonHocs(List<NhomMonHoc> nhomMonHocs) {
        this.nhomMonHocs = nhomMonHocs;
    }

}
