public class Endereco {
    
    //Atributos
    private String nomeDaRua;
    private String cidade;
    private String estado;
    private String pais;
    private String cep;
    private String numero;
    private String complemento;

    //Método Contrutor 1;
    public Endereco(String nomeDaRua, String cidade, String estado, String pais, String cep, String numero, String complemento) {
        this.nomeDaRua = nomeDaRua;
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;
        this.cep = cep;
        this.numero = numero;
        this.complemento = complemento;
    }

    //Métodos de Acesso: Getters & Setters
    //Getter e Setter = nomeDaRua;
    public String getNomeDaRua() {
        return nomeDaRua;
    }
    public void setNomeDaRua(String nomeDaRua) {
        this.nomeDaRua = nomeDaRua;
    }

    //Getter e Setter = cidade;
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    //Getter e Setter = estado;
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }

    //Getter e Setter = pais;
    public String getPais() {
        return pais;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }

    //Getter e Setter = cep;
    public String getCep() {
        return cep;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }

    //Getter e Setter = numero;
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }

    //Getter e Setter complemento;
    public String getComplemento() {
        return complemento;
    }
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    //Método toString;
    @Override
    public String toString() {
        return "Nome da rua: " + nomeDaRua + ", cidade: " + cidade + ", Estado: " + estado + ", Pais: " + pais + ", CEP: " + cep + ", Numero: " + numero + ", Complemento: " + complemento;
    }

}
