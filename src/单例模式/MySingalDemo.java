package 单例模式;

public class MySingalDemo {
    private static volatile MySingalDemo mySingalDemo=null;
    //懒汉式
    private MySingalDemo(){}
    public MySingalDemo getInstance(){
        //DCL机制
        if(mySingalDemo==null){
            synchronized (MySingalDemo.class){
                if(mySingalDemo==null) {
                    mySingalDemo = new MySingalDemo();
                }
            }
        }
        return mySingalDemo;
    }

}
