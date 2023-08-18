package com.app.demo.static_vs_nonstatic;

public class StaticAndInstanceMethodDemo {
    private static Integer var1 = 1;
    private static Double var2 = 2.0;
    private static String var3 = "3";

    public StaticAndInstanceMethodDemo(String message) {
        System.out.println(message);
    }
    public static void setVar1(int value) {
        var1 = value;
    }
    public static int valueOfVar1() {
        return var1;
    }
    public static double valueOfVar2(){
      return var2;
    }

    public String valueOfVar3() {
        return var3;
    }

    public static void main(String[] args) {
        int valueOfVar1 = StaticAndInstanceMethodDemo.valueOfVar1();
        double valueOfVar2 = StaticAndInstanceMethodDemo.valueOfVar2();
        System.out.println("ValueOfVar1 :: " + valueOfVar1);
        System.out.println("ValueOfVar2 :: " + valueOfVar2);

        StaticAndInstanceMethodDemo obj1 = new StaticAndInstanceMethodDemo("Obj1 created...");
        String valueOfVar3 = obj1.valueOfVar3();
        System.out.println("ValueOfVar1 :: " + obj1.valueOfVar1());
        System.out.println("ValueOfVar2 :: " + obj1.valueOfVar2());
        System.out.println("ValueOfVar3 :: " + valueOfVar3);

        StaticAndInstanceMethodDemo.setVar1(10);

        StaticAndInstanceMethodDemo obj2 = new StaticAndInstanceMethodDemo("Obj2 created...");
        valueOfVar3 = obj2.valueOfVar3();
        System.out.println("ValueOfVar1 :: " + obj2.valueOfVar1());
        System.out.println("ValueOfVar2 :: " + obj2.valueOfVar2());
        System.out.println("ValueOfVar3 :: " + valueOfVar3);
    }
}
