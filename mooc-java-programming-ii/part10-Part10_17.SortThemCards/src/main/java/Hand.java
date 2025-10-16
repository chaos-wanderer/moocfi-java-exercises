import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Hand implements Comparable<Hand> {

    private List<Card> hand;

    public Hand() {
        this.hand = new ArrayList<>();
    }

    public void add(Card card) {
        this.hand.add(card);
    }

    public void print() {
        hand.stream().forEach(System.out::println);
    }

    public void sort() {
        Collections.sort(hand);
    }

    @Override
    public int compareTo(Hand compared) {
        // int thisHandTotal = 0;

        // for (Card card : this.hand) {
        //     thisHandTotal += card.getValue();
        // }

        // int comparedHandTotal = 0;

        // for (Card card : compared.hand) {
        //     comparedHandTotal += card.getValue();
        // }

        // return Integer.compare(thisHandTotal, comparedHandTotal);

        // lets use stream

        int thisHandTotal = this.hand.stream()
            .mapToInt(c -> c.getValue())
            .sum();
        
        int comparedHandTotal = compared.hand.stream()
            .mapToInt(Card::getValue)
            .sum();
        
        return Integer.compare(thisHandTotal, comparedHandTotal);
    }

    public void sortBySuit() {

        Collections.sort(this.hand, new BySuitInValueOrder());
    }


    
}
