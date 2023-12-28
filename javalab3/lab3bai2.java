import java.util.Scanner;

public class lab3bai2 {
    public static void main(String[] args) {
        System.out.print("NHAP SO CUU CHUONG BAN MUON TRA CUU: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        
        for (int i = 1; i <= 10; i++) {
            int result = number * i;
            System.out.printf("%d x %d = %d%n", number, i, result);
        }
        scanner.close();
    }
};
