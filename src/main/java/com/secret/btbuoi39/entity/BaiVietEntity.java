package com.secret.btbuoi39.entity;

import javax.persistence.*;

@Entity(name = "baiviet")
public class BaiVietEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "tieuDe")
    private String tieuDe;

    @Column(name = "noiDung")
    private String noiDung;

    @Column(name = "id_tacgia")
    private int idTacGia;

    @Column(name = "ngayViet")
    private String ngayViet;

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public int getIdTacGia() {
        return idTacGia;
    }

    public void setIdTacGia(int idTacGia) {
        this.idTacGia = idTacGia;
    }

    public void setNgayViet(String ngayViet) {
        this.ngayViet = ngayViet;
    }

    public String getNgayViet() {
        return ngayViet;
    }
}
