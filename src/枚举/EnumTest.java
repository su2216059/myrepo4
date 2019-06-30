package 枚举;

public  enum EnumTest{

    /*SUN{
        @Override
        public String sout(){
           return "星期天";
        }
    },
    MON{
       @Override
        public String sout(){
            return "星期一";
        }
    };*/
    MON(1),TUE(2);
    private int value;
    /*public abstract String sout();*/
    private EnumTest(int value){
        this.value=value;
    }

    public int getValue() {
        return value;
    }
}
