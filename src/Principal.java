import java.util.Scanner;

public class Principal {
    
    //Método Main
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
    
        

        //Atributos
        Loja loja;
        Produto produto;
        int opcao = 0;

        //Menu
        while (opcao != 3) {
            System.out.println("Menu: ");
            System.out.println("(1) Criar uma loja: ");
            System.out.println("(2) Criar um produto: ");
            System.out.println("(3) Sair: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 1) {
                System.out.println("Loja criada!");
            } else if (opcao == 2) {
                System.out.println("Produto criado");
            } else if (opcao == 3) {
                System.out.println("Saindo.");
            } else {
                System.out.println("Opção invalida.");
            }
        }
    }
}


