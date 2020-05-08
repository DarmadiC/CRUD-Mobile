package umn.ac.modul14;

import com.google.gson.annotations.SerializedName;

public class Mahasiswa {
    @SerializedName("NIM") private String NIM;
    @SerializedName("Nama") private String Nama;
    @SerializedName("Jurusan") private String Jurusan;
    @SerializedName("Jenis_Kelamin") private String Kelamin;


    public Mahasiswa(String NIM, String nama, String jurusan, String kelamin) {
        this.NIM = NIM;
        this.Nama = nama;
        this.Jurusan = jurusan;
        this.Kelamin = kelamin;
    }

    public String getNIM() {
        return NIM;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String nama) {
        this.Nama = nama;
    }

    public String getJurusan() {
        return Jurusan;
    }

    public void setJurusan(String jurusan) {
        this.Jurusan = jurusan;
    }

    public String getKelamin() {
        return Kelamin;
    }

    public void setKelamin(String kelamin) {
        this.Kelamin = kelamin;
    }
}
