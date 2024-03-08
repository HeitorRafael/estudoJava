import java.util.Scanner;

public class horaGame {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a hora de inicio e a hora final: ");
        int hIni = sc.nextInt();
        int hFim = sc.nextInt();

        if (hIni < hFim) {

            int duracao = hFim - hIni;
            System.out.println("A duração do game foi: " + duracao);

        } else {

            int duracao = (24 - hIni + hFim);
            System.out.println("A duração do game foi: " + duracao);
        }

        sc.close();
    }
}
