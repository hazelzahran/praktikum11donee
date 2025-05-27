import java.io.File;

public class UkuranFile {
    public static void main(String[] args) {
        // Ganti nama file di bawah ini sesuai dengan file yang ingin Anda cek
        File file = new File("test.txt");

        // Mengecek apakah file tersebut ada
        if (file.exists() && file.isFile()) {
            long ukuranByte = file.length(); // Mengambil ukuran file dalam byte

            // Jika ukuran file < 1 MB
            if (ukuranByte < 1024 * 1024) {
                double ukuranKB = ukuranByte / 1024.0; // Konversi ke kilobyte
                System.out.printf("Ukuran file: %.2f KB\n", ukuranKB);
            } else {
                double ukuranMB = ukuranByte / (1024.0 * 1024); // Konversi ke megabyte
                System.out.printf("Ukuran file: %.2f MB\n", ukuranMB);
            }
        } else {
            System.out.println("File tidak ditemukan.");
        }
    }
}
