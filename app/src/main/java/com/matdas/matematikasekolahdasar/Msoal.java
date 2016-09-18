package com.matdas.matematikasekolahdasar;

/**
 * Created by VAPN on 9/15/2016.
 */
public class Msoal {
    private String id;
    private String kelas;
    private String soal;
    private String jawaban_a;
    private String jawaban_b;
    private String jawaban_c;
    private String jawaban_d;
    private String jawaban_benar;
    private String berkas_1;
    private String berkas_2;
    private String tipe;

    public Msoal(String id,String kelas,String soal,String jawaban_a,String jawaban_b,String jawaban_c,String jawaban_d,String jawaban_benar,String berkas_1,String berkas_2,String tipe){
        this.setId(id);
        this.setKelas(kelas);
        this.setSoal(soal);
        this.setJawaban_a(jawaban_a);
        this.setJawaban_b(jawaban_b);
        this.setJawaban_c(jawaban_c);
        this.setJawaban_d(jawaban_d);
        this.setJawaban_benar(jawaban_benar);
        this.setBerkas_1(berkas_1);
        this.setBerkas_2(berkas_2);
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

    public String getSoal() {
        return soal;
    }

    public void setSoal(String soal) {
        this.soal = soal;
    }

    public String getJawaban_a() {
        return jawaban_a;
    }

    public void setJawaban_a(String jawaban_a) {
        this.jawaban_a = jawaban_a;
    }

    public String getJawaban_b() {
        return jawaban_b;
    }

    public void setJawaban_b(String jawaban_b) {
        this.jawaban_b = jawaban_b;
    }

    public String getJawaban_c() {
        return jawaban_c;
    }

    public void setJawaban_c(String jawaban_c) {
        this.jawaban_c = jawaban_c;
    }

    public String getJawaban_d() {
        return jawaban_d;
    }

    public void setJawaban_d(String jawaban_d) {
        this.jawaban_d = jawaban_d;
    }

    public String getJawaban_benar() {
        return jawaban_benar;
    }

    public void setJawaban_benar(String jawaban_benar) {
        this.jawaban_benar = jawaban_benar;
    }

    public String getBerkas_1() {
        return berkas_1;
    }

    public void setBerkas_1(String berkas_1) {
        this.berkas_1 = berkas_1;
    }

    public String getBerkas_2() {
        return berkas_2;
    }

    public void setBerkas_2(String berkas_2) {
        this.berkas_2 = berkas_2;
    }

    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }
}
