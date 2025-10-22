public class Chefe implements Pagavel {
    
    @Override
    public double getValorBasePagamento() {
        return this.getSalarioBase();
    }

    @Override
    public double getValorExtras() {
        return this.getBonificacoes();
    }

    @Override
    public void processarPagamento(double valorTotal) {
        this.depositaNaConta(valorTotal);
    }
}