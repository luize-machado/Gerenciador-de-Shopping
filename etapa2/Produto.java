package etapa2;

public class Produto {
    //atributos
    private String nome;
    private double preco;
    private Data dataValidade;

    //método construtor
    public Produto (String nome, double preco, Data dataValidade){

        this.nome = nome;
        this.preco = preco;
        this.dataValidade = dataValidade;
    }

    //método estaVencido
    public boolean estaVencido(Data dataAtual) 
    {
        if (dataAtual.getAno() >= this.dataValidade.getAno() || dataAtual.getMes() > this.dataValidade.getMes() || dataAtual.getDia() > this.dataValidade.getDia())
            return true;
        else
            return false;
    }
    
    //getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Data getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Data dataValidade) {
        this.dataValidade = dataValidade;
    }

    @Override
    public String toString() {
        return "Produto: " +
               "nome='" + nome + '\'' +
               ", preco=" + preco +
               ", dataValidade=" + dataValidade;
    }
}

