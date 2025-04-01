package src.main;

import src.modelos.Carrinho;
import src.modelos.Produto; 

public class Main {
    public static void main(String[] args) {
        
    Produto produto1 = new Produto("Computador", 1000.0);
    Produto produto2 = new Produto("Celular", 2000.0);


    Carrinho carrinho1 = new Carrinho();
    carrinho1.adicionarItem(produto1, 1);
    carrinho1.adicionarItem(produto2, 1);

    System.out.println("Total no carrinho: " + carrinho1.calcularTotal());
    
    }
}   
