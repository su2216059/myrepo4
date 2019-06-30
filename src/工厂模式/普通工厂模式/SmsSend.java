package 工厂模式.普通工厂模式;

public class SmsSend implements Sender {
    @Override
    public void send() {
        System.out.println("sms send....");
    }
}
