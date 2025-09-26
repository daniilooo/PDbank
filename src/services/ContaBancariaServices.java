package services;

import models.ContaBancaria;

import java.util.ArrayList;
import java.util.List;

public class ContaBancariaServices {

    List<ContaBancaria> listContasBancarias = new ArrayList<>();

    public ContaBancaria abrirContaBancaria(int numeroConta, String titular){
        try{
            ContaBancaria contaBancaria = new ContaBancaria(numeroConta, titular, 0.0);
            listContasBancarias.add(contaBancaria);
            return contaBancaria;
        }catch (Exception e){
            return null;
        }

    }

    private ContaBancaria buscarConta(int numeroConta){

        for(ContaBancaria conta : listContasBancarias){
            if(conta.getNumeroConta() == numeroConta){
                return conta;
            }
        }
        return  null;
    }

    public ContaBancaria consultarSaldo(int numeroConta){
        ContaBancaria contaBancaria = this.buscarConta(numeroConta);
        return contaBancaria;
    }

    public ContaBancaria fazerDeposito(int numeroConta, double valorDeposito){
        ContaBancaria contaBancaria = this.buscarConta(numeroConta);

        if(contaBancaria != null && valorDeposito > 0.0){
            contaBancaria.setSaldo(contaBancaria.getSaldo() + valorDeposito);
            return contaBancaria;
        }

        return null;
    }

    public ContaBancaria fazerSaque(int numeroConta, double valorSaque){
        ContaBancaria contaBancaria = this.buscarConta(numeroConta);

        if(contaBancaria != null && valorSaque > 0.0 && contaBancaria.getSaldo() > valorSaque){
            contaBancaria.setSaldo(contaBancaria.getSaldo() - valorSaque);
            return contaBancaria;
        }

        return null;

    }

    public List<ContaBancaria> listarContasAbertas(){
        return listContasBancarias;
    }



}
