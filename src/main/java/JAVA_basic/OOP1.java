package JAVA_basic;

public class OOP1{
    public static void main(String[] args){
        int num = 10;
        System.out.println(num);
        changeVariable(num);
        System.out.println(num);
        num = changeVariable(num);
        System.out.println(num);
        //04:03:05 בשיעור האחרון, עד כאן סוכם הכל
    }

    public static int changeVariable(int num){
        num *= 2;
        return num;
    }
}