package com.matdas.matematikasekolahdasar;

/**
 * Created by VAPN on 9/6/2016.
 */
public class Mbelajar {
    private String id;
    private String kelas;
    private String judul;
    private String pembahasan;
    private String berkas1;
    private String berkas2;
    private String tipe;

    public Mbelajar(String id, String kelas, String judul, String pembahasan, String berkas1, String berkas2, String tipe){
        this.setId(id);
        this.setKelas(kelas);
        this.setJudul(judul);
        this.setPembahasan(pembahasan);
        this.setBerkas1(berkas1);
        this.setBerkas2(berkas2);
        this.setTipe(tipe);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPembahasan() {
        return pembahasan;
    }

    public void setPembahasan(String pembahasan) {
        this.pembahasan = pembahasan;
    }

    public String getBerkas1() {
        return berkas1;
    }

    public void setBerkas1(String berkas1) {
        this.berkas1 = berkas1;
    }

    public String getBerkas2() {
        return berkas2;
    }

    public void setBerkas2(String berkas2) {
        this.berkas2 = berkas2;
    }

    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }
}
