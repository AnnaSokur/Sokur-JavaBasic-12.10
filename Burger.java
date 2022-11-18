package Burgers;

public class Burger {
    private String bun;
    private String meat;
    private String doubleMeat;
    private String cheese;
    private String greens;
    private boolean mayonnaise;


    public Burger(String bun, String meat, String cheese, String greens, boolean mayonnaise) {
        this(bun, meat, cheese, greens, true);
        System.out.println("classicBurger" + bun + meat + cheese + greens + mayonnaise);
    }

    public Burger(String bun, String meat, String cheese, String greens) {
        this(bun, meat, cheese, greens);
        System.out.println("healthyBurger" + bun + meat + cheese + greens);
    }

    public Burger(String bun, String doubleMeat, String cheese, String greens, boolean mayonnaise) {
        this.bun = bun;
        this.doubleMeat = doubleMeat;
        this.cheese = cheese;
        this.greens = greens;
        this.mayonnaise = true;
        System.out.println("doubleBurger" + bun + doubleMeat + cheese + greens + mayonnaise);
    }
}
