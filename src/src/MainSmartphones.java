public class MainSmartphones{
    public static void main(String[] args) {
        Androids androids = new Androids();
        androids.call();
        androids.sms();
        androids.internet();
        System.out.println("-------");


        Iphones iphones = new Iphones();
        iphones.call();
        iphones.sms();
        iphones.internet();
        System.out.println("-------");

    }



}
