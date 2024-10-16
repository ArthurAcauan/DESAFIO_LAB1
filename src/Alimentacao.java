public class Alimentacao extends Loja{
    //Atributos
    private Data dataAlvara;

    //Construtor
    public Alimentacao (String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, Data dataAlvara) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao);
        this.dataAlvara = dataAlvara;
    }

    //Getter and Setter
    public Data getDataAlvara() {
        return dataAlvara;
    }

    public void setDataAlvara(Data dataAlvara) {
        this.dataAlvara = dataAlvara;
    }

    //toString
    @Override
    public String toString() {
        return "Alimentacao{" + super.toString() +
                "dataAlvara = " + dataAlvara + "}";
    }
}
