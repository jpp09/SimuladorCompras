package br.com.compras.modelo;

public class Compra implements Comparable<Compra>{
    private double valor;
    private String descricao;

    public void setValor(double valor){
        this.valor = valor;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public double getValor(){
        return this.valor;
    }

    public String getDescricao(){
        return this.descricao;
    }

    @Override
    public String toString(){
        return String.format("Descrição: %s | Preço: %.2f",this.getDescricao(),this.getValor());
    }

    @Override
    public int compareTo(Compra item){
        if(this.getValor() < item.getValor()){
            return -1;
        }else if(this.getValor() > item.getValor()){
            return 1;
        }else {
            return 0;
        }

    }


}
