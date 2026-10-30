
import java.util.Scanner;

public class tugas3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai a: ");
        double a = input.nextDouble();

        System.out.print("Masukkan nilai b: ");
        double b = input.nextDouble();

        System.out.print("Masukkan nilai c: ");
        double c = input.nextDouble();

        if (a == 0) {
            System.out.println("Bukan persamaan kuadrat karena a tidak boleh 0.");
        } else {
            double D = (b * b) - (4 * a * c);

            System.out.println("Diskriminan = " + D);

            if (D == 0) {
                System.out.println("Akar-akarnya sama (nyata kembar).");

                double x = -b / (2 * a);
                System.out.println("Nilai akar x1 = " + x);
                System.out.println("Nilai akar x2 = " + x);

            } else if (D > 0) {
                System.out.println("Akar-akarnya nyata dan berbeda.");

                double x1 = (-b + Math.sqrt(D)) / (2 * a);
                double x2 = (-b - Math.sqrt(D)) / (2 * a);

                System.out.println("Nilai akar x1 = " + x1);
                System.out.println("Nilai akar x2 = " + x2);

            } else {
                System.out.println("Akar-akarnya khayal (tidak nyata).");

                if (a > 0) {
                    System.out.println("Persamaan definit positif.");
                } else {
                    System.out.println("Persamaan definit negatif.");
                }
            }
        }

        input.close();
    }
}
