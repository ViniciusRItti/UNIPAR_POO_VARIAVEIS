import java.util.Scanner;

public class AT1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int v1 = 0;
        int v2 = 0;
        int v3 = 0;
        int total = 0;
        
        System.out.println("Digite o primeiro valor:");
        v1 = scanner.nextInt();

        System.out.println("Digite o segundo valor:");
        v2 = scanner.nextInt();

        System.out.println("Digite o terceiro valor:");
        v3 = scanner.nextInt();

        total = v1 + v2 + v3;

        System.out.println("A soma dos valores e: " + total);

        scanner.close();
    }
}

-------------------------------------------------------------------------------------------------------

import java.util.Scanner;

public class AT2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int v1 = 0;
        int v2 = 0;
        int sub = 0;
        
        System.out.println("Digite o primeiro valor:");
        v1 = scanner.nextInt();

        System.out.println("Digite o segundo valor:");
        v2 = scanner.nextInt();

        sub = v1 - v2;

        System.out.println("O valor da Subtracao e: " + sub);

        scanner.close();
    }
}

---------------------------------------------------------------------------------------------------------

  import java.util.Scanner;

public class AT3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double n1 = 0;
        double n2 = 0;
        double media = 0;
        
        System.out.println("Digite a primeira nota:");
        n1 = scanner.nextDouble();

        System.out.println("Digite a segunda nota:");
        n2 = scanner.nextDouble();

        media = (n1 + n2) /2;

        System.out.println("A media das duas notas e " + media);

        scanner.close();
    }
}

--------------------------------------------------------------------------------------------------------------

  import java.util.Scanner;

public class AT4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double n1 = 0;
        double n2 = 0;
        double n3 = 0;
        double n4 = 0;
        double media = 0;
        
        System.out.println("Digite a primeira nota:");
        n1 = scanner.nextDouble();

        System.out.println("Digite a segunda nota:");
        n2 = scanner.nextDouble();
        
         System.out.println("Digite a terceira nota:");
        n3 = scanner.nextDouble();
        
         System.out.println("Digite a quarta nota:");
        n4 = scanner.nextDouble();

        media = (n1 + n2 + n3 + n4) /4;

        System.out.println("A media das duas notas e " + media);

        scanner.close();
    }
}

-------------------------------------------------------------------------------------------------------

  import java.util.Scanner;

public class AT5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double n1 = 0;
        double n2 = 0;
        double soma = 0;
        double subtracao = 0;
        double divisao = 0;
        double multiplicacao = 0;
        
        
        System.out.println("Digite o primeiro numero:");
        n1 = scanner.nextDouble();

        System.out.println("Digite o segundo numero:");
        n2 = scanner.nextDouble();
        
        soma = (n1 + n2);
        subtracao = (n1 - n2);
        divisao = (n1 / n2);
        multiplicacao = (n1 * n2);

        System.out.println("A soma e " + soma);
        System.out.println("A Subtracao e " + subtracao);
        System.out.println("A divisao e " + divisao);
        System.out.println("A multiplicacao e " + multiplicacao);

        scanner.close();
    }
}

---------------------------------------------------------------------------------------------------

  import java.util.Scanner;

public class AT6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String nomeProduto = "";
        double precoProduto = 0;
        double percentualDesconto = 0;
        double valorDesconto = 0;
        double novoPreco = 0;
        
        System.out.println("Digite o nome do produto:");
        nomeProduto = scanner.nextLine();

        System.out.println("Digite o preco do produto:");
        precoProduto = scanner.nextDouble();

        System.out.println("Digite o percentual de desconto:");
        percentualDesconto = scanner.nextDouble();

        valorDesconto = precoProduto * (percentualDesconto / 100);

         novoPreco = precoProduto - valorDesconto;

        System.out.println("Nome do produto: " + nomeProduto);
        System.out.println("Novo preco com desconto: " + novoPreco);

        scanner.close();
    }
}
