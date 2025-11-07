import java.util.Calendar;

// Classe auxiliar
class Conta {
    private String numero;
}

public class InfoMovimentacao {
    private double valor;
    private Conta conta;
    private Calendar data;

    public InfoMovimentacao(double valor, Conta conta, Calendar data) {
        this.valor = valor;
        this.conta = conta;
        this.data = data;
    }

    // Getters
    public double getValor() {
        return valor;
    }

    public Conta getConta() {
        return conta;
    }

    public Calendar getData() {
        return data;
    }
}