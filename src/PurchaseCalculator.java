import java.util.List;

public class PurchaseCalculator extends ListOfPrices {

    public PurchaseCalculator(List<Double> prices) {
        super(prices);
    }

    public String countAffordable(double budget) {
        int amountOfProducts = 0;
        double total = 0;
        while (amountOfProducts < prices.size() && budget >= total + prices.get(amountOfProducts)) {
            total += prices.get(amountOfProducts);
            amountOfProducts++;
        }
        return "Куплено: %d товара на сумму %.2f\nОстаток бюджета: %.2f\nНе куплено: %d товара"
                .formatted(amountOfProducts, total, (budget - total), (prices.size() - amountOfProducts));
    }
}
