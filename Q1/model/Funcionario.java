public class Funcionario implements Pagavel {

    @Override
    public double getValorBasePagamento() {
        return this.getSalario();
    }

    @Override
    public double getValorExtras() {
        return this.getBonus();
    }

    @Override
    public void processarPagamento(double valorTotal) {
        this.depositaNaConta(valorTotal);
    }
}