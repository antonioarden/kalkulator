package test;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
        int a, b, pilih, kalkulator= 0;
        System.out.println("Program Kalkulator Sederhana");
        System.out.println("-----------------------------");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Pembagian");
        System.out.println("4. Perkalian");
        System.out.println("5. Sisa Bagi");
        System.out.println("-----------------------------");
        
        System.out.print("pilih: ");
        pilih = input.nextInt();
        System.out.print("Masukan Angka Pertama: ");
        a = input.nextInt();
        System.out.print("Masukan Angka Kedua: ");
        b = input.nextInt();
 
        switch (pilih)
        {
            case 1 : kalkulator = a + b; break;
            case 2 : kalkulator = a - b; break;
            case 3 : kalkulator = a / b; break;
            case 4 : kalkulator = a * b; break;
            case 5 : kalkulator = a % b; break;
        }
        System.out.println("Hasilnya: " + kalkulator);
		
		


}
	
}
