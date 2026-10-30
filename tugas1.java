
import java.util.*;

public class tugas1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan golongan anda (1/2/3): ");
        int golongan = input.nextInt();
        int gaji = 0;
        if (golongan >= 1) {
            if (golongan == 1) {
                gaji = 1000000;
            } else if (golongan == 2) {
                gaji = 2000000;
            } else if (golongan == 3) {
                System.out.print("Karena termasuk golongan 3, maka gaji anda dipotong pajak 2%");
                gaji = 3000000;
                gaji -= (int)(gaji * 0.002);
            }
            System.out.print("Karena anda golongan: " + golongan + " jadi gaji anda: " + gaji);
        } else {
            System.out.print("Golongan anda tidak valid. Golongan hanya sampai 3");
        }
        input.close();
    }
}
