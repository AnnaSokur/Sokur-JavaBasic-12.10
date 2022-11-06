public class Person {
    private String nameSurname;
    private String city;
    private String phoneNumber;

    private String format;
    private String info;
    public void personInfo() {
        System.out.println(info);
    }
    public Person(String nameSurname, String city, String phoneNumber) {
        this.format = ("Позвонить гражданину %s из города %s можно по номеру телефона %s");
        this.info = String.format(format, nameSurname, city,phoneNumber);
        this.nameSurname = nameSurname;
        this.city = city;
        this.phoneNumber = phoneNumber;
    }
}
