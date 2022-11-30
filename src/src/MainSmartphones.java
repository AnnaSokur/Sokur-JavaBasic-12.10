public class MainSmartphones{
    public static void main(String[] args) {
        Androids androids = new Androids();
        androids.call();
        androids.sms();
        androids.internet();
        androids.listen();
        System.out.println("-------");


        Iphones iphones = new Iphones();
        iphones.call();
        iphones.sms();
        iphones.internet();
        iphones.personalize();
        System.out.println("-------");

    }



}
