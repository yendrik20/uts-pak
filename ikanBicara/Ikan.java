package com.ikanBicara;

public class Ikan extends Hewan{
    private String warnaIkan;
    private String jenisIkan;

    public Ikan(String namaIkan, String sizeIkan, String warnaIkan, String jenisIkan) {
        super(namaIkan, sizeIkan);
        this.warnaIkan = warnaIkan;
        this.jenisIkan = jenisIkan;
    }

    public void gantiArah(String arahBaru){
        System.out.println("Semula bergerak kearah " + this.getArahGerak() + "\nSekarang bergerak kearah " + arahBaru);
        this.setArahGerak(arahBaru);
    }

    public void gantiKecepatan(int kecepatanBaru){
        System.out.println("Semula bergerak dengan kecepatan " + this.getKecepatanGerak() + "\nSekarang bergerak dengan kecepatan " + kecepatanBaru);
        this.setKecepatanGerak(kecepatanBaru);
    }

    public void berhenti(){
        this.setKecepatanGerak(0);
        this.setArahGerak("Diam");
        System.out.println("Ikan sekarang berada pada posisi " + this.getArahGerak() + "dengan kecepatan " + getKecepatanGerak());
    }

    public void keadaanSekarang(){
        System.out.println("Ikan sekarang berada pada posisi " + this.getArahGerak() + "dengan kecepatan " + getKecepatanGerak());

    }
}
