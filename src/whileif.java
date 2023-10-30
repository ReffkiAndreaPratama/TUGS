import java.util.Scanner;

public class whileif {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int angka = 0;
        int count = 0;

        while (angka != -1) {
            System.out.println("Masukkan angka (-1 untuk berhenti): ");
            angka = scanner.nextInt();

            if (angka != -1) {
                count++;

                if (angka % 2 == 0) {
                    System.out.println(angka + " adalah genap.");
                } else {
                    System.out.println(angka + " adalah ganjil.");
                }
            }
        }

        System.out.println("Total angka yang diinputkan: " + count);
    }
}

//created by tama (reffki andrea pratama [G1A023039]