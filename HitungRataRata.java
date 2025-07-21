import java.util.InputMismatchException;
import java.util.Scanner;

public class HitungRataRata {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bilangan1, bilangan2, bilangan3;
        
        System.out.println("=== Program Hitung Rata-rata ===");
        
        
        bilangan1 = inputBilanganBulat(input, "pertama");
        
        
        bilangan2 = inputBilanganBulat(input, "kedua");
        
        
        bilangan3 = inputBilanganBulat(input, "ketiga");
        
        
        double rataRata = (bilangan1 + bilangan2 + bilangan3) / 3.0;
        
        
        System.out.println("\n=== HASIL ===");
        System.out.println("Bilangan yang dimasukkan: " + bilangan1 + ", " + bilangan2 + ", " + bilangan3);
        System.out.println("Rata-rata: " + rataRata);
        
        
        input.close();
    }
    
    
    public static int inputBilanganBulat(Scanner input, String urutan) {
        int bilangan = 0;
        boolean validInput = false;
        
        while (!validInput) {
            try {
                System.out.print("Masukkan bilangan bulat " + urutan + ": ");
                bilangan = input.nextInt();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("ERROR: Input tidak valid! Harap masukkan bilangan bulat.");
                input.next();
            }
        }
        
        return bilangan;
    }
}