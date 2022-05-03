public class USD extends Coin {
    private  final double usdValue = 3.52;
    @Override
    public double getValue() {
        return usdValue;
    }
    @Override
    public double calculate (double input){
        return  input * getValue();
    }
}
