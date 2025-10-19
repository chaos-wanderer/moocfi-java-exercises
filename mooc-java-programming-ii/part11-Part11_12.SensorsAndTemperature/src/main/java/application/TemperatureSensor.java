package application;

import java.util.Random;

public class TemperatureSensor implements Sensor {
    private String status;

    public TemperatureSensor() {
        this.status = "off";
    }

    public boolean isOn() {
        if (status.equalsIgnoreCase("on")) {
            return true;
        } else {
            return false;
        }
    }

    public void setOn() {
        status = "on";
    }

    public void setOff() {
        status = "off";
    }

    public int read() {
        Random random = new Random();
        int num = random.nextInt(61) - 30;

        if (status.equalsIgnoreCase("off")) {
            throw new IllegalStateException("Status off");
        }

        return num;
        
    }


}
