import java.util.Objects;

public class MultiplicationTask {
    private int firstNumber;
    private int secondNumber;

    public MultiplicationTask(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MultiplicationTask multiplicationTask = (MultiplicationTask) o;
        return (firstNumber == multiplicationTask.firstNumber && secondNumber == multiplicationTask.secondNumber) ||
                (firstNumber == multiplicationTask.secondNumber && secondNumber == multiplicationTask.firstNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstNumber*secondNumber, firstNumber+secondNumber);
    }
}
