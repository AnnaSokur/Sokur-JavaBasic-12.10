public class BurgerMain {
    public static void main(String[] args) {


        Burger classicBurger = new Burger("", "" ,"", "" , "", "");
        classicBurger.add(true, true, false, true, true, true);
        System.out.println();


        Burger  healthyBurger = new Burger();
        healthyBurger.add(true, true, false, true, true, false);
        System.out.println();


        Burger doubleBurger = new Burger();
        doubleBurger.add(true, false, true, true, true, true);
        System.out.println();


    }
}
