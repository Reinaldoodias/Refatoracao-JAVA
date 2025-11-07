
public class Pagamento {

    // Composição
    private InfoMovimentacao info;

    // Atributos específicos do Pagamento
    private String favorecido;
    private String formaDePagamento;

    public Pagamento(InfoMovimentacao info, String favorecido, String formaDePagamento) {
        this.info = info;
        this.favorecido = favorecido;
        this.formaDePagamento = formaDePagamento;
    }

    //Método Encargos
    public double getEncargos() {
        return this.info.getValor() * 0.01;
    }

    // Getters e Setters
    public InfoMovimentacao getInfo() {
        return info;
    }

    public String getFavorecido() {
        return favorecido;
    }
    
}