import java.util.Scanner;
public class DifProd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro numero:(A) ");
        int A = sc.nextInt();

        System.out.println("Digite o segundo numero:(B) ");
        int B = sc.nextInt();

        System.out.println("Digite o terceiro numero:(C) ");
        int C = sc.nextInt();

        System.out.println("Digite o quarto numero:(D) ");
        int D = sc.nextInt();

        System.out.println("A diferença entre o produto de A e B por C e D é: " + ((A*B)-(C*D)) );
        sc.close();
    }
}
