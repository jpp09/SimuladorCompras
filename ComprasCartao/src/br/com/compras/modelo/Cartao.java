package br.com.compras.modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

public class Cartao{
    private double saldo;
    private List<Compra> compras = new ArrayList<>();
    public Cartao(double saldo){
        this.saldo = saldo;
    }
    public void getCompras(){
        Collections.sort(compras);
        System.out.println("Lista de compras: ");
        for(Compra item : compras){
            System.out.println(item);
        }
    }

    public void comprar(Compra compra){
        if(compra.getValor() > this.saldo){
            System.out.println("\n*********************************\n");
            System.out.println("Limite de compra indisponivél");
            System.out.println("\n*********************************\n");
            System.out.println(String.format("Compra no valor: %.2f | Limite: %.2f",compra.getValor(),this.getSaldo()));
            System.out.println("\n*********************************\n");
            System.out.println("Compra não realizada");
            System.out.println("\n*********************************\n");
            if(this.compras.isEmpty()){
                System.out.println("Nenhuma compra realizada");
            }else{
                this.getCompras();
            }
            System.out.println("\n*********************************\n");
        }else{
            this.compras.add(compra);
            this.saldo -= compra.getValor();
            System.out.println("\n*********************************\n");
            System.out.println("Compra realizada com sucesso");
            System.out.println("\n*********************************\n");
        }
    }

    public double getSaldo(){
        return this.saldo;
    }



}
