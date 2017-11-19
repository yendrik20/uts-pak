package com.ikanBicara;						

public class Hewan {					data yang bisa di akses umum yang berada di kelas hewan
    private String namaIkan;				data yang hanya bisa di akses nama ikan  
    private String sizeIkan;				data yang hanya bisa di akses size ikan 

    private String arahGerak;				data yang hanya bisa di akses arah gerak
    private int kecepatanGerak;				data yang hanya bisa di akses kecepatan gerak

    public Hewan(String namaIkan, String sizeIkan) {	data yang diakses hewan adalah nama ikan,zise,arah gerak,kecepatan gerak
        this.namaIkan = namaIkan;
        this.sizeIkan = sizeIkan;
        this.arahGerak = "";
        this.kecepatanGerak = 0;
    }

    public String getNamaIkan() {			fungsi supaya bisa di mengakses nama ikan
        return namaIkan;
    }

    public void setNamaIkan(String namaIkan) {		fungsi untuk mengisi nama ikan			 
        this.namaIkan = namaIkan;
    }

    public String getSizeIkan() {			fungsi supaya bisa mengakses size ikan
        return sizeIkan;
    }

    public void setSizeIkan(String sizeIkan) {		fungsi untuk mengisi size ikan
        this.sizeIkan = sizeIkan;
    }

    public String getArahGerak() {			 fungsi untuk mengakses arak gerak ikan
        return arahGerak;
    }

    public void setArahGerak(String arahGerak) {	fungsi untuk mengisi arak gerak ikan 	
        this.arahGerak = arahGerak;
    }

    public int getKecepatanGerak() {			fungsi untuk mengakses kecepatan gerak		
        return kecepatanGerak;
    }

    public void setKecepatanGerak(int kecepatanGerak) {	fungsi untuk mengisi kecepatan gerak
        this.kecepatanGerak = kecepatanGerak;
    }

    public void ikanGerak(String arahGerak){		untuk mengeluarkan perintah nama ikan + bergerak kerah +arah gerak
        System.out.println(this.getNamaIkan() + " bergerak kearah " + arahGerak);
    }

    public void kecepatanGerak(int kecepatan){		
        this.setKecepatanGerak(kecepatan);
        if(getKecepatanGerak() == 0 ){ untuk mengulang kecepatan gerak ikan
            System.out.println(this.getNamaIkan() + "Berhenti");	untuk mengeluarkan perintah nama ikan + berhenti
        }else{
            System.out.println(this.getNamaIkan()+ "Bergerah dengan kecepatan " + this.getKecepatanGerak());	untuk mengeluarkan perintah nama ikan +bergerak dengan kecepatan + kecepatan gerak
        }
    }
}
