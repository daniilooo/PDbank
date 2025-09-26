import models.ContaBancaria;
import models.Mensagens;
import services.ContaBancariaServices;

import java.util.Random;
import java.util.Scanner;

public class pdbank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;
        ContaBancariaServices contaBancariaServices = new ContaBancariaServices();

        System.out.println(Mensagens.msgAbertura());

        do{
            System.out.println(Mensagens.menu());

            try{
                String opcao = sc.nextLine();
                int numeroOpcao = Integer.parseInt(opcao);

                switch (numeroOpcao){
                    case 1:
                        //abertura de conta
                        System.out.println(Mensagens.msgDigiteNome());
                        String nome = sc.nextLine();
                        int numeroDaConta = contaBancariaServices.listarContasAbertas().size() + 1;

                        ContaBancaria contaBancaria = contaBancariaServices.abrirContaBancaria(numeroDaConta, nome);

                        if(contaBancaria != null){
                            System.out.println(Mensagens.msgAbertura());
                        } else {
                            System.out.println(Mensagens.msgFalhaAbertura());
                        }

                        break;
                    case 2:
                        //listar contas
                        if(!contaBancariaServices.listarContasAbertas().isEmpty()){
                            for (ContaBancaria conta : contaBancariaServices.listarContasAbertas()){
                                System.out.println(conta);
                            }
                        } else {
                            System.out.println(Mensagens.msgSemContasAbertas());
                        }
                        break;
                    case 3:
                        //consulta de saldos
                        try{
                            System.out.println(Mensagens.msgDigiteNumeroConta());
                            String campoNumeroConta = sc.nextLine();
                            int numeroConta = Integer.parseInt(campoNumeroConta);

                            contaBancaria = contaBancariaServices.consultarSaldo(numeroConta);
                            if(contaBancaria != null){
                                System.out.println(contaBancaria);
                            } else {
                                System.out.println(Mensagens.msgContaInvalida());
                            }

                        }catch (NumberFormatException e ){
                            System.out.println(Mensagens.msgContaInvalida());
                        }
                        break;
                    case 4:
                        //fazer depósitos

                        try{
                            System.out.println(Mensagens.msgDigiteNumeroConta());
                            String campoNumeroConta = sc.nextLine();
                            int numeroConta = Integer.parseInt(campoNumeroConta);

                            System.out.println(Mensagens.msgValorDeposito());
                            String campoValor = sc.nextLine();
                            double valorDeposito = Double.parseDouble(campoValor);

                            contaBancaria = contaBancariaServices.fazerDeposito(numeroConta, valorDeposito);

                            if(contaBancaria != null){
                                System.out.printf(Mensagens.msgSucessoDeposito());
                            }else {
                                System.out.println(Mensagens.msgFalhaDeposito());
                            }
                        } catch (NumberFormatException e){
                            System.out.println(Mensagens.msgValorInvalido());
                        }

                        break;
                    case 5:
                        //fazer saques

                        break;
                    case 6:
                        //encerrar conta
                        break;
                    case 7:
                        continuar = false;
                        System.out.printf(Mensagens.msgSaida());
                        break;
                    default:
                }

            }catch(NumberFormatException e){
                System.out.printf(Mensagens.msgOpcaoInvalida());
            }

        } while(continuar);

    }
}
