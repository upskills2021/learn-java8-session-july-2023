package com.app.demo.static_vs_nonstatic;

public class StaticVariableDemo {
    private static String STATIC_VAR = "static_variable";
    private int i;
    public StaticVariableDemo(String message, int i) {
        System.out.println(message);
        this.i = i;
    }
    public int getI() {
        return this.i;
    }
    public void setI(int i) {
        this.i = i;
    }
    public static void main(String[] args) {
        StaticVariableDemo obj1 = new StaticVariableDemo("Obj1 is created...", 1);
        StaticVariableDemo obj2 = new StaticVariableDemo("Obj2 is created...", 2);
        StaticVariableDemo obj3 = new StaticVariableDemo("Obj3 is created...", 3);
        System.out.println("Value of i in Obj1 " + obj1.getI());
        System.out.println("Value of i in Obj2 " + obj2.getI());
        System.out.println("Value of i in Obj3 " + obj3.getI());
        System.out.println("Value of STATIC_VAR :: " + StaticVariableDemo.STATIC_VAR);
        obj1.setI(10);
        System.out.println("Changing value of i in Obj1");
        System.out.println("Value of i in Obj1 " + obj1.getI());
        System.out.println("Value of i in Obj2 " + obj2.getI());
        System.out.println("Value of i in Obj3 " + obj3.getI());

    }
}
