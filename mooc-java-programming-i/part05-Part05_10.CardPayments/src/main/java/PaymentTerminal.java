
public class PaymentTerminal {


    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals

    private static final double AFFORDABLE_MEAL_PRICE = 2.50;
    private static final double HEARTY_MEAL_PRICE = 4.30;


    public PaymentTerminal() {
        // register initially has 1000 euros of money
        this.money = 1000;
        this.affordableMeals = 0;
        this.heartyMeals = 0;
    }

    public double eatAffordably(double payment) {
        // an affordable meal costs 2.50 euros
        double AFFORDABLE_MEAL_PRICE = 2.50;

        if (payment < AFFORDABLE_MEAL_PRICE) {
            return payment;
        }
        // increase the amount of cash by the price of an affordable mean and return the change
        this.money += AFFORDABLE_MEAL_PRICE;
        affordableMeals++;

        return (payment - AFFORDABLE_MEAL_PRICE);

        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment

    }

    public boolean eatAffordably(PaymentCard card) {
        // an affordable meal costs 2.50 euros

        if (card.balance() < AFFORDABLE_MEAL_PRICE) {
            return false;
        }
        // increase the amount of cash by the price of an affordable mean and return the change
        // this.money += AFFORDABLE_MEAL_PRICE;
        card.takeMoney(AFFORDABLE_MEAL_PRICE);
        affordableMeals++;

        return true;

        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment

    }


    public double eatHeartily(double payment) {
        // a hearty meal costs 4.30 euros

        if (payment < HEARTY_MEAL_PRICE) {
            return payment;
        }

        this.money += HEARTY_MEAL_PRICE;
        heartyMeals++;
        // increase the amount of cash by the price of a hearty mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        return (payment - HEARTY_MEAL_PRICE);
    }

    public boolean eatHeartily(PaymentCard card) {
        // a hearty meal costs 4.30 euros

        double HEARTY_MEAL_PRICE = 4.30;

        if (card.balance() < HEARTY_MEAL_PRICE) {
            return false;
        }

        // this.money += HEARTY_MEAL_PRICE;
        card.takeMoney(HEARTY_MEAL_PRICE);
        heartyMeals++;
        
        // increase the amount of cash by the price of a hearty mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        return true;
    }

    public void addMoneyToCard(PaymentCard card, double sum) {
        if (sum < 0) {
            return;
        }

        card.addMoney(sum);
        this.money += sum;
    }





    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
