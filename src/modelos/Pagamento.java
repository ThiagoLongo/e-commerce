package src.modelos;

import src.Servicos.GatewayPagamento;

public class Pagamento {
    private GatewayPagamento gateway;

    public Pagamento(GatewayPagamento gateway) {
        this.gateway = gateway;
    }

    public void processarPagamento(Pedido pedido) {
        boolean sucesso = gateway.processarPagamento(pedido.getTotalPedido());
        
        if (sucesso) {
            System.out.println("Pagamento realizado com sucesso!");
        } else {
            System.out.println("Falha no pagamento.");
        }
    }
}