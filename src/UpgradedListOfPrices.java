import java.util.List;

public class UpgradedListOfPrices extends ListOfPrices {

    public UpgradedListOfPrices(List<Double> prices) {
        super(prices);
    }

    public int countAffordable(double budget) {
        int amountOfProducts = 0;
        double total = 0;
        while (amountOfProducts < prices.size() && budget >= total + prices.get(amountOfProducts)) {
            total += prices.get(amountOfProducts);
            amountOfProducts++;
        }
        return amountOfProducts;
    }
}
