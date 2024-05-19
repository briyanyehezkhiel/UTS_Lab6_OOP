class Fisika {
    private double massa;
    private double kecepatan;
    private double gravitasi;
    private double tinggi;
    private double arus;
    private double resistansi;

    // Constructor untuk inisialisasi dengan parameter massa, kecepatan, gravitasi, tinggi, arus, dan resistansi
    public Fisika(double massa, double kecepatan, double gravitasi, double tinggi, double arus, double resistansi) {
        this.massa = massa;
        this.kecepatan = kecepatan;
        this.gravitasi = gravitasi;
        this.tinggi = tinggi;
        this.arus = arus;
        this.resistansi = resistansi;
    }

    // Metode overload untuk menghitung energi kinetik: EK = 0.5 * m * v^2
    public double hitungEnergiKinetik() {
        return 0.5 * massa * kecepatan * kecepatan;
    }

    // Metode overload untuk menghitung energi potensial gravitasi: EP = m * g * h
    public double hitungEnergiPotensial() {
        return massa * gravitasi * tinggi;
    }

    // Metode overload untuk menghitung hukum Ohm: V = I * R
    public double hitungTegangan() {
        return arus * resistansi;
    }
}

class Matematika {
    private double panjang;
    private double lebar;
    private double jariJari;
    private double sisi;
    private double tinggi;

    // Constructor untuk inisialisasi dengan parameter panjang, lebar, jari-jari, sisi, dan tinggi
    public Matematika(double panjang, double lebar, double jariJari, double sisi, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.jariJari = jariJari;
        this.sisi = sisi;
        this.tinggi = tinggi;
    }

    // Metode overload untuk menghitung luas persegi panjang: L = p * l
    public double hitung() {
        return panjang * lebar;
    }

    // Metode overload untuk menghitung luas lingkaran: L = π * r^2
    public double hitung(boolean isLingkaran) {
        if (isLingkaran) {
            return Math.PI * jariJari * jariJari;
        } else {
            return 0.0; // Kondisi ini tidak akan dipakai, hanya untuk memenuhi syarat overloading
        }
    }

    // Metode overload untuk menghitung volume kubus: V = s^3
    public double hitung(int sisi) {
        return Math.pow(sisi, 3);
    }

    // Metode overload untuk menghitung volume silinder: V = π * r^2 * t
    public double hitung(double jariJari, double tinggi) {
        return Math.PI * Math.pow(jariJari, 2) * tinggi;
    }
}

public class no4_RumusComplex {
    public static void main(String[] args) {
        // Membuat objek dari kelas Fisika dengan nilai-nilai yang dibutuhkan
        Fisika fisika = new Fisika(10, 5, 9.8, 20, 2, 5);

        // Menghitung energi kinetik
        double energiKinetik = fisika.hitungEnergiKinetik();
        System.out.println("Energi Kinetik: " + energiKinetik + " Joule");

        // Menghitung energi potensial gravitasi
        double energiPotensial = fisika.hitungEnergiPotensial();
        System.out.println("Energi Potensial Gravitasi: " + energiPotensial + " Joule");

        // Menghitung tegangan menggunakan hukum Ohm
        double tegangan = fisika.hitungTegangan();
        System.out.println("Tegangan: " + tegangan + " Volt");

        // Membuat objek dari kelas Matematika dengan nilai-nilai yang dibutuhkan
        Matematika matematika = new Matematika(10, 5, 7, 3, 10);

        // Menghitung luas persegi panjang
        double luasPersegiPanjang = matematika.hitung();
        System.out.println("Luas Persegi Panjang: " + luasPersegiPanjang + " m^2");

        // Menghitung luas lingkaran
        double luasLingkaran = matematika.hitung(true);
        System.out.println("Luas Lingkaran: " + luasLingkaran + " m^2");

        // Menghitung volume kubus
        double volumeKubus = matematika.hitung(3);
        System.out.println("Volume Kubus: " + volumeKubus + " m^3");

        // Menghitung volume silinder
        double volumeSilinder = matematika.hitung(3, 10);
        System.out.println("Volume Silinder: " + volumeSilinder + " m^3");
    }
}
