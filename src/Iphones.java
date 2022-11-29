public class Iphones implements Smartphones, IOS {
    public Iphones(String operatingSystem, String functions) {
        this.operatingSystem = operatingSystem;
        this.functions = functions;
    }

    @Override
    public void internet() {
        System.out.println("------");
    }

    @Override
    public void sms() {
        System.out.println("------");
    }

    @Override
    public void call() {
        System.out.println("------");
    }

    String functions;
    String operatingSystem;
}










