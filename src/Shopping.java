import java.util.Arrays;

public class Shopping {
    private String nome;
    private Endereco endereco;
    private Loja[] lojas;

    public Shopping(String nome, Endereco endereco, int quantidadeLojas) {
        this.nome = nome;
        this.endereco = endereco;
        this.lojas = new Loja[quantidadeLojas];
    }

    //Método insereLoja
    public boolean insereLoja(Loja loja) {
        int indexNulo = confereIndexNuloArrayEstoque();
        if (indexNulo == -1) {
            System.out.println("Não há espaço para inserir nova loja.");
            return false;
        } else {
            lojas[indexNulo] = loja;
            System.out.println("Loja inserida no shopping.");
            return true;
        }
    }

    //Método removeLoja
    public boolean removeLoja(String nomeLoja) {
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] == null) continue;
            if (nomeLoja.equalsIgnoreCase(lojas[i].getNome())){
                System.out.println("Loja '" + nomeLoja + "' removida do estoque.");
                return true;
            }
        }
        System.out.println("Loja '" + nomeLoja + "' não está na lista e, portanto, não foi removida");
        return false;
    }

    //Método quantidadeLojasPorTipo
    public int quantidadeLojasPorTipo(String tipoLoja){
        int quantidadeLoja = 0;

        for (int i = 0; i<lojas.length; i++){
            if (lojas[i] == null) continue;
            if (lojas[i].getClass().getSimpleName().equalsIgnoreCase(tipoLoja)) quantidadeLoja++;
        }

        if (quantidadeLoja == 0) return -1;
        else return quantidadeLoja;
    }

    //Método lojaSeguro
    public Informatica lojaSeguroMaisCaro(){
        double maiorSeguro = 0.0;
        if (quantidadeLojasPorTipo("Informatica") == -1) return null;
        Informatica lojaInfo = null;
        for (int i = 0; i<lojas.length; i++){
            if (lojas[i] instanceof Informatica){
               double lojaInfoSeguro = ((Informatica) lojas[i]).getSeguroEletronicos();
                if (lojaInfoSeguro > maiorSeguro){
                    maiorSeguro = lojaInfoSeguro;
                    lojaInfo = (Informatica) lojas[i];
                }

            }
        }
        return lojaInfo;
    }

    //Método ConfereIndex
    private int confereIndexNuloArrayEstoque() {
        int indexNulo = -1;
        for (int i = 0; i < lojas.length; i++){
            if (lojas[i] == null){
                indexNulo = i;
                break;
            }
        }
        return indexNulo;
    }

    //Getters & Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Loja[] getLojas() {
        return lojas;
    }

    public void setLojas(Loja[] lojas) {
        this.lojas = lojas;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Endereço: " + endereco + ", Lojas: " + Arrays.toString(lojas);
    }


}
