import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TulisFile {
    public static void main(String[] args) {
        var keyboard = new Scanner(System.in);  // Membaca input dari keyboard
        System.out.print("Masukkan teks yang akan disimpan: ");
        var text = keyboard.nextLine();         // Menyimpan input ke variabel text

        // Baris berikut menulis ke file "test.txt"
        // Parameter kedua di FileWriter menentukan mode penulisan:
        // false = menimpa isi file, true = menambahkan ke akhir file
        try (var writer = new FileWriter("test.txt", true)) { // Ubah 'false' jadi 'true' untuk append
            writer.write(text + "\n"); // Menulis teks ke file, ditambah baris baru
        } catch (IOException e) {
            System.err.println("Gagal menulis ke file");
        }
    }
}
