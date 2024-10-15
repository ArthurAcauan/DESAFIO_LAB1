public class Produto {
    
    //Atributos
    private String nome;
    private double preco;
    private Data dataDeValidade;

    //Método Construtor 1;
    public Produto(String nome, double preco, Data dataDeValidade) {
        this.nome = nome;
        this.preco = preco;
        this.dataDeValidade = dataDeValidade;
    }

    //Método estaVencido;
    public boolean estaVencido(Data dataAtual) {
        if (dataAtual.getAno() > dataDeValidade.getAno()) {
            return true;
        } else if (dataAtual.getAno() == dataDeValidade.getAno()) {
            return true;
        } else if (dataAtual.getMes() == dataDeValidade.getMes()){
            return dataAtual.getDia() > dataDeValidade.getDia();
        } else {
            return false;
        }
    }

    //Métodos de acesso:Getters & Setters;
    //Getter e Setter = nome;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    //Getter e Setter = preco;
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }

    //Getter e Setter = Data.dataDeValidade;
    public Data getDataDeValidade() {
        return dataDeValidade;
    }
    public void setDataDeValidade(Data dataDeValidade) {
        this.dataDeValidade = dataDeValidade;
    }

    //Método toString;
    @Override
    public String toString() {
        return "Nome: " + nome + ", Preço: " + preco + ", Data de Validade- " + dataDeValidade;
    }


}
