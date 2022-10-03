import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner console = new Scanner(System.in);
        double horas, salario, total;

        System.out.println("Quanto você ganha por hora?");
        salario = console.nextDouble();
        System.out.println("Qual o numero de horas que você trabalha ao mes? ");
        horas = console.nextDouble();
        total = horas * salario;
        System.out.println("Seu salario mensal  e :" + total);
        console.close();

    }
}
