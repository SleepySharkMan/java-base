import java.util.List;

public class ListOfFruits {
    List<String> fruits;

    public ListOfFruits(List<String> fruits) {
        this.fruits = fruits;
    }

    public void printList() {
        for (int i = 0; i < fruits.size(); i++) {
            System.out.println((i + 1) + "." + fruits.get(i));
        }
    }

    @Override
    public String toString() {
        StringBuilder listToString = new StringBuilder();
        for (int i = 0; i < fruits.size(); i++) {
            if (i > 0) {
                listToString.append("\n");
            }
            listToString.append((i + 1) + "." + fruits.get(i));
        }
        return listToString.toString();
    }
}
