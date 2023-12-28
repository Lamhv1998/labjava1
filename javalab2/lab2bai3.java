import java.util.Scanner;

public class lab2bai3 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Nhap tien klw dien ban su dung thang nay:");
        int a = scanner.nextInt();
        int money;
        if (a<=50) {
             money =  a*1000;
             
        }else{
            money=(50*1000)+((a-50)*1200);
        }
        System.out.printf("TIEN DIEN CUA BAN THANG NAY LA:%d VND",money);
        scanner.close();
    }
    
}