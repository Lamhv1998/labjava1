import java.util.Scanner;

/**
 * lab1
 */
public class lab1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ho va ten");
        String hoTen = scanner.nextLine();
        System.out.println("DIEMTB:");
        float diemTB = scanner.nextFloat();
        System.out.printf("Ten:%s\ndiemtb:%f\n", hoTen, diemTB);
        scanner.close();

    }
}
