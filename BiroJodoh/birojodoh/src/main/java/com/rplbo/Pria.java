package com.rplbo;

public class Pria<Complex> {
    private String nama;
    private int usia;
    private String status;
    private double jumlahCinta;
    private Perempuan jodoh;
    private Perempuan temanKencan;

    public Pria(String nama, int umur) {
        this.nama = nama;
        this.usia = umur;
    }


    public void PDKT(Perempuan calon){
        this.temanKencan = calon;


    }

    public void MengajakKencan(Perempuan perempuan){
        this.jumlahCinta = this.jumlahCinta+1;

        if(getJodoh()!=getTemanKencan()){
            System.out.println("Jangan tidak setia! Jangan ajak cewek lain jalan!");
        }

    }
    public void MenembakKekasih(){
//        Perempuan standard = new Perempuan();
        if(this.temanKencan == null){
            System.out.println("Anda tidak punya teman kencan :(");
        }
        else if (this.getTemanKencan().getStandarJumlahCinta() < this.jumlahCinta) {
            System.out.println("Maaf Anda ditolak. Coba lagi nanti :D");
        }else if(this.jumlahCinta>this.getTemanKencan().getStandarJumlahCinta()) {
            System.out.println("Anda diterima !! Congratulations <3");
            setJodoh(this.temanKencan);
        }
//        }else if(this.temanKencan == null){
//
//        }

    }
    public void setUsia(int usia) {
        this.usia = usia;
    }

    public void setTemanKencan(Perempuan temanKencan) {
        this.temanKencan = temanKencan;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setJumlahCinta(double jumlahCinta) {
        this.jumlahCinta = jumlahCinta;
    }

    public void setJodoh(Perempuan jodoh) {
        this.jodoh = jodoh;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getStatus() {
        return status;
    }

    public int getUsia() {
        return usia;
    }

    public double getJumlahCinta() {
        return jumlahCinta;
    }

    public String getNama() {
        return nama;
    }

    public Perempuan getJodoh() {
        return jodoh;
    }

    public Perempuan getTemanKencan() {

        return temanKencan;
    }
}
