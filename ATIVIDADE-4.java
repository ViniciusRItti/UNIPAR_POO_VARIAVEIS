import java.util.Scanner;

public class AT1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Qual sua idade?: ");
        int idade = scanner.nextInt();
        
        if (idade >= 18) {
            System.out.println("Você é maior de idade.");
        } else {
            System.out.println("Você é menor de idade.");
        }
        
        scanner.close();
    }
}

-------------------------------------------------------------------------------

import java.util.Scanner;

public class AT2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();
        
        if (numero % 2 == 0) {
            System.out.println("O número digitado é par.");
        } else {
            System.out.println("O número digitado é ímpar.");
        }
        
        scanner.close();
    }
}

---------------------------------------------------------------------------------------------

import java.util.Scanner;

public class AT3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite seu nome de usuário: ");
        String nomeUsuario = scanner.nextLine();
        
        System.out.print("Digite sua senha: ");
        String senha = scanner.nextLine();
        
        if (nomeUsuario.equals("usuario") && senha.equals("senha123")) {
            System.out.println("Login bem-sucedido.");
        } else {
            System.out.println("Nome de usuário ou senha incorretos.");
        }
        
        scanner.close();
    }
}

------------------------------------------------------------------------------------------------

import java.util.Scanner;

public class AT4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Insira o primeiro número inteiro: ");
        int n1 = scanner.nextInt();
        
        System.out.print("Insira o segundo número inteiro: ");
        int n2 = scanner.nextInt();
        
        int maiorNumero;
        if (n1 > n2) {
            maiorNumero = n1;
        } else {
            maiorNumero = n2;
        }
        
        System.out.println("O maior número é: " + maiorNumero);
        
        scanner.close();
    }
}

