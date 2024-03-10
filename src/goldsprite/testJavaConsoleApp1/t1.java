package goldsprite.testJavaConsoleApp1;

import java.util.HashMap;

//测试logLevel通过&筛选
public class t1 {
//    public HashMap<Integer, Boolean> logLevels = new HashMap<>();
    public int logLevels = 1&2&3;
    public t1(){
        System.out.println(isShow(1));
        System.out.println(isShow(1));
        System.out.println(isShow(2));
        System.out.println(isShow(3));
        System.out.println(isShow(4));
        System.out.println(isShow(10));
    }

    private boolean isShow(int level) {
        return (level|logLevels) != 0;
    }
}
