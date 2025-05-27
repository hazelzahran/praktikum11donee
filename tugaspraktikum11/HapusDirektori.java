import java.io.File;

public class HapusDirektori {
    public static void main(String[] args) {
        // Ganti nama folder di sini sesuai direktori yang ingin dihapus
        File folder = new File("jokowi");

        // Cek apakah direktori ada dan merupakan folder
        if (folder.exists() && folder.isDirectory()) {
            File[] daftarFile = folder.listFiles(); // Ambil semua file dalam folder

            // Hapus semua file satu per satu
            for (File file : daftarFile) {
                if (file.isFile()) {
                    if (file.delete()) {
                        System.out.println("File dihapus: " + file.getName());
                    } else {
                        System.out.println("Gagal menghapus file: " + file.getName());
                    }
                }
            }

            // Setelah semua file dihapus, hapus direktori
            if (folder.delete()) {
                System.out.println("Direktori berhasil dihapus.");
            } else {
                System.out.println("Gagal menghapus direktori.");
            }
        } else {
            System.out.println("Direktori tidak ditemukan atau bukan folder.");
        }
    }
}
