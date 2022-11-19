import java.util.*;

public class MultiplicationTable {
    private final Set<MultiplicationTask> multitasks = new HashSet<>();

    public MultiplicationTable(int firstNumber, int secondNumber) {
        Random random = new Random();
        while (multitasks.size() < 15) {
            multitasks.add(new MultiplicationTask(random.nextInt(10), random.nextInt(10)));
        }
    }

    @Override
    public String toString() {
        return "Таблица умножения: " +
                "задание:" + multitasks;
    }
}




