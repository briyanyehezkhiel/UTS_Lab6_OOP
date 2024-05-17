import java.util.Scanner;

public class no2_Palindrome {
    // Metode untuk memeriksa apakah sebuah string adalah palindrom
    public static boolean isPalindrome(String str) {
        // Menghilangkan semua spasi dan mengubah ke huruf kecil untuk pemeriksaan yang tidak peka huruf besar/kecil
        String cleanStr = str.replaceAll("\\s+", "").toLowerCase();
        
        // Inisialisasi dua pointer
        int left = 0;
        int right = cleanStr.length() - 1;

        // Memeriksa kesamaan karakter dari depan dan belakang
        while (left < right) {
            if (cleanStr.charAt(left) != cleanStr.charAt(right)) {
                return false; // Jika ada karakter yang tidak sama, bukan palindrom
            }
            left++;
            right--;
        }

        return true; // Jika semua karakter sama, adalah palindrom
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan sebuah string
        System.out.println("Masukkan sebuah string untuk memeriksa apakah itu palindrom:");
        String input = scanner.nextLine();

        // Memeriksa apakah input adalah palindrom
        boolean result = isPalindrome(input);

        // Menampilkan hasil
        if (result) {
            System.out.println("String \"" + input + "\" adalah palindrom.");
        } else {
            System.out.println("String \"" + input + "\" bukan palindrom.");
        }
        scanner.close();
    }
}
