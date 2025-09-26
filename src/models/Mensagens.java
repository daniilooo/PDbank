package models;

public class Mensagens {

    public static String msgAbertura(){
        String msgAbertura = String.format("""
                Bem vindo ao PDBank""");
        return msgAbertura;
    }

    public static String menu(){
        String menu = String.format("""
                1 - Abrir nova conta
                2 - Listar contas abertas
                3 - Consultar saldo
                4 - Fazer depósito
                5 - Fazer saque
                6 - Fechar conta
                7 - Encerrar
                
                Digite a opção desejada.""");

        return menu;
    }

    public static String msgOpcaoInvalida(){
        String msgOpcaoInvalida = String.format("""
                Opção inválida, digite apenas números inteiros correspondente a opção do menu.""");
        return msgOpcaoInvalida;
    }

    public static String msgValorInvalido(){
        String msgValorInvalido = String.format("""
                Digite um número válido para depósito/saque""");
        return msgValorInvalido;
    }

    public static String msgSaida(){
        String msgSaida = String.format("""
                Obrigado, até mais.
                PDBank By Danilo Franco.""");
        return msgSaida;
    }

    public static String msgSemContasAbertas(){
        String msgSemContasAbertas = String.format("""
                Nenhuma conta foi aberta ainda.""");

        return msgSemContasAbertas;
    }

    public static String msgContaInvalida(){
        String msgContaInvalida = String.format("""
                Digite o numero de uma conta válida.
                Antes de consultar o saldo, verifique o numero da conta listando todas as contas abertas""");
        return msgContaInvalida;
    }

    public static String msgDigiteNome(){
        String msgDigiteNome = String.format("""
                Digite o nome do titular da conta.""");
        return msgDigiteNome;
    }

    public static String msgContaAberta(){
        String msgContaAberta = String.format("""
                Conta Aberta com sucesso""");

        return msgContaAberta;
    }

    public static String msgFalhaAbertura(){
        String msgFalhaAbertura = String.format("""
                Não foi possível abrir a conta, contate o ADM do sistema""");

        return msgFalhaAbertura;
    }

    public static String msgDigiteNumeroConta(){
        String msgDigiteNumeroConta = String.format("""
                Digite o numero da conta.""");

        return msgDigiteNumeroConta;
    }

    public static String msgValorSaque(){
        String msgValorSaque = String.format("""
                Digite o valor que deseja sacar:""");
        return msgValorSaque;
    }

    public static String msgValorDeposito(){
        String msgValorDeposito = String.format("""
                Digite o valor que deseja depositar:""");
        return msgValorDeposito;
    }

    public static String msgSucessoDeposito(){
        String msgSucessoDeposito = String.format("""
                Depósito efetuado com sucesso.""");

        return msgSucessoDeposito;
    }

    public static String msgFalhaDeposito(){
        String msgFalhaDeposito = String.format("""
                Não foi possível fazer o depósito, contate o adminsitrador do sistema""");
        return msgFalhaDeposito;
    }

    public static String msgSucessoSaque(){
        String msgSucessoSaque = String.format("""
                Saque realizado com sucesso.""");
        return msgSucessoSaque;
    }

    public static String msgFalhaSaque(){
        String msgFalhaSaque = String.format("""
                Não foi possível realizar o saque, contate o ADM do sistema""");
        return msgFalhaSaque;
    }

    public static String msgSemSaldo(){
        String msgSemSaldo = String.format("""
                Saldo insuficiente para realizar essa operação.""");

        return msgSemSaldo;
    }

}
