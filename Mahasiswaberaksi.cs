public class Mahasiswa {
    // Konstruktor kosong
    public Mahasiswa() {
    }

    public void membaca() {
        System.out.println("Mahasiswa sedang membaca buku.");
    }

    public void nyontek() {
        System.out.println("Mahasiswa sedang mencoba mencontek.");
    }

    public void modifikasi() {
        System.out.println("Mahasiswa sedang memodifikasi catatan.");
    }
}

public class MahasiswaBeraksi {
    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa();
        
        System.out.println("Aksi Mahasiswa:");
        mahasiswa.membaca();
        mahasiswa.nyontek();
        mahasiswa.modifikasi();
    }
}