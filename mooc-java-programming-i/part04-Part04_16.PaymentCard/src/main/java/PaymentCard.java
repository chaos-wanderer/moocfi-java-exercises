public class PaymentCard {

    private double balance;

    public PaymentCard(double openingBalance) {
        this.balance = openingBalance;
    }

    @Override
    public String toString() {
        return ("The card has a balance of " + balance + " euros");
    }

    public void eatAffordably() {
    // write code here

        if (this.balance >= 2.60) {
            this.balance = this.balance - 2.60;
        }
    }

    public void eatHeartily() {
        // write code here

        if (this.balance >= 4.60) {
            this.balance = this.balance - 4.60;
        }
    }

    public void addMoney(double amount) {
    // write code here
        if (amount < 0) {
            return;
        }

        if (this.balance + amount > 150) {
            this.balance = 150;
            return;
        }

        this.balance += amount;

    }
    


}
