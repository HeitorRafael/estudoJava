import java.util.Locale;
import java.util.Scanner;
public class Raio {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        float Pi = 3.14159f;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o raio: ");
        float Raio = sc.nextFloat();

        float area = (Raio*Raio)*Pi;

        System.out.printf("A area é: %.4f ",  area);
        sc.close();
    }
}
