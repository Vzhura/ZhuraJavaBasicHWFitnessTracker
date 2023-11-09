import java.time.LocalDate;

class User {
    private final String name;
    private String surname;
    private final LocalDate birthdate;
    private final String email;
    private final String phone;
    private double weight;
    private String bloodPressure;
    private int stepsPerDay;
    private int age;

    public User(String name, int birthYear, int birthMonth, int birthDay, String email, String phone) {
        this.name = name;
        this.birthdate = LocalDate.of(birthYear, birthMonth, birthDay);
        this.email = email;
        this.phone = phone;
        this.surname = "";
        this.weight = 0;
        this.bloodPressure = "";
        this.stepsPerDay = 0;
        this.calculateAge();
    }

    private void calculateAge() {
        int currentYear = LocalDate.now().getYear();
        this.age = currentYear - birthdate.getYear();
    }

    public void printAccountInfo() {
        System.out.println("User Information:");
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Age: " + age);
        System.out.println("Birthdate: " + birthdate);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Blood Pressure: " + bloodPressure);
        System.out.println("Steps per Day: " + stepsPerDay);
        System.out.println();
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(String bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public int getStepsPerDay() {
        return stepsPerDay;
    }

    public void setStepsPerDay(int stepsPerDay) {
        this.stepsPerDay = stepsPerDay;
    }
}
