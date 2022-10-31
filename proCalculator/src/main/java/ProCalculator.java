
import java.util.Scanner;


public class ProCalculator {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("vize1: ");
        int vize1 = scanner.nextInt();
        System.out.print("vize2: ");
        int vize2 = scanner.nextInt();
        System.out.println("final: ");
        int finalNotu = scanner.nextInt();
        System.out.print("Okul ortalamanız: ");
        double ortalama = scanner.nextDouble();
        
        double toplam = (vize1 * 3 / 10.0) + (vize2 * 3 / 10.0) + (finalNotu * 4 / 10.0);
        
        if (toplam > 90) {
            System.out.println("AA");
        }
        
        else if (toplam >= 85) {
            System.out.println("BA");
        }
        
        else if (toplam >= 80) {
            System.out.println("BB");
        }
        
        else if (toplam >= 75) {
            System.out.println("CB");
        }
        
        else if (toplam >= 70) {
            System.out.println("CC");
        }
        
        else if (toplam >= 65) {
            System.out.println("CD aldınız");
        }
        
        else if (toplam >= 60) {
            System.out.println("DD");
            
            if (ortalama < 2.50) {
                System.out.println("this lesson is so bad your point is below the 2.50 you should study more for this lesson");
            }
        }
        
        else{
            System.out.println("başını aldınız");
        }
    }
}
