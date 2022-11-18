import java.util.ArrayList;
import java.util.List;


public class Burger {

    private boolean bun;
    private boolean meat;
    private boolean doubleMeat;
    private boolean cheese;
    private boolean greens;
    private boolean mayonnaise;


    public Burger(boolean bun, boolean meat, boolean doubleMeat, boolean cheese, boolean greens, boolean mayonnaise) {

        this.bun = true;
        this.meat = true;
        this.doubleMeat = true;
        this.cheese = true;
        this.greens = true;
        this.mayonnaise = true;

        private List<Boolean> additions = new ArrayList<Boolean>();


        public void addAdditions (boolean bun, boolean meat, boolean doubleMeat, boolean cheese, boolean greens,
        boolean mayonnaise) {
            System.out.println("Ингридиенты: ");
            if (bun == true) {
                additions.add(bun);
                System.out.println("Булочка");
            }
            if (meat == true) {
                additions.add(meat);
                System.out.println("Мясо");
            }
            if (doubleMeat == true) {
                additions.add(doubleMeat);
                System.out.println("Двойное мясо");
            }
            if (cheese == true) {
                additions.add(cheese);
                System.out.println("Сыр");
            }
            if (greens == true) {
                additions.add(greens);
                System.out.println("Зелень");
            }
            if (mayonnaise == true) {
                additions.add(mayonnaise);
                System.out.println("Майонез");


            }
        }
    }
}
