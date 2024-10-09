import java.util.Scanner;

public class Principal {
    
    //Método Main
    public static void main(String[] args) {

        //Atributos
        int menu = 0;
        Loja loja = null;
        Produto produto = null;

        try (Scanner scannerMenu = new Scanner(System.in)) {
            while (menu != 3) {
                System.out.println("Menu: ");
                System.out.println("(1) Criar uma loja: ");
                System.out.println("(2) Criar um produto: ");
                System.out.println("(3) Sair: ");

                System.out.print("Digite a opção desejada");
                int Menu = scannerMenu.nextInt();
                
            switch (Menu) {
                case 1:
                    loja = novaLoja();
                    System.out.println("Loja criada com sucesso: " + loja);
                    System.out.println(loja.toString());
                    break;
                case 2:
                    produto = novoProduto();
                    System.out.println("Produto criado com sucesso: " + produto);
                    System.out.println(produto.toString());

                    Data dataValidade = new Data(20, 10, 2023);
                    if (produto.estaVencido(dataValidade)) {
                        System.out.println("Produto Vencido");
                    } else {
                        System.out.println("Produto não esta vencido");
                    } 
                    break;
                case 3:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    break;
            }
                
     }
        }
    
    }

        public static Loja novaLoja() {
            Scanner scannerLoja = new Scanner(System.in);
            System.out.println("Digite o nome da loja: ");
            String nome = scannerLoja.nextLine();
            System.out.println("Digite a quantidade de funcionarios: ");
            int quantidadeFuncionarios = scannerLoja.nextInt();
            System.out.println("Digite o salario base: ");
            double salarioBaseFuncionario = scannerLoja.nextDouble();
            scannerLoja.close();
            Endereco endereco = novoEndereco();
            Data dataDeFundacao = novaData();

            return new Loja(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataDeFundacao);

        }

        public static Produto novoProduto() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite o nome do produto: ");
            String nome = scanner.nextLine();
            System.out.println("Digite o preço do produto: ");
            double preco = scanner.nextDouble();
            scanner.close();

            return new Produto(nome, preco, novaData());
        }

        public static Endereco novoEndereco() {
            Scanner scannerEndereco = new Scanner(System.in);

            System.out.println("Dados endereço, rua: ");
                String nomeDaRua = scannerEndereco.nextLine();
        
                System.out.println("Número:");
                String numero = scannerEndereco.nextLine();
        
                System.out.println("Cidade:");
                String nomeDaCidade = scannerEndereco.nextLine();
        
                System.out.println("País:");
                String pais = scannerEndereco.nextLine();
        
                System.out.println("Estado:");
                String estado = scannerEndereco.nextLine();
        
                System.out.println("CEP:");
                String cep = scannerEndereco.nextLine();
        
                System.out.println("Complemento:");
                String complemento = scannerEndereco.nextLine();
                scannerEndereco.close();

                return new Endereco(nomeDaRua, nomeDaCidade, estado, pais, cep, numero, complemento);
        }

        private static Data novaData() {
            Scanner scannerData = new Scanner(System.in);
            System.out.println("Digite o dia:");
            int dia = scannerData.nextInt();
            System.out.println("Digite o mes:");
            int mes = scannerData.nextInt();
            System.out.println("Digite o ano:");
            int ano = scannerData.nextInt();
            scannerData.close();

            return new Data(dia, mes, ano);
        }
}


