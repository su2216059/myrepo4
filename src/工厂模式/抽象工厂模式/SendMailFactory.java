package 工厂模式.抽象工厂模式;

import 工厂模式.普通工厂模式.MailSend;
import 工厂模式.普通工厂模式.Sender;

public class SendMailFactory implements Priovider {

    @Override
    public Sender produce() {
        return new MailSend();
    }
}
