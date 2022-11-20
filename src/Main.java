public class Main {
    public static void main(String args[]) {

        System.out.println("ACCOUNT 1");
        new Account("Anna", 26, 5, 1999, "annasokur2605@gmail.com", "0964417289", "Sokur", 52, 90, 10000).printAccountInfo();

        System.out.println("ACCOUNT 2");
        new Account("Iryna", 12, 2, 1971, "irynasokur1202@gmail.com", "0672891133", "Sokur", 80, 120, 6000).printAccountInfo();

        System.out.println("ACCOUNT 3");
        new Account("Vitaliy", 22, 10, 1965, "vitaliysokur2210@gmail.com", "0980807215", "Sokur", 80, 130, 8000).printAccountInfo();


        System.out.println("ACCOUNT 1 NEW");
        Account anna = new Account("Anna", 26, 5, 1999, "annasokur2605@gmail.com", "0964417289", "Sokur", 53, 120, 14000);
        anna.setSurname("Sokur");
        anna.setWeight(53);
        anna.setPressure(120);
        anna.setStepsPerDay(14000);
        anna.printAccountInfo();

        System.out.println("ACCOUNT 2 NEW");
        Account iryna = new Account("Iryna", 12, 2, 1971, "irynasokur1202@gmail.com", "0672891133", "Sokur", 78, 120, 10000);
        iryna.setSurname("Sokur");
        iryna.setWeight(78);
        iryna.setPressure(120);
        iryna.setStepsPerDay(10000);
        iryna.printAccountInfo();
 }
}
