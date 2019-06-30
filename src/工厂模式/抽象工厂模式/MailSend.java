package 工厂模式.抽象工厂模式;

public class MailSend implements Sender {
    @Override
    public void send() {
        System.out.println("main.send...");
    }
}
