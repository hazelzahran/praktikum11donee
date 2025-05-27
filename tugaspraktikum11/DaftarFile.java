import java.io.File;

public class DaftarFile {
    public static void main(String[] args) {
        // Ganti path di bawah ini sesuai direktori yang ingin Anda lihat
        File direktori = new File(".");

        // Mengecek apakah path tersebut adalah direktori
        if (direktori.exists() && direktori.isDirectory()) {
            File[] daftarFile = direktori.listFiles(); // Mendapatkan semua file dan folder

            System.out.println("Daftar file dalam direktori:");
            for (File file : daftarFile) {
                if (file.isFile()) {
                    System.out.println("- " + file.getName()); // Menampilkan hanya file
                }
            }
        } else {
            System.out.println("Direktori tidak ditemukan atau bukan folder.");
        }
    }
}

