import java.util.List;

public class ListOfPrices {
    protected List<Double> prices;

    public ListOfPrices(List<Double> prices) {
        this.prices = prices;
    }

    public Double sumOfPrices() {
        Double sum = 0D;
        for (Double element : prices) {
            sum += element;
        }
        return sum;
    }

    public String enoughBudget(double budget) {
        double total = sumOfPrices();
        if (budget > total) {
            return String.format("Бюджета достаточно, остаток: %.2f", budget - total);
        } else if (budget < total) {
            return String.format("Бюджета недостаточно, не хватает: %.2f", total - budget);
        }
        return "Бюджета ровно хватает";
    }
}