package etapa4;

import java.util.Arrays;

public class Shopping {
    //atributos da classe Shopping
    private String nome;
    private Endereco endereco;
    private Loja[] lojas;

//método construtor
public Shopping(String nome, Endereco endereco, int quantidadeMaximaLojas){
    this.nome = nome;
    this.endereco = endereco;
    this.lojas = new Loja[quantidadeMaximaLojas];
}

//getters e setters
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

//método insereLoja insere uma nova loja no array de lojas do shopping
public boolean insereLoja(Loja novaLoja) {
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] == null) {
                lojas[i] = novaLoja;
                return true; //loja inserida
            }
        }
        return false; //loja não inserida
    }

//método removeLojas remove uma loja do array de lojas com base no nome da loja
public boolean removeLoja(String nomeLoja) {
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] != null && lojas[i].getNome().equalsIgnoreCase(nomeLoja)) {
                lojas[i] = null;
                return true; //loja removida
            }
        }
        return false; //loja não encontrada
    }

//método quantidadeLojasPorTipo
public int quantidadeLojasPorTipo(String nomeLoja) {
int quantidadeLojas = 0;//variável p armazenar a quantidade de lojas encontradas

if (nomeLoja != null){ //verifica se o nome da loja fornecido não é nulo
    for (int i = 0; i < lojas.length; i++) {
        //verifica se é uma instância do tipo de loja 
        if ((lojas[i] instanceof Alimentacao && nomeLoja.equalsIgnoreCase("Alimentação")) || 
        (lojas[i] instanceof Bijuteria && nomeLoja.equalsIgnoreCase("Bijuteria")) ||
        (lojas[i] instanceof Cosmetico && nomeLoja.equalsIgnoreCase("Cosmético")) ||
        (lojas[i] instanceof Informatica && nomeLoja.equalsIgnoreCase("Informática")) ||
        (lojas[i] instanceof Vestuario && nomeLoja.equalsIgnoreCase("Vestuário"))) {
            quantidadeLojas++; //quantidade de lojas encontradas
            }
        }
    }
    if (quantidadeLojas > 0) {
        return quantidadeLojas;     
    } else {
        return -1; //se nenhuma loja for encontrada
    }
}

//método lojaSeguroMaisCaro
public Informatica lojaSeguroMaisCaro() {
Informatica lojaMaiorSeguro = null; //variável p armazenar a loja com o seguro mais caro
double maiorValorSeguro = 0; //variável p armazenar o valor do seguro mais caro encontrado

for (int i = 0; i < lojas.length; i++) {
            //Verifica se o array não é nulo e se é uma instância da classe Informatica
            if (lojas[i] != null && lojas[i] instanceof Informatica) {
                Informatica informatica = (Informatica) lojas[i]; //converte o array p tipo Informatica
                //verifica se o valor do seguro eletrônico da loja é maior que o valor do seguro mais caro encontrado até o momento
                if (informatica.getSeguroEletronicos() > maiorValorSeguro) {
                    maiorValorSeguro = informatica.getSeguroEletronicos(); //atualiza o valor do seguro mais caro
                    lojaMaiorSeguro = (Informatica) lojas[i]; //armazena a loja com o seguro mais caro
                }
            }
        }
        return lojaMaiorSeguro; //retorna a loja de informática com o seguro mais caro
    }

    @Override
    public String toString() {
        return "Shopping:" +
                "nome=" + nome + 
                ", endereco=" + endereco +
                ", lojas=" + Arrays.toString(lojas);
    }

}