import java.util.*;
public class HashSetSimulation {
    private List<Integer> elements;

    public HashSetSimulation() {
        elements = new ArrayList<>();
    }

    public boolean add(int value) {
        if (!elements.contains(value)) {
            elements.add(value);
            return true;
        }
        return false;
    }

    public String toString() {
        return elements.toString();
    }

    public int get(int index) {
        if (index < 0 || index >= elements.size()) {
            throw new IndexOutOfBoundsException("Index out of range: " + index);
        }
        return elements.get(index);
    }

    public static void main(String[] args) {
        HashSetSimulation set = new HashSetSimulation();
        set.add(10);
        set.add(20);
        set.add(30);
        System.out.println(set); // [10, 20, 30]
        System.out.println(set.get(0)); // 10
        System.out.println(set.get(1)); // 20
    }
}
