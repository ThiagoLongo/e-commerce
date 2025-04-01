package src.modelos;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private int id;
    private NotaFiscal notaFiscal; 
    private List<ItemCarrinho> itens;    

    public Pedido(int id){
        this.id = id; 
        this.itens = new ArrayList<>();
        this.notaFiscal = new NotaFiscal(this);
    }

    public void adicionarItem(ItemCarrinho item){
        this.itens.add(item);
    }
    public void gerarNotaFiscal(){
        notaFiscal.emitirNota();
    }
    public void processarPagamento(Pagamento pagamento) {
        pagamento.realizarPagamento();
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
