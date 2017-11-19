package com.ikanBicara;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int pilihanMenu;
        String namaIkan, sizeIkan, warnaIkan, jenisIkan;
        Scanner inputUser = new Scanner(System.in);
        String arahGerak;
        int kecepatanGerak;

        System.out.println("Tugas UTS Pak Bilal");
        System.out.println("Program membuat object Ikan");
        System.out.println("Masukkan nama Ikan :");
        namaIkan = inputUser.next();
        System.out.println("Masukkan Ukuran Ikan : (Small, Medium, Big, Monster)");
        sizeIkan = inputUser.next();
        System.out.println("Masukkan Warna Ikan : ");
        warnaIkan = inputUser.next();
        System.out.println("Masukkan Jenis Ikan : ");
        jenisIkan = inputUser.next();
        Hiu ikanBaru = new Hiu(namaIkan, sizeIkan, warnaIkan, jenisIkan);

        System.out.println("Pilih salah satu :\n" +
                "1. Bergerak\n" +
                "2. Berhenti\n" +
                "3. Keluar Aplikasi\n" +
                "Masukkan pilihan anda :");
        pilihanMenu = inputUser.nextInt();
        do {
            if (pilihanMenu == 1) {
                System.out.println("Masukkan arah gerak : ");
                ikanBaru.setArahGerak(arahGerak = inputUser.next());
                System.out.println("Dengan kecepatan : ");
                ikanBaru.setKecepatanGerak(kecepatanGerak = inputUser.nextInt());
                do {
                    pilihanMenu = 0;
                    System.out.println(
                            "1. Ganti arah\n" +
                                    "2. Ubah kecepatan\n" +
                                    "3. Keadaan sekarang\n" +
                                    "4. Keluar\n" +
                                    "Masukkan pilihan anda.");
                    pilihanMenu = inputUser.nextInt();
                    if (pilihanMenu == 1) {
                        System.out.println("Masukkan Arah baru : ");
                        String arahBaru = inputUser.next();
                        ikanBaru.gantiArah(arahBaru);
                    } else if (pilihanMenu == 2) {
                        System.out.println("Masukkan Kecepatan baru : ");
                        int kecepatanBaru = inputUser.nextInt();
                        ikanBaru.gantiKecepatan(kecepatanBaru);
                    } else if (pilihanMenu == 3) {
                        ikanBaru.keadaanSekarang();
                    }else if (pilihanMenu == 4) {
                        return;
                    }

                } while (pilihanMenu != 4);
            } else if (pilihanMenu == 2) {
                ikanBaru.berhenti();
            }
        } while (pilihanMenu != 3);

    }
}
