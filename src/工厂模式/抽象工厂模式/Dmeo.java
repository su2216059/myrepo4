package 工厂模式.抽象工厂模式;

public class Dmeo {
    public static void main(String[] args) {
        Priovider send=new SendMailFactory();
        send.produce();
    }
}
