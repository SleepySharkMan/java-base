import java.util.List;

public class ListOfFruits {
    private List<String> fruits;

    public ListOfFruits(List<String> fruits) {
        this.fruits = fruits;
    }

    public void printList() {
        for (int i = 0; i < fruits.size(); i++) {
            System.out.println((i + 1) + "." + fruits.get(i));
        }
    }
}
