package org.example.pattern;

public class PagamentoPorPix implements TipoPagamento{

    private String chavePix;

    public PagamentoPorPix(String chavePix) {
        this.chavePix = chavePix;
    }

    @Override
    public void pagar(Double quantia) {
        // TODO Lógica de Pagamento por pix
        System.out.println("Pagamento de " + quantia + " Realizado com sucesso!");
    }

    public String getChavePix() {
        return chavePix;
    }

    public void setChavePix(String chavePix) {
        this.chavePix = chavePix;
    }
}
