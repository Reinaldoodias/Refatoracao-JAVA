public class Estagiario implements Pagavel {

    @Override
    public double getValorBasePagamento() {
        return this.getBolsa();
    }

    @Override
    public double getValorExtras() {
        return this.getAuxilios();
    }

    @Override
    public void processarPagamento(double valorTotal) {
        // Mapeamos para o método "paga"
        this.paga(valorTotal); 
    }
}