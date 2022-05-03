public class ILS extends Coin {
    private final double ilsValue = 0.28;
    @Override
    public double getValue() {
        return ilsValue;
    }
    @Override
    public double calculate (double input){
        return  input * getValue();
    }
}
