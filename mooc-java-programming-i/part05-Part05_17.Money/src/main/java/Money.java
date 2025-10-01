
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

    public Money plus(Money addition) {
        Money newMoney = new Money((this.euros + addition.euros), (this.cents + addition.cents));
        return newMoney;
    }

    public boolean lessThan(Money compared) {
        // if (this.euros < compared.euros) {
        //     return true;
        // } else if (this.euros == compared.euros &&
        //     this.cents < compared.cents) {
        //     return true;
        // }




        // return false;

        int thisTotal = this.euros * 100 + this.cents;
        int comparedTotal = compared.euros * 100 + compared.cents;

        if (thisTotal < comparedTotal) {
            return true;
        }

        return false;

    }

    public Money minus(Money decreaser) {
        int newEuros = this.euros - decreaser.euros;
        int newCents = this.cents - decreaser.cents;

        if (newCents < 0) {
            newCents = 100 + this.cents - decreaser.cents;
            newEuros -= 1;
        }

        if (newEuros < 0) {
            newEuros = 0;
            newCents = 0;
        }

        return (new Money(newEuros, newCents));

        // int thisTotal = this.euros * 100 + this.cents;
        // int decTotal = decreaser.euros * 100 + decreaser.cents;

        // int difference = thisTotal - decTotal;

        // if (difference < 0) {
        //     thisTotal = 0;
        // }

        // return new Money((difference / 100), (difference % 100));

        //=================================================================

        // int newEuros = this.euros;
        // int newCents = this.cents;
        

        // if (newEuros < decreaser.euros) {
        //     newEuros = 0;
        //     newCents = 0;
        // } else {
        //     newEuros = newEuros - decreaser.euros;
        // }



        // if (newCents < decreaser.cents) {
        //     newCents = ((newCents + 100) - decreaser.cents);

        //     if (newEuros > 0) {
        //         newEuros = newEuros - 1;
        //     } else if (newEuros <= 0) {
        //         newEuros = 0;
        //         newCents = 0;
        //     }
        // } else {
        //     newCents = newCents - decreaser.cents;
        // }

        // // newEuros = newEuros - decreaser.euros;
        // // newCents = newCents - decreaser.cents;



        // return new Money(newEuros, newCents);

    }

}
