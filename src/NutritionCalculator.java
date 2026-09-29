public class NutritionCalculator {

    public static double calculateBMR(User user) {

        if (user.getGender().equalsIgnoreCase("male")) {

            return (10 * user.getWeight())
                    + (6.25 * user.getHeight())
                    - (5 * user.getAge())
                    + 5;

        } else {

            return (10 * user.getWeight())
                    + (6.25 * user.getHeight())
                    - (5 * user.getAge())
                    - 161;
        }
    }

    public static double calculateDailyCalories(User user) {

        double bmr = calculateBMR(user);
        double activityFactor;

        switch (user.getActivityLevel().toLowerCase()) {

            case "sedentary":
                activityFactor = 1.2;
                break;

            case "light":
                activityFactor = 1.375;
                break;

            case "moderate":
                activityFactor = 1.55;
                break;

            case "active":
                activityFactor = 1.725;
                break;

            default:
                activityFactor = 1.2;
        }

        return bmr * activityFactor;
    }

    public static double calculateGoalCalories(User user) {

        double calories = calculateDailyCalories(user);

        switch (user.getGoal().toLowerCase()) {

            case "weight loss":
                return calories - 500;

            case "muscle gain":
                return calories + 300;

            case "maintenance":
                return calories;

            default:
                return calories;
        }
    }

    // Protein = 30% of total calories
    public static double calculateProtein(double calories) {

        return (calories * 0.30) / 4;
    }

    // Carbohydrates = 40% of total calories
    public static double calculateCarbohydrates(double calories) {

        return (calories * 0.40) / 4;
    }

    // Fats = 30% of total calories
    public static double calculateFats(double calories) {

        return (calories * 0.30) / 9;
    }
}
