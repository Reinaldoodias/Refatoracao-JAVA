import java.util.Random;

public class Moderado implements Investimento {
    private Random random;

    public Moderado() {
        this.random = new Random();
    }

    @Override
    public double calculaRetorno(double valorInvestido) {
        if (random.nextDouble() > 0.50) { // 50% de chance
            return valorInvestido * 0.025;
        } else {
            return valorInvestido * 0.007;
        }
    }
}