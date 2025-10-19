package validating;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        if ((name == null || name.length() > 40 || name.isEmpty()) ||
            (age < 0 || age > 120 )) {
                throw new IllegalArgumentException("Name should not be empty, and does not exceeds 40 characters." + 
                    "\nAge should be between 0 to 120 only.");
            }

        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
