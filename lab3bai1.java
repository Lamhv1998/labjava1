import java.util.Scanner;

public class lab3bai1 {
    public static void main(String[] args) {
        System.out.printf("NHAP SO BAN MUON KIEM TRA:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        boolean ok = true;
        if (number <= 0) {
            ok = false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    ok = false;
                    break;
                }

            }
        }
        if (ok) {
            System.out.printf("%d: LA SO NGUYEN TO", number);
        } else {
            System.out.printf("%d: KHONG PHAI LA LA SO NGUYEN TO", number);
        }
        scanner.close();
    }
}
