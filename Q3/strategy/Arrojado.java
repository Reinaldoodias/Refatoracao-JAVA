import java.util.Random;

public class Arrojado implements Investimento {
    private Random random;

    public Arrojado() {
        this.random = new Random();
    }

    @Override
    public double calculaRetorno(double valorInvestido) {
        double chance = random.nextDouble();

        if (chance <= 0.20) { // 20% de chance
            return valorInvestido * 0.05;
        } else if (chance <= 0.50) { // 30% de chance (0.20 + 0.30)
            return valorInvestido * 0.03;
        } else { // 50% de chance restante
            return valorInvestido * 0.006;
        }
    }
}