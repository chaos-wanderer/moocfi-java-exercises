import validating.Calculator;
import validating.Person;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Person person = new Person("loyd", 20);

        System.out.println(person);

        calculator.binomialCoefficent(26, 25);
    }
}
