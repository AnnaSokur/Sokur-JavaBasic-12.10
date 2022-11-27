public enum DrinksMachine {
    COFFEE,
    TEA,
    LEMONADE,
    MOJITO,
    MINERAL_WATER,
    COCA_COLA;

    private final int price;

    private void Drinks(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
