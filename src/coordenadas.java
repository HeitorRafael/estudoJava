import java.util.Locale;
import java.util.Scanner;

public class coordenadas {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        System.out.println("Digite as coordenadas x e y: ");
        Scanner sc = new Scanner(System.in);
        float numx = sc.nextFloat();
        float numy = sc.nextFloat();

        if (numx > 0 && numy > 0) {
            System.out.println("Se encontra no quadrante Q1" );
            
        } else if (numx == 0 && numy == 0) {
            System.out.println("Se encontra na origem." );
            
        }else if (numx < 0 && numy > 0) {
            System.out.println("Se encontra no quadrante Q2" );
            
        }else if (numx > 0 && numy < 0) {
            System.out.println("Se encontra no quadrante Q4" );
            
        } else{
            System.out.println("Se encontra no quadrante Q3" );
        }

        sc.close();
    }
}