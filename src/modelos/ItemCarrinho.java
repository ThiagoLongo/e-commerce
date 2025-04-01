package src.modelos;

class ItemCarrinho{
    private Produto produto;
    private int quantidade;

    public ItemCarrinho (Produto produto, int quantidade){
        this.produto = produto;
        this.quantidade = quantidade;
    }

        public double calcularSubtotal() {
            return produto.getPreco() * quantidade;
        }

    
}