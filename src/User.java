public class User {

    private String name;
    private int age;
    private String gender;
    private double weight;
    private double height;
    private String activityLevel;
    private String goal;

    public User(String name, int age, String gender, double weight,
                double height, String activityLevel, String goal) {

        this.name = name;
        this.age = age;
        this.gender = gender;
        this.weight = weight;
        this.height = height;
        this.activityLevel = activityLevel;
        this.goal = goal;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public String getActivityLevel() {
        return activityLevel;
    }

    public String getGoal() {
        return goal;
    }
}
