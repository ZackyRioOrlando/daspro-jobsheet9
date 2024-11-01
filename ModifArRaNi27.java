import java.util.Scanner;
public class ModifArRaNi27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nilaiMhs = new int[10];
        double total = 0;
        double rata2, ratalulus, ratatidaklulus;
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
        
        ratalulus = nilaiLulus / lulus;
        ratatidaklulus = nilaiTidakLulus / tidakLulus;
        System.out.println("Rata-rata nilai lulus = " + ratalulus);
        System.out.println("Rata-rata nilai tidak lulus =  " + ratatidaklulus);
    }
}
