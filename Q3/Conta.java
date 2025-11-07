public class Conta{
    private double saldo;

    public void depositar(double valor){
        this.saldo += valor;
    }

    public double getSaldo(){
        return this.saldo;
    }


}