import java.util.Scanner;

public class Pagamento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Peça 1, digite: o código da peça, quantidade de peças, o valor unitário");
        int Cod1 = sc.nextInt();
        int numPec1 = sc.nextInt();
        float valUni1 = sc.nextFloat();
        float pec1 = numPec1*valUni1;

        System.out.println("Peça 2, digite: o código da peça, quantidade de peças, o valor unitário");
        int Cod2 = sc.nextInt();
        int numPec2 = sc.nextInt();
        float valUni2 = sc.nextFloat();
        float pec2 = numPec2*valUni2;

        System.out.println("Valor a ser pago: " + (pec1+pec2));

        sc.close();
    }
}
