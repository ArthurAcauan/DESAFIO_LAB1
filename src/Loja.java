public class Loja {

    //Atributos;
    private  String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;
    private Endereco endereco;
    private Data dataDeFundacao;
    private Produto[] estoqueProdutos;       

    //Método Construtor 1;
    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataDeFundacao, int estoqueProdutos) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.endereco = endereco;
        this.dataDeFundacao = dataDeFundacao;
        this.estoqueProdutos = new Produto[estoqueProdutos];
    }

    //Método Construtor 2;
    public Loja(String nome, int quantidadeFuncionarios, int estoqueProdutos) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = -1;
        this.estoqueProdutos = new Produto[estoqueProdutos];
    }

    //Métodos de Acesso: Getters & Setters
    //Getter e Setter = nome;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    //Getter e Setter = quantidadeFuncionarios;
    public int getQuantidadeFuncionarios() {
        return quantidadeFuncionarios;
    }
    public void setQuantidadeFuncionarios(int quantidadeFuncionarios) {
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    //Getter e Setter = salarioBaseFuncionario;
    public double getSalarioBaseFuncionario() {
        return salarioBaseFuncionario;
    }
    public void setSalarioBaseFuncionario(double salarioBaseFuncionario) {
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }

    //Getter e Setter = Endereco.endereco;
    public Endereco getEndereco() {
        return endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    //Getter e Setter = Data.dataDeFundacao;
    public Data getDataDeFundacao() {
        return dataDeFundacao;
    }
    public void setDataDeFundacao(Data dataDeFundacao) {
        this.dataDeFundacao = dataDeFundacao;
    }

    //Getter e Setter = estoqueProdutos
    public Produto[] getEstoqueProdutos() {
        return estoqueProdutos;
    }
    public void setEstoqueProdutos(Produto[] estoqueProdutos) {
        this.estoqueProdutos = estoqueProdutos;
    }

    //Método toString, retornando todos atributos da Clase Loja;
    @Override
    public String toString() {
        return "Nome: " + nome + ", Quantidade de Funcionarios: " + quantidadeFuncionarios + ", Salario Base Funcionario: " + salarioBaseFuncionario + ", Endereço- " + endereco + ", Data de fundação- " + dataDeFundacao + ", Estoque de produtos: " + imprimeProdutos();
    }

    //Método gastosComSalario;
    public double gastosComSalario() {
        if(salarioBaseFuncionario <= -1) {
            System.out.println("Calculo não realizado, pois Salario base <= -1");
            return -1;
        } else {
            return salarioBaseFuncionario * quantidadeFuncionarios;
        }
    }

    //Método tamanhoDaLoja;
    public char tamanhoDaLoja() {
        if(quantidadeFuncionarios < 10) {
            return 'P';
        } else if (quantidadeFuncionarios <= 30) {
            return 'M';
        } else {
            return 'G';
        }
    }

    //Método imprimeProdutos
    public String imprimeProdutos() {
        String produto = "";
        for (Produto produtoArray:estoqueProdutos) {
            produto = produto + produtoArray + "|";
        }
        return produto;
    }

    //Método isereProduto
    public boolean insereProduto(Produto produto) {
        int indexNulo = confereIndexNuloArrayEstoque();
        if (indexNulo == -1) {
            System.out.println("Não há espaço no estoque para inserir novo produto.");
            return false;
        } else {
            estoqueProdutos[indexNulo] = produto;
            System.out.println("Produto inserido no estoque.");
            return true;
        }
    }

    //Método removeProduto
    public boolean removeProduto(String nomeProduto) {
        for (int i = 0; i < estoqueProdutos.length; i++) {
            if (estoqueProdutos[i] == null) continue;
            if (nomeProduto.equalsIgnoreCase(estoqueProdutos[i].getNome())) {
                estoqueProdutos[i] = null;
                System.out.println("Produto " + nomeProduto + " removido do estoque.");
                return true;
            }
        }
        System.out.println("Produto " + nomeProduto + " não está no estoque e não foi removido");
        return false;
    }

    //Método confereIndex
    private int confereIndexNuloArrayEstoque() {
        int indexNulo = -1;
        for (int i = 0; i < estoqueProdutos.length; i++) {
            if (estoqueProdutos[i] == null) {
                indexNulo = i;
                break;
            }
        }
        return indexNulo;
    }

}