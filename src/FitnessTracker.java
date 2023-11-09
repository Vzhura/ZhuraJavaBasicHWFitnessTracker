public class FitnessTracker {

    public static void main(String[] args) {

        User user1 = new User("Ihor", 1990, 3, 15, "ihor@test.com", "123-456-7890");
        User user2 = new User("Anna", 1987, 7, 20, "anna@test.com", "987-654-3210");
        User user3 = new User("Victor", 2001, 1, 10, "victor@test.com", "777-555-1111");

        user1.printAccountInfo();
        user2.printAccountInfo();
        user3.printAccountInfo();

        user1.setSurname("Ivanov");
        user1.setWeight(83.5);
        user1.setBloodPressure("120/80");
        user1.setStepsPerDay(6000);

        user2.setSurname("Petrova");
        user2.setWeight(63.2);
        user2.setBloodPressure("130/90");
        user2.setStepsPerDay(10000);

        user1.printAccountInfo();
        user2.printAccountInfo();
    }
}
