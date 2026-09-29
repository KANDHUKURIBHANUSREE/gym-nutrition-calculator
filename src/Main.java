import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("===== GYM NUTRITION & CALORIE CALCULATOR =====");

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter your gender (male/female): ");
        String gender = scanner.next();

        System.out.print("Enter your weight (kg): ");
        double weight = scanner.nextDouble();

        System.out.print("Enter your height (cm): ");
        double height = scanner.nextDouble();

        System.out.println("\nSelect Activity Level:");
        System.out.println("1. Sedentary");
        System.out.println("2. Light");
        System.out.println("3. Moderate");
        System.out.println("4. Active");

        System.out.print("Enter your choice: ");
        int activityChoice = scanner.nextInt();

        String activityLevel;

        switch (activityChoice) {
            case 1:
                activityLevel = "sedentary";
                break;
            case 2:
                activityLevel = "light";
                break;
            case 3:
                activityLevel = "moderate";
                break;
            case 4:
                activityLevel = "active";
                break;
            default:
                activityLevel = "sedentary";
                System.out.println("Invalid choice. Sedentary selected.");
        }

        System.out.println("\nSelect Fitness Goal:");
        System.out.println("1. Weight Loss");
        System.out.println("2. Maintenance");
        System.out.println("3. Muscle Gain");

        System.out.print("Enter your choice: ");
        int goalChoice = scanner.nextInt();

        String goal;

        switch (goalChoice) {
            case 1:
                goal = "weight loss";
                break;
            case 2:
                goal = "maintenance";
                break;
            case 3:
                goal = "muscle gain";
                break;
            default:
                goal = "maintenance";
                System.out.println("Invalid choice. Maintenance selected.");
        }

        User user = new User(
                name,
                age,
                gender,
                weight,
                height,
                activityLevel,
                goal
        );

        double bmr = NutritionCalculator.calculateBMR(user);
        double dailyCalories = NutritionCalculator.calculateDailyCalories(user);
        double goalCalories = NutritionCalculator.calculateGoalCalories(user);

        System.out.println("\n========== YOUR RESULTS ==========");
        System.out.println("Name: " + user.getName());
        System.out.printf("BMR: %.2f kcal%n", bmr);
        System.out.printf("Daily Calories: %.2f kcal%n", dailyCalories);
        System.out.printf("Goal Calories: %.2f kcal%n", goalCalories);
        System.out.println("Goal: " + user.getGoal());
        System.out.println("==================================");

        scanner.close();
    }
}
