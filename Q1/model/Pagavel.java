public interface Pagavel {
  
    double getValorBasePagamento();

    double getValorExtras();

    void processarPagamento(double valorTotal);
}