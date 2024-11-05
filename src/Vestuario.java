public class Vestuario extends Loja{
    //Atributos
    private boolean produtosImportados;

    //Construtor
    public Vestuario(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, boolean produtosImportados, int estoqueProdutos) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, estoqueProdutos);
        this.produtosImportados = produtosImportados;
    }

    //Getter e Setter
    public boolean isProdutosImportados() {
        return produtosImportados;
    }

    public void setProdutosImportados(boolean produtosImportados) {
        this.produtosImportados = produtosImportados;
    }

    //toString
    @Override
    public String toString() {
        return "Vestuario{" + super.toString() +
                "produtosImportados = " + produtosImportados + "}";
    }

    
}
