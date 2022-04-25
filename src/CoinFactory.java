public class CoinFactory {
    public static Coin getCoinInstance(Coins coin) {
        switch (coin) {
            case ILS:
                return new ILS();
            break;
            case USD:
                return new USD();
            break;
            default:
        }
    }
}
