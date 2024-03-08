import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite um numero");
        int fnum = sc.nextInt();
        System.out.println("digite o segundo numero");
        int snum = sc.nextInt();

        System.out.println("A soma é: " + (fnum + snum));
        sc.close();
    }
}
