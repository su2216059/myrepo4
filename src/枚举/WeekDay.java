package 枚举;

public enum  WeekDay {
    //定义枚举变量
    SUN(0),MON(1),TUE(2),WED(3),THU(4),FRI(5),SAT(6);
    private int value;
    //私有构造方法
    private WeekDay(int value){
        this.value=value;
    }
    //获取周几的下一天
    public static WeekDay getNextWeekDay(WeekDay weekDay){
        int nexWeekDay=weekDay.value;
        if(++nexWeekDay==7){
            nexWeekDay=0;
        }
        return getWeekDayByvalue(nexWeekDay);
    }
    //通过value获取周几
    public static WeekDay getWeekDayByvalue(int value){
        for (WeekDay weekDay : WeekDay.values()) {
            if(weekDay.value==value){
                return weekDay;
            }
        }
        return null;
    }
}
