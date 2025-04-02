package src.Servicos;

public class GatewayPagamento {
    public boolean processarPagamento(double valor) {
        System.out.println("Processando pagamento de R$" + valor);
        return true; // Simulando pagamento aprovado
    }
}