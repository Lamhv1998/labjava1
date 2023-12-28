import java.util.Arrays;
import java.util.Scanner;

public class lab3bai3 {
    public static void main(String[] args) {
        int number;
        System.out.println("NHAP SO PHAN TU MUON TAO CHO MANG ");
        Scanner scanner=new Scanner(System.in);
        number=scanner.nextInt();
        int aRray[]  = new int[number];
        
         System.out.println("NHAP CAC PHAN TU MUON DUA VAO MANG: ");
         for(int i=0;i<aRray.length;i++){
            aRray[i]= scanner.nextInt();
         } 
            Arrays.sort(aRray);
            int mIn = aRray[0];
            System.out.println("MANG SAU KHI SAP XEP: " + Arrays.toString(aRray));
            System.out.println("GIA TRI NHO NHAT LA: " +mIn);   
            scanner.close();    
    }
}


