package src.main;

import src.modelos.*;
import src.Servicos.GatewayPagamento;

public class Main {
    public static void main(String[] args) {

        Produto teclado = new Produto("Teclado Mecânico", 150.0);
        Produto mouse = new Produto("Mouse Gamer", 100.0);

        Carrinho carrinho1 = new Carrinho();
        carrinho1.adicionarItem(teclado, 2);
        carrinho1.adicionarItem(mouse, 1);

        carrinho1.exibirTotal();

        Pedido pedido1 = new Pedido(carrinho1);

        GatewayPagamento gateway1 = new GatewayPagamento();
        Pagamento pagamento1 = new Pagamento(gateway1);
        pagamento1.processarPagamento(pedido1);

        pedido1.exibirPedido();
    }
}  
