import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Задача №1");
        Person person = new Person("Ivan", "Ivanov", 10);
        person.introduce();
        System.out.println();

        System.out.println("Задача №2");
        ListOfFruits fruits = new ListOfFruits(List.<String>of("Яблоко", "Апельсин", "Киви", "Гранат", "Хурма"));
        System.out.println(fruits.toString());
        System.out.println();
        fruits.printList();
        System.out.println();

        System.out.println("Задача №3");
        ListOfPrices prices = new ListOfPrices(List.<Double>of(5000.00, 320.50, 999.75, 7000.66, 1234.42));
        System.out.println("Цена товаров: " + prices.sumOfPrices());
        System.out.println(prices.enoughBudget(18000));
        System.out.println();

        System.out.println("Задача №4");
        UpgradedListOfPrices upgradedPrices = new UpgradedListOfPrices(List.<Double>of(5000.00, 320.50, 999.75, 7000.66, 1234.42));
        System.out.println("Сколко вещей получится купить: " + upgradedPrices.countAffordable(18000));
    }
}