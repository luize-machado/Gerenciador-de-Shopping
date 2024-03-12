package etapa4;

//classe Loja
public class Loja {
    //atributos
    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;
    private Endereco endereco;
    private Data dataFundacao;
    private Produto[] estoqueProdutos;

    //método construtor 1
    public Loja (String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, int quantidadeMaximaProdutos){
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
        this.estoqueProdutos = new Produto[quantidadeMaximaProdutos];
    }

    //método construtor 2
    public Loja (String nome, int quantidadeFuncionarios, Endereco endereco, Data dataDeFundacao, int quantidadeMaximaProdutos){
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = -1;
        this.endereco = endereco;
        this.dataFundacao = dataDeFundacao;
        this.estoqueProdutos = new Produto[quantidadeMaximaProdutos];
    }
    //getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeFuncionarios() {
        return quantidadeFuncionarios;
    }

    public void setQuantidadeFuncionarios(int quantidadeFuncionarios) {
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    public double getSalarioBaseFuncionario() {
        return salarioBaseFuncionario;
    }

    public void setSalarioBaseFuncionario(double salarioBaseFuncionario) {
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }
    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Data getDataFundacao() {
        return dataFundacao;
    }

    public void setDataFundacao(Data dataFundacao) {
        this.dataFundacao = dataFundacao;
    }

    public Produto[] getEstoqueProdutos() {
        return estoqueProdutos;
    }

    public void setEstoqueProdutos(Produto[] estoqueProdutos) {
        this.estoqueProdutos = estoqueProdutos;
    }
    
    //método gastosComSalario
    public double gastosComSalario() {
        if(this.quantidadeFuncionarios == -1){
            return -1;
        }        
        else
            return this.quantidadeFuncionarios * this.salarioBaseFuncionario;    
    }

    //método tamanhoDaLoja
    public char tamanhoDaLoja() {
        if(this.quantidadeFuncionarios < 10){
            return 'P';
    }
        if(this.quantidadeFuncionarios <= 30){
            return 'M';
    }
            return 'G';
    }

    //método imprimeProduto verifica se o produto existe no estoque ou não e imprime os produtos disponíveis
    public void imprimeProdutos() {
    for (int i = 0; i < estoqueProdutos.length; i++) {
        Produto produto = estoqueProdutos[i];
        // Verifica se o espaço não é nulo e imprime
        if (produto != null) {
            System.out.println(produto);
        }
    }
}    

    //método insereProduto insere um novo produto no estoque
    public boolean insereProduto(Produto novoProduto) {
        for (int i = 0; i < estoqueProdutos.length; i++) {
            if (estoqueProdutos[i] == null) {
                estoqueProdutos[i] = novoProduto;
                return true; //produto inserido
            }
        }
        return false; //produto não inserido, pois não há espaço
    }

    //método removeProduto remove um produto do estoque com base no nome do produto
    public boolean removeProduto(String nomeProduto) {
        for (int i = 0; i < estoqueProdutos.length; i++) {
        //verifica se o estoque  não é nulo e se o nome do produto corresponde ao nome fornecido
            if (estoqueProdutos[i] != null && estoqueProdutos[i].getNome().equalsIgnoreCase(nomeProduto)) {
                estoqueProdutos[i] = null;
                return true; //produto removido
            }
        }
        return false; //produto não encontrado
    }

    @Override
    public String toString() {
        return "Loja: " +
                "nome='" + nome + '\'' +
                ", quantidadeFuncionarios=" + quantidadeFuncionarios +
                ", salarioBaseFuncionario=" + salarioBaseFuncionario +
                ", endereco=" + endereco +
                ", dataFundacao=" + dataFundacao +
                ", estoqueProdutos=" + estoqueProdutos;
    }    
}    




