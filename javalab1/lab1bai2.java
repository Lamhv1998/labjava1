import java.util.Scanner;

public class lab1bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chieu dai:");
        float chieuDai = scanner.nextFloat();
        System.out.println("Nhap chieu rong");
        float chieuRong = scanner.nextFloat();
        float chuVi;
        chuVi = (chieuDai + chieuRong) * 2;
        float dienTich;
        dienTich = chieuDai * chieuRong;
        float canhnhoNhat = Math.min(chieuDai, chieuRong);
        System.out.printf("Chu vi hinh chu nhat la:%.2f\n", chuVi);
        System.out.printf("Dien tich hinh chu nhat la:%.2f\n", dienTich);
        System.out.printf("Canh nho nhat cua hinh cn la:%.2f", canhnhoNhat);
        scanner.close();
    }
}
