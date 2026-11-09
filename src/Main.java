public class Main {
    // 2. Function to calculate the mean (average)
    public static double average(double[] scores) {
        double sum = 0;
        for (double score : scores) {
            sum += score;
        }
        return sum / scores.length;
    }

    // 3. Function to determine the letter grade
    public static char letter(double avg) {
        if (avg >= 80) return 'A';
        else if (avg >= 70) return 'B';
        else if (avg >= 60) return 'C';
        else if (avg >= 50) return 'D';
        else return 'F';
    }

    public static void main(String[] args) {
        // 1. Store five exam scores in an array
        double[] scores = {85.0, 72.5, 90.0, 65.0, 78.0};

        // 4. Loop over scores and print each with its position
        System.out.println("Exam Scores:");
        for (int i = 0; i < scores.length; i++) {
            System.out.println("Score " + (i + 1) + ": " + scores[i]);
        }

        // 5. Print a summary line with string interpolation/formatting
        double avg = average(scores);
        char grade = letter(avg);
        System.out.printf("Average: %.2f (%c)\n", avg, grade);
    }
}