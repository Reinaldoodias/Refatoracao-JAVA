public class Conservador() implements Investimento{
    @Override
    public double calculaRetorno(Double valorInvestido){
        return valorInvestido*0.008;
    }

}