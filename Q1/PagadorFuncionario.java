public class PagadorDeFuncionario {

    public void paga(Pagavel pagavel) {
        double valorBase = pagavel.getValorBasePagamento();
        double valorExtras = pagavel.getValorExtras();
        double valorTotal = valorBase + valorExtras;

        pagavel.processarPagamento(valorTotal);
    }
}