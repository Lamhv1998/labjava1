import java.util.Scanner;

public class lab4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so luong san pham:");
        int n = scanner.nextInt();

        // Tạo mảng để lưu trữ nhiều sản phẩm
        SanPham[] sanPhams = new SanPham[n];

        // Nhập thông tin cho từng sản phẩm
        for (int i = 0; i < n; i++) {
            sanPhams[i] = new SanPham();
            sanPhams[i].nhap();
        }

        // Xuất thông tin cho từng sản phẩm
        for (int i = 0; i < n; i++) {
            sanPhams[i].xuat();
        }

        // Đóng Scanner sau khi hoàn thành
        scanner.close();
    }
}
