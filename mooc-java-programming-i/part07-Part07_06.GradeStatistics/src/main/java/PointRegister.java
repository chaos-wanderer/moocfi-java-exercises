import java.util.ArrayList;

public class PointRegister {
    private ArrayList<Integer> points;
    private ArrayList<Integer> passingPoints;
    
    public ArrayList<Integer> getPoints() {
        return points;
    }

    public PointRegister() {
        this.points = new ArrayList<>();
        this.passingPoints = new ArrayList<>();
    }

    public void addPoint(int point) {
        this.points.add(point);

        if (point >= 50) {
            this.passingPoints.add(point);
        }
    }

    public int sumOfPoints() {
        int sumOfPoints = 0;
        for (int p : this.points) {
            sumOfPoints += p;
        }

        return sumOfPoints;
    }

    public int sumOfPassingPoints() {
        int sumOfPassingPoints = 0;
        for (int pp : this.passingPoints) {
            sumOfPassingPoints += pp;
        }

        return sumOfPassingPoints;
    }

    public double averageOfPoints() {
        if (this.points.isEmpty()) {
            return -1;
        }

        return (1.0 * sumOfPoints() / this.points.size());

    }   

    public double averageOfPassingPoints() {
        if (this.points.isEmpty()) {
            return -1;
        }

        return (1.0 * sumOfPassingPoints() / this.passingPoints.size());

    }

    public double passPercentage() {
        return (100.0 * passingPoints.size() / points.size());
    }

    public int numberOfGrades(int grade) {
        int match = 0;

        for (int p : points) {
            int g = pointsToGrade(p);
            if (g == grade) {
                match++;
            }
        }
        return match;

    }

    private int pointsToGrade(int points) {
        if (points < 50) {
            return 0;
        } else if (points < 60) {
            return 1;
        } else if (points < 70) {
            return 2;
        } else if (points < 80) {
            return 3;
        } else if (points < 90) {
            return 4;
        } else {
            return 5;
        }
}


    
}
