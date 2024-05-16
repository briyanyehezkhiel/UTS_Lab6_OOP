import java.util.Scanner;
public class no1_Kalkulator {

    private double bilangan1;
    private double bilangan2;

    // Constructor untuk menginisialisasi objek no1_Kalkulator dengan dua bilangan
    public no1_Kalkulator(double bilangan1, double bilangan2) {
        this.bilangan1 = bilangan1;
        this.bilangan2 = bilangan2;
    }

    // Method getter untuk mendapatkan nilai bilangan1
    public double getBilangan1() {
        return bilangan1;
    }

    // Method setter untuk mengubah nilai bilangan1
    public void setBilangan1(double bilangan1) {
        this.bilangan1 = bilangan1;
    }

    // Method getter untuk mendapatkan nilai bilangan2
    public double getBilangan2() {
        return bilangan2;
    }

    // Method setter untuk mengubah nilai bilangan2
    public void setBilangan2(double bilangan2) {
        this.bilangan2 = bilangan2;
    }

    // Method overloading untuk operasi penjumlahan
    public double hitungJumlah() {
        return bilangan1 + bilangan2;
    }

    public double hitungJumlah(double bilangan3) {
        return bilangan1 + bilangan2 + bilangan3;
    }

    // Method overriding untuk operasi pengurangan
    public double hitungKurang() {
        return bilangan1 - bilangan2;
    }

    // Method untuk operasi perkalian
    public double hitungKali() {
        return bilangan1 * bilangan2;
    }

    // Method untuk operasi pembagian
    public double hitungBagi() {
        return bilangan1 / bilangan2;
    }

    // Method main untuk menjalankan program
    public static void main(String[] args) {
        // Mendapatkan masukan dari user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan bilangan pertama: ");
        double bilangan1 = scanner.nextDouble();
        System.out.print("Masukkan bilangan kedua: ");
        double bilangan2 = scanner.nextDouble();

        // Membuat objek no1_Kalkulator
        no1_Kalkulator kalkulator = new no1_Kalkulator(bilangan1, bilangan2);

        // Menampilkan hasil operasi
        System.out.println("Hasil penjumlahan: " + kalkulator.hitungJumlah());
        System.out.println("Hasil pengurangan: " + kalkulator.hitungKurang());
        System.out.println("Hasil perkalian: " + kalkulator.hitungKali());
        System.out.println("Hasil pembagian: " + kalkulator.hitungBagi());
    }
}
