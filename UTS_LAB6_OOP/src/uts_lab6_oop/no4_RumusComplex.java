class Fisika {
    // Constructor untuk perhitungan Fisika
    public Fisika() {
        // Constructor kosong
    }

    // Metode overload untuk menghitung energi kinetik: EK = 0.5 * m * v^2
    public double hitungEnergiKinetik(double massa, double kecepatan) {
        return 0.5 * massa * kecepatan * kecepatan;
    }

    // Metode overload untuk menghitung energi potensial gravitasi: EP = m * g * h
    public double hitungEnergiPotensial(double massa, double gravitasi, double tinggi) {
        return massa * gravitasi * tinggi;
    }

    // Metode overload untuk menghitung hukum Ohm: V = I * R
    public double hitungTegangan(double arus, double resistansi) {
        return arus * resistansi;
    }
}

class Matematika {
    // Constructor untuk perhitungan Matematika
    public Matematika() {
        // Constructor kosong
    }

    // Metode overload untuk menghitung luas persegi panjang: L = p * l
    public double hitung(double panjang, double lebar) {
        return panjang * lebar;
    }

    // Metode overload untuk menghitung luas lingkaran: L = π * r^2
    public double hitungLuasLingkaran(double jariJari) {
        return Math.PI * jariJari * jariJari;
    }

    // Metode overload untuk menghitung volume kubus: V = s^3
    public double hitungVolumeKubus(double sisi) {
        return Math.pow(sisi, 3);
    }

    // Metode overload untuk menghitung volume silinder: V = π * r^2 * t
    public double hitungVolumeSilinder(double jariJari, double tinggi) {
        return Math.PI * Math.pow(jariJari, 2) * tinggi;
    }
}

public class no4_RumusComplex {
    public static void main(String[] args) {
        // Membuat objek dari kelas Fisika
        Fisika fisika = new Fisika();
        // Menghitung energi kinetik
        double energiKinetik = fisika.hitungEnergiKinetik(10, 5); // massa = 10 kg, kecepatan = 5 m/s
        System.out.println("Energi Kinetik: " + energiKinetik + " Joule");

        // Menghitung energi potensial gravitasi
        double energiPotensial = fisika.hitungEnergiPotensial(10, 9.8, 20); // massa = 10 kg, gravitasi = 9.8 m/s^2, tinggi = 20 m
        System.out.println("Energi Potensial Gravitasi: " + energiPotensial + " Joule");

        // Menghitung tegangan menggunakan hukum Ohm
        double tegangan = fisika.hitungTegangan(2, 5); // arus = 2 A, resistansi = 5 ohm
        System.out.println("Tegangan: " + tegangan + " Volt");

        // Membuat objek dari kelas Matematika
        Matematika matematika = new Matematika();
        // Menghitung luas persegi panjang
        double luasPersegiPanjang = matematika.hitung(10, 5); // panjang = 10 m, lebar = 5 m
        System.out.println("Luas Persegi Panjang: " + luasPersegiPanjang + " m^2");

        // Menghitung luas lingkaran
        double luasLingkaran = matematika.hitungLuasLingkaran(7); // jari-jari = 7 m
        System.out.println("Luas Lingkaran: " + luasLingkaran + " m^2");

        // Menghitung volume kubus
        double volumeKubus = matematika.hitungVolumeKubus(3); // sisi = 3 m
        System.out.println("Volume Kubus: " + volumeKubus + " m^3");

        // Menghitung volume silinder
        double volumeSilinder = matematika.hitungVolumeSilinder(3, 10); // jari-jari = 3 m, tinggi = 10 m
        System.out.println("Volume Silinder: " + volumeSilinder + " m^3");
    }
}
