import java.util.Scanner;

public class Marrey {

    public static void main(String[] args) {
        int[] num = new int[10];
        int soma = 0; 
        double media;

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < numPosicao; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            num[i] = scan.nextInt();
            soma += num[i];
        }

        media = soma / numPosicao;

        System.out.println("A média é: " + media);

        scan.close();
    }
}
