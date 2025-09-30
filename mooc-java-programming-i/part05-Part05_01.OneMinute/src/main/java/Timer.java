public class Timer {

    private ClockHand hundredthSec;
    private ClockHand seconds;

    public Timer() {
        this.hundredthSec = new ClockHand(100);
        this.seconds = new ClockHand(60);
    }

    public void advance() {
        this.hundredthSec.advance();

        if (this.hundredthSec.value() == 0) {
            this.seconds.advance();
        }
    }

    @Override
    public String toString() {
        return seconds + ":" + hundredthSec;
    }
    
}
