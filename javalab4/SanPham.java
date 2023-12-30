import java.util.Scanner;

public class SanPham {
    private String tenSP;
    private double donGia;
    private double giamGia;
   
    public SanPham() {
        // SanPham sp = new SanPham();
    }

    public SanPham(String tenSP,double donGia,double giamGia){
        this.tenSP = tenSP;
        this.donGia =donGia;
        this.giamGia  = giamGia;
    }

    // Hàm tạo thứ 2
    public SanPham(String tenSp, double donGia) {
        this(tenSp, donGia, 0);    
    }
    private double getThueNhapKhau() {
        return 0.1 * this.donGia;
    }
   
void xuat(){
    System.out.println("Ten san pham:"+tenSP);
    System.out.println("Don gia:"+donGia);
    System.out.println("Giam gia:"+giamGia);
    System.out.println("Thue nhap khau:"+getThueNhapKhau());

}
void nhap(){
   
    Scanner scanner = new Scanner(System.in);
    System.out.println("TEN SAN PHAM");
    tenSP=scanner.nextLine();
    System.out.println("DON GIA");
    donGia=scanner.nextDouble();
    System.out.println("Giam gia");
    giamGia=scanner.nextDouble();
    scanner.close();
    
}   
 public String getTenSp() {
        return tenSP;
    }

    public void setTenSp(String tenSp) {
        this.tenSP = tenSp;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public double getGiamGia() {
        return giamGia;
    }

    public void setGiamGia(double giamGia) {
        this.giamGia = giamGia;
    }
}