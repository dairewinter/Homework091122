import java.util.List;
import java.util.Objects;
import java.util.Random;

public class MultiplicationTask {
    private int firstNumber;
    private int secondNumber;

    public MultiplicationTask(int firstNumber, int secondNumber)
    {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public static String getTask(List<Integer> multiplicationTasks){
        Random random = new Random();
        int randomIndex = random.nextInt(multiplicationTasks.size());
        int firstNumber = multiplicationTasks.get(randomIndex);
        int secondNumber = multiplicationTasks.get(randomIndex);
        return firstNumber + "*" + secondNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MultiplicationTask that = (MultiplicationTask) o;
        return firstNumber == that.firstNumber && secondNumber == that.secondNumber || firstNumber == that.secondNumber && secondNumber == that.firstNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstNumber, secondNumber);
    }

    @Override
    public String toString() {
        return firstNumber + "*" + secondNumber;
    }
}


