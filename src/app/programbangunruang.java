package app;

import java.util.Scanner;

public class programbangunruang {
    public static void main(String[] args) {
        float sisi;
        float panjang;
        float lebar;
        float tinggi;
        float r;
        float t;
        char yn = 'n';

        Scanner Input = new Scanner(System.in);
        do{
            System.out.println("Program Luas dan Volume Bangun Ruang");
            System.out.println("1. Kubus");
            System.out.println("2. Balok");
            System.out.println("3. Tabung");
            System.out.println("Nomor ? ");
            int nomor = Input.nextInt();
            if (nomor == 1){
            
                System.out.println("Program Untuk Menghitung Luas dan Volume Kubus");
                System.out.println("Sisi ? ");
                sisi = Input.nextFloat();
                
                float Luaskubus = 6 * (sisi*sisi);
                float Volumekubus = sisi*sisi*sisi;

                System.out.println("Luas Permukaan kubus adalah : " + Luaskubus);
                System.out.println("Volume kubus adalah : " + Volumekubus);
            
            }
            if (nomor == 2){
                
                System.out.println("Program Untuk Menghitung Luas dan Volume Balok");
                System.out.println("Panjang ? ");
                panjang  = Input.nextFloat();
                System.out.println("Lebar ? ");
                lebar = Input.nextFloat();
                System.out.println("Tinggi ? ");
                tinggi = Input.nextFloat();

                float Luasbalok = 2 * (panjang*lebar + panjang*tinggi + lebar*tinggi);
                float Volumebalok = panjang*lebar*tinggi;

                System.out.println("Luas Permukaan kubus adalah : " + Luasbalok);
                System.out.println("Volume kubus adalah : " + Volumebalok);
                
            }
            if (nomor == 3){
                
                System.out.println("Jari - Jari ? ");
                r = Input.nextFloat();
                System.out.println("Tinggi ? ");
                t = Input.nextFloat();

                double Luastabung = 2 * 3.14 * r * (r + t);
                double Volumetabung = 3.14 * r * r * t;

                System.out.println("Luas Permukaan Tabung = " + Luastabung);
                System.out.println("Volume Tabung = " + Volumetabung);
            }
            System.out.println("Apakah anda ingin mengulangi lagi ? [y/n] ");
            Input.nextLine();
            String yesno = Input.nextLine();
            yn = yesno.charAt(0);
        }while(yn == 'y' || yn == 'Y');
        Input.close();
    }
}