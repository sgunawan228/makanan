package com.example.aplikasimobilebagon;

public class makanan {
    private String nama;
    private String deskripsi;
    private String harga;
    private String gambar;

    public makanan(String nama, String deskripsi, String harga, String gambar){
        this.nama = nama;
        this.deskripsi = deskripsi;
        this.harga = harga;
        this.gambar = gambar;
    }

    public String getNama(){
        return nama;
    }

    public String getDeskripsi(){
        return deskripsi;
    }

    public String getHarga(){
        return harga;
    }

    public String getGambar(){
        return gambar;
    }
}
