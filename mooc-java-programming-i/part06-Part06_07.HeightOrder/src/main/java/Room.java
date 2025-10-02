import java.util.ArrayList;

public class Room {
    private ArrayList<Person> persons;

    public Room() {
        this.persons = new ArrayList<>();
    }

    public void add(Person person) {
        this.persons.add(person);
    }

    public boolean isEmpty() {
        return persons.isEmpty();
    }

    public ArrayList<Person> getPersons() {
        return this.persons;
    }

    public Person shortest() {
        if (this.isEmpty()) {
            return null;
        }

        Person shortest = persons.get(0);

        for (Person p : persons) {
            if (shortest.getHeight() > p.getHeight()) {
                shortest = p;
            }
        }

        return shortest;
    }

    public Person take() {
        if (this.isEmpty()) {
            return null;
        }

        Person shortest = this.shortest();

        Person tempShortest = shortest;

        persons.remove(tempShortest);

        return shortest;
    }
    
}
