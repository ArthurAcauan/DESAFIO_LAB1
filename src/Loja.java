public class Loja {

    //Atributos;
    private  String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;
    private Endereco endereco;
    private Data dataDeFundacao;

    //Método Construtor 1;
    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataDeFundacao) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.endereco = endereco;
        this.dataDeFundacao = dataDeFundacao;
    }

    //Método Construtor 2;
    public Loja(String nome, int quantidadeFuncionarios) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = -1;
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

    //Método toString, retornando todos atributos da Clase Loja;
    @Override
    public String toString() {
        return "Nome: " + nome + ", Quantidade de Funcionarios: " + quantidadeFuncionarios + "Salario Base Funcionario: " + salarioBaseFuncionario;
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

}