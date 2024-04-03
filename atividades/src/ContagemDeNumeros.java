import java.util.Scanner;

public class ContagemDeNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int entre0e100 = 0;
        int entre101e200 = 0;
        int maioresQue200 = 0;

        for (int i = 1; i <= 20; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int numero = scanner.nextInt();

            if (numero >= 0 && numero <= 100) {
                entre0e100++;
            } else if (numero >= 101 && numero <= 200) {
                entre101e200++;
            } else {
                maioresQue200++;
            }
        }

        System.out.println("Quantidade de números entre 0 e 100: " + entre0e100);
        System.out.println("Quantidade de números entre 101 e 200: " + entre101e200);
        System.out.println("Quantidade de números maiores que 200: " + maioresQue200);

        scanner.close();
    }
}
