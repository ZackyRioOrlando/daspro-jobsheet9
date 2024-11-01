import java.util.Scanner;
public class ModifArRaNi27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nilaiMhs = new int[10];
        double total = 0;
        double rata2;
        int jumlahMhs;
        int nilaiLulus = 0;
        int nilaiTidakLulus = 0;
        int lulus = 0;
        int tidakLulus = 0;

        System.out.print("Masukkan Jumlah Mahasiswa: ");
        jumlahMhs = sc.nextInt();
        
        for (int i = 0; i < jumlahMhs; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = sc.nextInt();
        }
        
        for (int i = 0; i < jumlahMhs; i++) {
            total += nilaiMhs[i];
            if (nilaiMhs[i] > 70) {
                lulus++;
                nilaiLulus += nilaiMhs[i];
            } else {
                tidakLulus++;
                nilaiTidakLulus += nilaiMhs[i];
            }
        }
        
        rata2 = total / jumlahMhs;
        System.out.println("Rata-rata nilai = " + rata2);
        System.out.println("Jumlah Mahasiswa Lulus = " + lulus);
        System.out.println("Jumlah Mahasiswa Tidak Lulus = " + tidakLulus);
    }
}
