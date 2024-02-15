import java.util.Scanner;
import static java.lang.Math.sqrt;

public class Main {
    public static void main(String[] args) {

        double n1, n2, n3, delta, x1, x2, result;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o valor A de uma equação de segundo grau:");
        n1 = in.nextDouble();

        System.out.println("Digite o valor B de uma equação de segundo grau");
        n2 = in.nextDouble();

        System.out.println("Digite o valor C de uma equação de segundo grau");
        n3 = in.nextDouble();

        delta = ((n2*n2) - (4*n1*n3));
        x1 = ((n2-) + sqrt(delta)) / (2*n1);
        x2 = ((-n2) - sqrt(delta)) / (2*n1);



        result = (0-n2) / n1;
        System.out.println("A solução é S = { " + x1 + x2);

    }
}