import java.util.*;

public class tugas2 {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      System.out.print("Masukkan nilai mahasiswa: ");
      int nilai = input.nextInt();
      String predikat;

      if (nilai < 0 || nilai > 100){
        System.out.print("Nilai tidak valid, tidak dapat memproses kelulusan dan predikat kelulusan");
      }else if (nilai < 60){
        System.out.print("Maaf anda belum lulus. Better luck next time");
      }else{
        if (nilai >= 80){
            predikat = "Sangat baik";
        }else if(nilai >= 70){
            predikat = "Baik";
        }else{
            predikat = "cukup";
        }
        System.out.print("Selamat! Anda lulus dengan nilai: " + nilai + " dan predikat anda " + predikat);
      }
      input.close();
    }
}
