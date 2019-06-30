package 工厂模式.普通工厂模式;

public class FacctoryDemo {
    //工厂模式
    public Sender produce(String style){
        if("mail".equals(style)){
            return new MailSend();
        }else if("sms".equals(style)){
            return new SmsSend();
        }else{
            return null;
        }
    }
}
