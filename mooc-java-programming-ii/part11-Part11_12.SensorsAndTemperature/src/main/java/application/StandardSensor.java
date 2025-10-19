package application;

public class StandardSensor implements Sensor {
    private int value;

    public StandardSensor(int num) {
        this.value = num;
    }

    public boolean isOn() {
        return true;
    }

    public void setOn() {
    }

    public void setOff() {
    }

    public int read() {
        return value;
    }
}
