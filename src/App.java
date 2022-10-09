import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        double raio, area, pi=3.1415926535898;
        Scanner sc = new Scanner(System.in); 
        System.out.print("Digite o valor do raio: ");
        raio = sc.nextDouble();
        area = pi*raio*raio;
        System.out.printf("A área do círculo é: %.2f", area);
    }
}