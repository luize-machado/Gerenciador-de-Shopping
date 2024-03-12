package etapa1;

//classe Loja
public class Loja {
    //atributos
    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;

    //método construtor 1
    public Loja (String nome, int quantidadeFuncionarios, double salarioBaseFuncionario){
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }

    //método construtor 2
    public Loja (String nome, int quantidadeFuncionarios){
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = -1;
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



    @Override
    public String toString() {
        return "Loja: " +
                "nome='" + nome + '\'' +
                ", quantidadeFuncionarios=" + quantidadeFuncionarios +
                ", salarioBaseFuncionario=" + salarioBaseFuncionario;
    }    
}    
