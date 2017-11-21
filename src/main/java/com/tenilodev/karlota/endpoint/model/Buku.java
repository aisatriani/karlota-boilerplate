package com.tenilodev.karlota.endpoint.model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by azisa on 11/21/2017.
 */
@DatabaseTable(tableName = "buku")
public class Buku {
    @DatabaseField( generatedId = true)
    private long id;
    @DatabaseField
    private String judul;
    @DatabaseField
    private String deskripsi;

    public long getId() {
        return id;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

}
