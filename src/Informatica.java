public class Informatica extends Loja{
    //Atributos
    private double seguroEletronicos;

    //Construtor
    public Informatica (String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, double seguroEletronicos, int estoqueProdutos) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, estoqueProdutos);
        this.seguroEletronicos = seguroEletronicos;
    }

    //Getter and Setter
    public double getSeguroEletronicos() {
        return seguroEletronicos;
    }

    public void setSeguroEletronicos(double seguroEletronicos) {
        this.seguroEletronicos = seguroEletronicos;
    }

    //toString
    @Override
    public String toString() {
        return "Informatica{" + super.toString() +
                "seguroEletronicos = " + seguroEletronicos + "}";
    }
}
