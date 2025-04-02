package src.modelos;
public class Pedido {
    private Carrinho carrinho;
    private NotaFiscal notaFiscal;

    public Pedido(Carrinho carrinho) {
        this.carrinho = carrinho;
        this.notaFiscal = new NotaFiscal();
    }

    public double getTotalPedido() {
        return carrinho.calcularTotal();
    }

    public NotaFiscal getNotaFiscal() {
        return notaFiscal;
    }

    public void exibirPedido() {
        notaFiscal.exibirNota();
        System.out.println("Total pago: R$" + getTotalPedido());
    }
}
