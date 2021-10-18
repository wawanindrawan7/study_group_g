package case1_potongan_harga;

import java.util.Scanner;

public class Project_1 {

    public static void main(String[] args) {
        double total_belanja, bayar;
        String kartu_member;

        Scanner input = new Scanner(System.in);
        System.out.print("Total belanja : ");
        total_belanja = input.nextDouble();

        if (total_belanja >= 2000) {
            System.out.print("Ada kartu member atau tidak : ");
            kartu_member = input.next();
            if (kartu_member.equalsIgnoreCase("ada")) {
                bayar = total_belanja - 1500;
            } else {
                bayar = total_belanja - 1000;
            }
        } else {
            bayar = total_belanja - 0;
        }

        System.out.println("=========== Struk Belanja ==========");
        System.out.println("Total Belanja = " + total_belanja);
        System.out.println("Total Bayar = " + bayar);

    }

}
