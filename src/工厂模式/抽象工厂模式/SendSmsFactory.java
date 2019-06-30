package 工厂模式.抽象工厂模式;

import 工厂模式.普通工厂模式.Sender;
import 工厂模式.普通工厂模式.SmsSend;

public class SendSmsFactory implements Priovider {
    @Override
    public Sender produce() {
        return new SmsSend();
    }
}
