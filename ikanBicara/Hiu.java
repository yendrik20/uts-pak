package com.ikanBicara;

public class Hiu extends Ikan {
    public Hiu(String namaIkan, String sizeIkan, String warnaIkan, String jenisIkan) {
        super(namaIkan, sizeIkan, warnaIkan, jenisIkan);
        System.out.println("Ikan baru telah dibuat atas nama " + getNamaIkan());
    }
}
