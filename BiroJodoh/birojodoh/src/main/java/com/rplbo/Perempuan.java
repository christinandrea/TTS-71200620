package com.rplbo;

public class Perempuan {
    private String nama;
    private int usia;
    private String status;
    private double jumlahCinta;
    private Pria jodoh;
    private Pria temanKencan;
    private double standarJumlahCinta;

    public Perempuan(String nama, int umur, double standarJumlahCinta) {
        this.nama = nama;
        this.usia = umur;
        this.standarJumlahCinta = standarJumlahCinta;
    }

    public Perempuan() {

    }

    public void MengajakKencan(Pria pria){

        this.jumlahCinta += 0.5;

        if(pria.getTemanKencan().equals(this.temanKencan)){
            System.out.println("Selamat menempuh hidup baru, "+this.nama+"!");
        }else{
            System.out.println("Jangan tidak setia! Jangan ajak cowok lain jalan!");
        }
    }

    public String getNama() {
        return nama;
    }

    public double getJumlahCinta() {
        return jumlahCinta;
    }

    public double getStandarJumlahCinta() {
        return standarJumlahCinta;
    }

    public int getUsia() {
        return usia;
    }

    public Pria getJodoh() {
        return jodoh;
    }

    public Pria getTemanKencan() {
        return temanKencan;
    }

    public String getStatus() {
        return status;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setJodoh(Pria jodoh) {
        this.jodoh = jodoh;
    }

    public void setJumlahCinta(double jumlahCinta) {
        this.jumlahCinta = jumlahCinta;
    }

    public void setStandarJumlahCinta(double standarJumlahCinta) {
        this.standarJumlahCinta = standarJumlahCinta;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setTemanKencan(Pria temanKencan) {
        this.temanKencan = temanKencan;
    }

    public void setUsia(int usia) {
        this.usia = usia;
    }


}
