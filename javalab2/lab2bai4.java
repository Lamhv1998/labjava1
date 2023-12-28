import java.util.Scanner;

public class lab2bai4 {
    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("1.Giai pt  bac nhat");
            System.out.println("2.Giai pt bac hai");
            System.out.println("3.Tinh tien dien");
            System.out.printf("NHAP SO DE CHON CT BAN MUON SU DUNG");
            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextInt();
            if (choice < 0 || choice > 3) {
                System.out.printf("SO BAN NHAP SAI MOI NHAP LAI");
            }
            switch (choice) {
                case 1:
                    System.out.println("Nhap gia trị cho a:");
                    int a = scanner.nextInt();
                    System.out.println("Nhap gia trị cho b:");
                    int b = scanner.nextInt();
                    int x = -b / a;
                    if (a == 0) {
                        if (b == 0) {
                            System.out.println("Phuong trinh co vo so nghiem");

                        } else {
                            System.out.println("Phuong trinh vo nghiem ");
                        }

                    } else {
                        System.out.printf("Phuong trinh co hai x=%d", x);

                    }
                    break;
                case 2:
                    System.out.println("Nhap vao gia tri cua a");
                    a = scanner.nextInt();
                    System.out.println("Nhap vao gia tri cua b");
                    b = scanner.nextInt();
                    System.out.println("Nhap vao gia tri cua c");
                    int c = scanner.nextInt();
                    double delTa = Math.pow(b, 2) - 4 * a * c;
                    if (a == 0) {
                        x = -b / a;
                        System.out.printf("Phuong trinh bac 1 co nghiem x la :%d", x);
                    } else {
                        if (delTa < 0) {
                            System.out.printf("Phuong trinh vo nghiem");
                        } else if (delTa == 0) {
                            x = -b / 2 * a;
                            System.out.printf("Phuong trinh co nghiem kep:x=%d", x);
                        } else {
                            double x1 = (-b + Math.sqrt(delTa) / (2 * a));
                            double x2 = (-b - Math.sqrt(delTa) / (2 * a));
                            System.out.println("Phuong trinh co nghiem x1=%f" + x1);
                            System.out.println("Phuong trinh co nghiem x2=%f" + x2);
                            scanner.close();
                        }
                    }
                    break;
                case 3:
                    System.out.println("Nhap tien klw dien ban su dung thang nay:");
                    a = scanner.nextInt();
                    int money;
                    if (a <= 50) {
                        money = a * 1000;

                    } else {
                        money = (50 * 1000) + ((a - 50) * 1200);
                    }
                    System.out.printf("TIEN DIEN CUA BAN THANG NAY LA:%d VND", money);
                    break;
                case 0:
                    System.out.printf("THOAT KHOI CHUONG TRINH");
                default:
                    break;
            }
        } while (choice != 0);

    }

}