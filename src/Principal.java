import java.util.Scanner;
import static java.lang.System.exit;

public class Principal {
    //Atributos
    static Scanner scanner = new Scanner(System.in);
    static Produto produto;
    static Produto[] produtos = new Produto[2];

    public static void main(String[] args) {
        chamarMenu();
    }
    //Método chamarMenu
    private static void chamarMenu() {
        System.out.println("\nSegue o menu de comandos: ");

        System.out.println("(1) criar uma loja");
        System.out.println("(2) criar um produto");
        System.out.println("(3) sair");

        String resposta = scanner.nextLine();

        switch (resposta) {
            case "1":
                criarloja();
                break;
            case "2":
                criarProduto();
                break;
            case "3":
                sair();
                break;
            default:
                System.out.println("Opção inválida. Escolha uma opção: ");
                chamarMenu();
        }
    }

    //Criar loja:
    private static void criarloja() {
        System.out.println("Digite o nome da loja: \n");
        String nome = scanner.nextLine();

        System.out.println("Digite a quantidade de funcionários: \n");
        int quantidadeFuncionarios = Integer.parseInt(scanner.nextLine());

        System.out.println("Digite o salário base para os funcionários: \n");
        double salarioBaseFuncionario = Double.parseDouble(scanner.nextLine());

        System.out.println("Para o endereço da loja, digite o nome da rua: \n");
        String nomeDaRua = scanner.nextLine();
        System.out.println("Para o endereço da loja, digite a cidade: \n");
        String cidade = scanner.nextLine();
        System.out.println("Para o endereço da loja, digite o estado: \n");
        String estado = scanner.nextLine();
        System.out.println("Para o endereço da loja, digite o país: \n");
        String pais = scanner.nextLine();
        System.out.println("Para o endereço da loja, digite o cep: \n");
        String cep = scanner.nextLine();
        System.out.println("Para o endereço da loja, digite o número: \n");
        String numero = scanner.nextLine();
        System.out.println("Para o endereço da loja, digite o complemento: \n");
        String complemento = scanner.nextLine();

        Endereco endereco = new Endereco(nomeDaRua, cidade, estado, pais, cep, numero, complemento);

        System.out.println("Para a data de fundação, digite o dia: \n");
        int dia = Integer.parseInt(scanner.nextLine());
        System.out.println("Para a data de fundação, digite o mês: \n");
        int mes = Integer.parseInt(scanner.nextLine());
        System.out.println("Para a data de fundação, digite o ano: \n");
        int ano = Integer.parseInt(scanner.nextLine());

        Data dataFundacao = new Data(dia, mes, ano);

        Loja loja = new Loja(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, ano);

        System.out.println("Você criou a seguinte loja:\n" + loja.toString());

        chamarMenu();
    }

    //Criar Produto:
    private static void criarProduto() {
        System.out.println("Digite o nome do produto: \n");
        String nome = scanner.nextLine();

        System.out.println("Digite o preço do produto: \n");
        double preco = Double.parseDouble(scanner.nextLine());

        System.out.println("Para a data de validade do produto, digite primeiro o dia: \n");
        int dia = Integer.parseInt(scanner.nextLine());
        System.out.println("Para a data de validade do produto, digite agora o mês: \n");
        int mes = Integer.parseInt(scanner.nextLine());
        System.out.println("Para a data de validade do produto, digite agora o ano: \n");
        int ano = Integer.parseInt(scanner.nextLine());

        Data dataValidade = new Data(dia, mes, ano);
        Data dataAtual = new Data(5, 10, 2024);

        Produto produto = new Produto(nome, preco, dataValidade);

        if (produto.estaVencido(dataAtual)) {
            System.out.println(produto + " VENCIDO");
        } else {
            System.out.println(produto + " NÃO VENCIDO");
        }
        System.out.println("Verificação concluída!");

        System.out.println("Você criou o seguinte produto:\n" + produto.toString() + "\n");

        chamarMenu();
    }

    //Sair:
    private static void sair() {
        System.out.println("Saindo... ");
        exit(0);
    }

}
    

    
