package etapa3;

//classe filha
public class Alimentacao extends Loja {
    
    //atributo
    private Data dataAlvara;
    
    //herda os atributos da classe mãe
    public Alimentacao(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, Data dataAlvara) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao);
        this.dataAlvara = dataAlvara;
    }

    public Data getDataAlvara() {
        return dataAlvara;
    }

    public void setDataAlvara(Data dataAlvara) {
        this.dataAlvara = dataAlvara;
    }

    @Override
    public String toString () {
        return super.toString() + "Alimentação:" +
        "dataAlvara= " + dataAlvara;
    }
}    