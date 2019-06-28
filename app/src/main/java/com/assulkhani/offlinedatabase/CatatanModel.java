package com.assulkhani.offlinedatabase;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class CatatanModel extends RealmObject {
    @PrimaryKey
    private String id;
    private String judul;
    private String jumlah;
    private String tanggal;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getJumlah() {
        return jumlah;
    }

    public void setJumlah(String jumlah) {
        this.jumlah = jumlah;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }
}
