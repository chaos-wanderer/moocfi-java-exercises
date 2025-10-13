
public class Main {

    public static void main(String[] args) {
        // test your classes here
        Box firstBox = new Box(100);
        Box secondBox = new Box(50);
        Box thirdBox = new Box(25);

        thirdBox.add(new Book("Fyodor Dostoevsky", "Crime and Punishment", 2)) ;
        secondBox.add(new Book("Robert Martin", "Clean Code", 1));
        firstBox.add(new Book("Kent Beck", "Test Driven Development", 0.7));

        thirdBox.add(new CD("Pink Floyd", "Dark Side of the Moon", 1973));
        secondBox.add(new CD("Wigwam", "Nuclear Nightclub", 1975));
        firstBox.add(new CD("Rendezvous Park", "Closer to Being Here", 2012));

        secondBox.add(thirdBox);
        firstBox.add(secondBox);

        System.out.println(thirdBox);
        System.out.println();
        System.out.println(secondBox);
        System.out.println(firstBox);

    }

}
