public class Cosmetico extends Loja{
    //Atributos
    private double taxaComercializacao;

    //Construtor
    public Cosmetico(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, double taxaComercializacao, int estoqueProdutos) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, estoqueProdutos);
        this.taxaComercializacao = taxaComercializacao;
    }

    //Getter e Setter
    public double getTaxaComercializacao() {
        return taxaComercializacao;
    }

    public void setTaxaComercializacao(double taxaComercializacao) {
        this.taxaComercializacao = taxaComercializacao;
    }

    //toString
    @Override
    public String toString() {
        return "Cosmetico{" + super.toString() +
                "taxaComercializacao = " + taxaComercializacao + "}";
    }



}
