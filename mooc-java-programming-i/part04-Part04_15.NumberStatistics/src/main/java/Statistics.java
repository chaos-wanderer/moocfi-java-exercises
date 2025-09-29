
public class Statistics {

    private int count;
    private int sum;

    public Statistics() {
        this.count = 0;
        this.sum = 0;
    }

    // public void start(Scanner scanner) {
    //     System.out.println("Enter numbers:");

    //     while (true) {
    //         int num = Integer.valueOf(scanner.nextLine());
    //         if (num == -1) {
    //             break;
    //         }

    //         addNumber(num);
    //     }

    //     System.out.println("Sum: " + sum());
    // }

    public void addNumber(int number) {
        this.count++;
        this.sum += number;

    }

    public int getCount() {
        return count;
    }

     public int sum() {
        // write code here
        return sum;


    }

    public double average() {
        // write code here

        if (count > 0) {
            return ((double) sum / count);
        }

        return 0;

    }
}
