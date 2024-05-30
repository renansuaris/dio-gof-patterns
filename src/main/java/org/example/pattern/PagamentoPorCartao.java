package org.example.pattern;

public class PagamentoPorCartao implements TipoPagamento {

    private String numeroCartao;

    public PagamentoPorCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    @Override
    public void pagar(Double quantia) {
        // TODO Lógica Da Função
        System.out.println("Pagamento de " + quantia + " realizado com sucesso!");
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }


}
