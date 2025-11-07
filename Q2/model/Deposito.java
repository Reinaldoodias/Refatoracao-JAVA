/**
 * PASSO 3: Refatorar Deposito.
 * Ela também "tem uma" InfoMovimentacao.
 */
public class Deposito {

    // Composição
    private InfoMovimentacao info;

    // Atributo específico do Deposito
    private String numeroEnvelope;

    public Deposito(InfoMovimentacao info, String numeroEnvelope) {
        this.info = info;
        this.numeroEnvelope = numeroEnvelope;
    }


    // Getters e Setters
    public InfoMovimentacao getInfo() {
        return info;
    }

    public String getNumeroEnvelope() {
        return numeroEnvelope;
    }
  
}