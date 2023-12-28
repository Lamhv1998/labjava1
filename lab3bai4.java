import java.util.Scanner;
public class lab3bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Nhập số lượng sinh viên
        System.out.print("Nhap so luong sinh vien: ");
        int soLuong = scanner.nextInt();

        // Khởi tạo mảng sinh viên
        SinhVien[] danhSachSinhVien = new SinhVien[soLuong];

        // Nhập thông tin sinh viên
        for (int i = 0; i < soLuong; i++) {
            System.out.print("Nhap ho ten sinh vien " + (i + 1) + ": ");
            String hoTen = scanner.next();

            System.out.print("Nhap diem sinh vien " + (i + 1) + ": ");
            double diem = scanner.nextDouble();

            danhSachSinhVien[i] = new SinhVien(hoTen, diem);
        }
        // Xuất thông tin sinh viên và học lực
        System.out.println("\nThong tin sinh vien va hoc luc:");
        for (SinhVien sv : danhSachSinhVien) {
            System.out.println("Ho ten: " + sv.hoTen + ", Điem: " + sv.diem + ", Hoc luc: " + sv.layHocLuc());
        }

        // Sắp xếp danh sách sinh viên theo điểm tăng dần
        for (int i = 0; i < soLuong - 1; i++) {
            for (int j = 0; j < soLuong - i - 1; j++) {
                if (danhSachSinhVien[j].diem > danhSachSinhVien[j + 1].diem) {
                    // Hoán đổi vị trí
                    SinhVien temp = danhSachSinhVien[j];
                    danhSachSinhVien[j] = danhSachSinhVien[j + 1];
                    danhSachSinhVien[j + 1] = temp;
                }
            }
        }

        // Xuất danh sách sinh viên sau khi sắp xếp
        System.out.println("\nDanh sach sinh vien sau khi sap xep diem tang dan:");
        for (SinhVien sv : danhSachSinhVien) {
            System.out.println("Ho ten: " + sv.hoTen + ", Điem: " + sv.diem + ", Hoc luc: " + sv.layHocLuc());
            scanner.close();
        }
    }
}
