package etapa3;

public class Data {
    private int dia;
    private int mes;
    private int ano;

//construtor
    public Data(int dia, int mes, int ano){
        if (validarData(dia, mes, ano)){
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;

        } else {
            System.out.println("Data inválida! Redefinindo para a data padrão: 1/1/2000");
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;
        }
    }      

//método auxiliar para o número de dias de cada mês
private boolean validarData(int dia, int mes, int ano) {
    if (dia < 1 || mes < 1 || mes > 12 || ano < 1) {
        return false;
    }

    int diasNoMes = diasNoMes(mes, ano);
    return dia <= diasNoMes;
}

//método auxiliar para obter o número de dias em um determinado mês
private int diasNoMes(int mes, int ano) {
    //feveireiro
    if (mes == 2) {
        if (verificaAnoBissexto()) {
            return 29;
        } else {
            return 28;
        }
    //abril, junho, setembro e novembro    
    } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
        return 30;
    //janeiro, março, maio, julho, agosto, outubro e dezembro    
    } else {
        return 31;
    }
}

//método verificaAnoBissexto
public boolean verificaAnoBissexto() {
    if ((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0) {
        return true;
    }
    return false;
}

//getters e setters
public int getDia() {
    return dia;
}
public void setDia(int dia) {
    this.dia = dia;
}
public int getMes() {
    return mes;
}
public void setMes(int mes) {
    this.mes = mes;
}
public int getAno() {
    return ano;
}
public void setAno(int ano) {
    this.ano = ano;
}

 @Override
    public String toString() {
        return dia + "/" + mes + "/" + ano;
    }
}