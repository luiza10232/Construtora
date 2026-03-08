package construtora;

import java.util.Scanner;

public class Calculadora {

    private double lado;
    private double base;
    private double altura;
    private double raio;
    private int opcao;

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        calc.menu();
        calc.executar();
    }

    public void menu() {
        System.out.println("CALCULADORA DE AREAS");
        System.out.println("1 - Calcular Area do Quadrado");
        System.out.println("2 - Calcular Area do Retangulo");
        System.out.println("3 - Calcular Area do Circulo");
        System.out.println("0 - Sair");
        System.out.print("Escolha uma opcao: ");
    }

    public void executar() {

        Scanner sc = new Scanner(System.in);

        opcao = sc.nextInt();

        switch (opcao) {

            case 1:
                System.out.print("Digite o lado: ");
                lado = sc.nextDouble();
                double areaQuadrado = lado * lado;
                System.out.printf("Area do Quadrado: %.2f\n", areaQuadrado);
                break;

            case 2:
                System.out.print("Digite a base: ");
                base = sc.nextDouble();
                System.out.print("Digite a altura: ");
                altura = sc.nextDouble();
                double areaRetangulo = base * altura;
                System.out.printf("Area do Retangulo: %.2f\n", areaRetangulo);
                break;

            case 3:
                System.out.print("Digite o raio: ");
                raio = sc.nextDouble();
                double areaCirculo = 3.14 * (raio * raio);
                System.out.printf("Area do Circulo: %.2f\n", areaCirculo);
                break;

            case 0:
                System.out.println("Obrigada por usar a calculadora!");
                break;

            default:
                System.out.println("Opcao invalida!");
        }

        sc.close();
    }
}