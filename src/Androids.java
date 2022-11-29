public class Androids implements Smartphones, LinuxOS {
    String operatingSystem;
    String functions;

    public Androids(String operatingSystem, String functions) {
        this.operatingSystem = operatingSystem;
        this.functions = functions;
    }

    @Override
    public void call() {
        System.out.println("------");
    }

    @Override
    public void sms() {
        System.out.println("------");
    }

    @Override
    public void internet() {
        System.out.println("------");
    }


}
