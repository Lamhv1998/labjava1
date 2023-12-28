import java.util.Scanner;

public class lab1bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap do dai cua canh khoi lap phuong:");
        float dodaiCanh;
        dodaiCanh = scanner.nextFloat();
        // float theTich;
        // theTich=dodaiCanh*dodaiCanh*dodaiCanh;
        double theTich = Math.pow(dodaiCanh, 3);
        System.out.printf("TT KHOI LAP PHUONG LA:%.2f", theTich);
        scanner.close();
    }
}
