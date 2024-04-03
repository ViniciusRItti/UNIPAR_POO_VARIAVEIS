import java.util.Scanner;

public class MusicaDosPatinhos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número inicial de patinhos: ");
        int n = scanner.nextInt();

        for (int i = n; i >= 1; i--) {
            if (i == 1) {
                System.out.println("1 patinho foi passear");
            } else {
                System.out.println(i + " patinhos foram passear");
            }
            System.out.println("Além das montanhas");
            System.out.println("Para brincar");
            System.out.println("A mamãe gritou: Quá, quá, quá, quá");

            if (i > 1) {
                System.out.println("Mas só " + (i - 1) + " patinhos voltaram de lá\n");
            } else {
                System.out.println("Mas nenhum patinho voltou de lá\n");
            }
        }

        System.out.println("A mamãe patinha foi procurar");
        System.out.println("Além das montanhas");
        System.out.println("Na beira do mar");
        System.out.println("A mamãe gritou: Quá, quá, quá, quá");
        System.out.println("E todos os patinhos voltaram de lá.");

        scanner.close();
    }
}

