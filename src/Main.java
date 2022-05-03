
import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner choice = new Scanner(System.in);
        System.out.println("Welcome to currency converter " +
                "Please choose an option (1/2):" +
                "1.Dollars to Shekels" +
                "2.Shekels to Dollars");
        int userChoice = choice.nextInt();
        if (userChoice == 1){
        Coin ilsValue = CoinFactory.getCoinInstance(Coins.USD);
        double value = ilsValue.calculate(choice.nextDouble());
        }else if (userChoice == 2) {
            Coin usdValue = CoinFactory.getCoinInstance(Coins.ILS);
            double value = usdValue.calculate(choice.nextDouble());
        }
        Scanner value = new Scanner(System.in);
        System.out.println("Please enter an amount to convert");
        double valueToConvert = choice.nextDouble();
        ArrayList <Double> resultsList = new ArrayList<Double>();
        resultsList.add(choice.nextDouble());
        System.out.println(resultsList);


    }
}




