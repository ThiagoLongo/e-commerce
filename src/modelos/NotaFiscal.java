package src.modelos;

public class NotaFiscal {
    private Pedido pedido;

    public NotaFiscal(Pedido pedido){
        this.pedido = pedido; 
    }

    public void emitirNota(){
        System.out.println("======= NOTA FISCAL =======");
        System.out.println("Pedido ID: "+ pedido.getId());
    }
}
