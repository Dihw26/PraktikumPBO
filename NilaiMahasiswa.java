public class Nilai {
    
    String NIM;
    String Nama;
    double NilaiAbsen;
    double NilaiTugas;
    double NilaiUTS;
    double NilaiUAS;
    double NilaiAkhir;

    public Nilai(String nim, String nama, double nilaiAbsen, double nilaiTugas, double nilaiUTS, double nilaiUAS) {
        NIM = nim;
        Nama = nama;
        NilaiAbsen = nilaiAbsen;
        NilaiTugas = nilaiTugas;
        NilaiUTS = nilaiUTS;
        NilaiUAS = nilaiUAS;
        NilaiAkhir = HitungNilaiAkhir();
    }

    private double HitungNilaiAkhir() {
        return (NilaiAbsen * 0.10) + (NilaiTugas * 0.20) + (NilaiUTS * 0.30) + (NilaiUAS * 0.40);
    }

    public void CetakNilai() {
        System.out.println("NIM : " + NIM);
        System.out.println("Nama : " + Nama);
        System.out.println("Nilai Absen[10%] : " + NilaiAbsen);
        System.out.println("Nilai Tugas [20%] : " + NilaiTugas);
        System.out.println("Nilai UTS [30%] : " + NilaiUTS);
        System.out.println("Nilai UAS [40%] : " + NilaiUAS);
        System.out.println("Nilai Akhir : " + NilaiAkhir);
    }
}

public class DemoNilai {
    public static void main(String[] args) {
        Nilai nilaiMahasiswa = new Nilai("xxxxxxxx", "xxxxxxxx", 90.0, 85.0, 75.0, 88.0);
        
        System.out.println("Hasil Nilai Mahasiswa:");
        nilaiMahasiswa.CetakNilai();
    }
}