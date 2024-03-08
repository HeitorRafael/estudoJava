import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu numero de cadastro, sua hora trabalho e a quantidade de horas trabalhadas: ");
        int ID = sc.nextInt();
        float VH = sc.nextFloat();
        float HT = sc.nextFloat();

        float salario = HT*VH;

        System.out.println("Registro: " + ID + " Salario: " + salario);
        

        sc.close();
    }
}
