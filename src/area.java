import java.util.Scanner;

public class area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Area do triângulo
        System.out.println("Canculando a area do triângulo, digite o valor da base e o valor da altura: ");
        double base = sc.nextDouble();
        double altura = sc.nextDouble();
        double areaT = (base*altura)/2;
        System.out.printf("A area do seu triangulo é: %.3f%n", areaT);

        //Area Circulo
        System.out.println("Canculando a area do circulo, digite o valor do raio : ");
        double raio = sc.nextDouble();
        double Pi = 3.14159d;
        double areaC = (raio*raio)*Pi;
        System.out.printf("A area do seu cirulo é: %.3f%n", areaC);

        //Area trapézio
        System.out.println("Canculando a area do trapézio, digite o valor da base A, base B e Altura C : ");
        double BaseA = sc.nextDouble();
        double BaseB = sc.nextDouble();
        double AlturaC = sc.nextDouble();
        double areaTr = ((BaseA*BaseB)*AlturaC)/2;
        System.out.printf("A area do seu trapézio é: %.3f%n", areaTr);

        //Area quadrado
        System.out.println("Canculando a area do quadrado, digite o valor do lado A e do lado B : ");
        double LadoA = sc.nextDouble();
        double LadoB = sc.nextDouble();
        double areaQ = LadoA*LadoB;
        System.out.printf("A area do seu quadrado é: %.3f%n", areaQ);

        //Area Retângulo
        System.out.println("Canculando a area do retângulo, digite o valor do lado A e do lado B : ");
        double LadoC = sc.nextDouble();
        double LadoD = sc.nextDouble();
        double areaR = LadoC*LadoD;
        System.out.printf("A area do seu retângulo é: %.3f%n", areaR);

        sc.close();
    }
}
