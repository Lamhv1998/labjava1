import java.util.Scanner;

public class lab1bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap gia tri a:");
        double a =scanner.nextDouble();
        System.out.println("Nhap gia tri b:");
        double b =scanner.nextDouble();
        System.out.println("Nhap gia tri c:");
        double c =scanner.nextDouble();
        double delTa;
        delTa =Math.pow(b,2)-4*a*c;
        if (delTa<0) {
            System.out.println("Phuong trinh vo nghiem vi delta < 0.");
        }else{
            double canDelta = Math.sqrt(delTa);
            System.out.println("Delta = " + delTa);
            System.out.println("Can delta = " + canDelta);
        }
    
    
    }
}

