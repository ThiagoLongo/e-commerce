package src.modelos;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    List<ItemCarrinho> itens;

    public Carrinho(){
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(Produto produto, int quantidade){
        this.itens.add(new ItemCarrinho(produto, quantidade));
    }

    public double calcularTotal() {
        double total = 0;
        for (ItemCarrinho item : itens) {
            total += item.calcularSubtotal();
        }    
        return total;
    }

    public double exibirTotal(){
        double total = 0;
        for (ItemCarrinho item : itens) {
            total += item.calcularSubtotal();
        }    
        System.out.println("Total: "+ total);
        return total;
    }

    public List<ItemCarrinho> getItens(){
        return itens; 
    }
}
