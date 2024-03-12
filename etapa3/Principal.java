package etapa3;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Loja loja = null; //variável p armazenar o objeto (inicializada como nula)
        Produto produto = null;
        int opcao = 0; //variável p armazenar a opção selecionada pelo usuário

        //loop enquanto a opção selecionada for diferente de 3 (opção de sair)
        while (opcao != 3) {
            System.out.println("(1) Criar uma loja");
            System.out.println("(2) Criar um produto");
            System.out.println("(3) Sair");
            System.out.print("Digite sua opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();
    
        //se a opção for igual a 1            
        if (opcao == 1) { 
            System.out.print("Digite o nome da loja: ");
            String nomeLoja = scanner.nextLine();
            System.out.print("Digite a quantidade de funcionários: ");
            int quantidadeFuncionarios = scanner.nextInt();
            System.out.print("Digite o salário base dos funcionários: ");
            double salarioBaseFuncionarios = scanner.nextDouble();
            scanner.nextLine();
    
            System.out.println("Digite o endereço da loja:");
            System.out.print("Cidade: ");
            String cidade = scanner.nextLine();
            System.out.print("Estado: ");
            String estado = scanner.nextLine();
            System.out.print("País: ");
            String pais = scanner.nextLine();
            System.out.print("Rua: ");
            String rua = scanner.nextLine();
            System.out.print("Número: ");
            String numero = scanner.nextLine();
            System.out.print("CEP: ");
            String cep = scanner.nextLine();
            System.out.print("Complemento: ");
            String complemento = scanner.nextLine();
            //criação do objeto Endereco c os dados fornecidos pelo usuário
            Endereco endereco = new Endereco(cidade, estado, pais, rua, numero, cep, complemento);
                
            System.out.print("Digite o dia de fundação da loja: ");
            int diaFundacao = scanner.nextInt();
            System.out.print("Digite o mês de fundação da loja: ");
            int mesFundacao = scanner.nextInt();
            System.out.print("Digite o ano de fundação da loja: ");
            int anoFundacao = scanner.nextInt();
            scanner.nextLine();
            //criação do objeto Data c a data do fundação fornecida
            Data dataFundacao = new Data(diaFundacao, mesFundacao, anoFundacao);
            
            //criação do objeto Loja c os daddos fornecidos
            loja = new Loja(nomeLoja, quantidadeFuncionarios, salarioBaseFuncionarios, endereco, dataFundacao);
            System.out.println("Loja criada com sucesso!");

            //se a opção for igual a 2
            } else if (opcao == 2) {
                if (loja == null) { //verifica se a loja já foi criada
                    System.out.println("Crie a loja antes de criar um produto.");

                } else {
                    System.out.print("Digite o nome do produto: ");
                    String nomeProduto = scanner.nextLine();
                    System.out.print("Digite o preço do produto: ");
                    double precoProduto = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Digite o dia de validade do produto: ");
                    int diaValidade = scanner.nextInt();
                    System.out.print("Digite o mês de validade do produto: ");
                    int mesValidade = scanner.nextInt();
                    System.out.print("Digite o ano de validade do produto: ");
                    int anoValidade = scanner.nextInt();
                    scanner.nextLine();
    
                    //cria um objeto do tipo Data c a data de validade fornecida
                    Data dataDeValidade = new Data(diaValidade, mesValidade, anoValidade);

                    //cria um objeto do tipo Produto c os dados fornecidos
                    produto = new Produto(nomeProduto, precoProduto, dataDeValidade);
                    System.out.println("Produto criado com sucesso!");
                }

            //se a opção for igual a 3    
            } else if (opcao == 3) {
                System.out.println("Saindo do programa...");
            } else { //se n for nenhuma das opções
                System.out.println("Opção inválida.");
            }
    
            //verifica se o objeto produto n é nulo
            if (produto != null) {
                Data dataAtual = new Data(20, 10, 2023); //cria um objeto c essa data
                if (produto.estaVencido(dataAtual)) //verifica se o produto está vencido comparando c a data atual
                    System.out.println("PRODUTO VENCIDO");
                else
                    System.out.println("PRODUTO NÃO VENCIDO");
            }
        }
        
        scanner.close();
    }
}    