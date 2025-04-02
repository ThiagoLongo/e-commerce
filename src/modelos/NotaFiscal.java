package src.modelos;

class NotaFiscal {
    private int numero;
    private static int contador = 1;

    public NotaFiscal() {
        this.numero = contador++;
    }

    public void exibirNota() {
        System.out.println("Nota Fiscal Nº: " + numero);
        
    }

    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
