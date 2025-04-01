import br.com.compras.modelo.Cartao;
import br.com.compras.modelo.Compra;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner saldo = new Scanner(System.in);
        Scanner valor = new Scanner(System.in);
        Scanner descricao = new Scanner(System.in);
        Scanner choiceBreak = new Scanner(System.in);

        System.out.print("Digite o limte do cartão: ");
        Cartao itau = new Cartao(saldo.nextDouble());

        while (true){
            Compra novaCompra = new Compra();
            System.out.print("Digite a descrição do produto: ");
            novaCompra.setDescricao(descricao.nextLine());
            System.out.print("Digite o valor do produto: ");
            novaCompra.setValor(valor.nextDouble());
            itau.comprar(novaCompra);
            System.out.println("Deseja continuar comprando? 1-Sim / 2-Não");
            if(choiceBreak.nextInt() == 2){
                System.out.println("Obrigado pelas compras");
                break;
            }

        }

        itau.getCompras();
    }
}