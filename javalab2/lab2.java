import java.util.Scanner;

public class lab2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
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
        scanner.close();
    }
}