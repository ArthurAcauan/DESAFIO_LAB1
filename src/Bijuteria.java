public class Bijuteria extends Loja{
    //Atributos
    private double metaVendas;

    //Construtor
    public Bijuteria (String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, double metaVendas, int estoqueProdutos) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, estoqueProdutos);
        this.metaVendas = metaVendas;
    }

    //Getter and Setter
    public double getMetaVendas() {
        return metaVendas;
    }

    public void setMetaVendas(double metaVendas) {
        this.metaVendas = metaVendas;
    }

    //toString
    @Override
    public String toString() {
        return "Bijuteria{" + super.toString() +
                "metaVendas = " + metaVendas + "}";
    }
}
