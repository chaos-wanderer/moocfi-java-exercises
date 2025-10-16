

public class Checker {
    
    public boolean isDayOfWeek(String string) {
        return (string.matches(("(mon|tue|wed|thu|fri|sat|sun)")));
    }

    public boolean allVowels(String string) {
        return string.matches(("(a|e|i|o|u)+"));
    }

    public boolean timeOfDay(String string) {
        return string.matches("(0\\d|1\\d|2[0-3]):[0-5]\\d:[0-5]\\d");
    }

}


