import java.util.Scanner;

public class lab2bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao gia tri cua a");
        int a = scanner.nextInt(); 
        System.out.println("Nhap vao gia tri cua b");
        int b = scanner.nextInt(); 
        System.out.println("Nhap vao gia tri cua c");
        int c = scanner.nextInt();
        
        double delTa = Math.pow(b,2)-4*a*c;
        if (a==0) { 
            int x =-b/a;
            System.out.printf("Phuong trinh bac 1 co nghiem x la :%d",x);
        }else{
            if (delTa<0) {
                    System.out.printf("Phuong trinh vo nghiem");
            }else if ( delTa==0) {
                int x = -b/2*a;
            System.out.printf("Phuong trinh co nghiem kep:x=%d",x);
            }else{
                double x1=(-b+Math.sqrt(delTa)/(2*a));
                double x2=(-b-Math.sqrt(delTa)/(2*a));
                System.out.println("Phuong trinh co nghiem x1=%f"+x1);
                System.out.println("Phuong trinh co nghiem x2=%f"+x2);
                scanner.close();
            }
        }
        






    scanner.close();
    }
    
}
