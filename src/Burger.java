package Burgers;

public class Burger {
    private String bun;
    private String meat;
    private String doubleMeat;
    private String cheese;
    private String greens;
    private String mayonnaise;


    public Burger(String bun, String meat, String cheese, String greens, String mayonnaise) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        this.mayonnaise = mayonnaise;

        System.out.println("classicBurger" + bun + meat + cheese + greens + mayonnaise);
    }

    public Burger(String bun, String meat, String cheese, String greens) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        System.out.println("healthyBurger" + bun + meat + cheese + greens);
    }

    public Burger(String bun, String meat, String doubleMeat, String cheese, String greens, String mayonnaise) {
        this.bun = bun;
        this.meat = meat;
        this.doubleMeat = doubleMeat;
        this.cheese = cheese;
        this.greens = greens;
        this.mayonnaise = mayonnaise;
        System.out.println("doubleBurger" + bun + doubleMeat + cheese + greens + mayonnaise);
    }
}
