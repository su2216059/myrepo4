package 单例模式.静态内部类实现;

public class MySingle {
    public MySingle(){}
    public static class InnerSingle{
        public final static MySingle INSTANCE=new MySingle();
    }
    public static MySingle getInstance(){
       return InnerSingle.INSTANCE;
    }
}
