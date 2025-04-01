package src.modelos;

import src.Servicos.GatewayPagamento;

public class Pagamento {
    private double valor; 
    private GatewayPagamento gateway;

    public Pagamento(double valor,GatewayPagamento gateway){
        this.valor = valor;
        this.gateway = gateway;
    }

    public void realizarPagamento(){
        gateway.processarPagamento(valor); 
    }
}
