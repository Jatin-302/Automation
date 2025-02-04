package org.dec_29_24;

class Parent {          //create singleton class
    public int a=10;        //just for our understanding, to check same memory or not
    private Parent() { }     //constructor
    private static Parent obj;
    public static Parent getParentInstance() {        //using encapsulation concept
        if(obj == null) {
            obj = new Parent();
        }
        return obj;
    }
}
public class SingletonEx1 {
    public static void main(String[] args) {
        System.out.println("** Program Starts **");
        //Parent obj1 = new Parent();                     //new
        Parent obj1 = Parent.getParentInstance();        //new
        System.out.println("obj1.a = " + obj1.a);       //10
        obj1.a = 50;
        System.out.println("obj1.a = " + obj1.a);       //50
        System.out.println("********************");

        //Parent obj2 = new Parent();                     //new
        Parent obj2 = Parent.getParentInstance();       //obj1
        System.out.println("obj2.a = " + obj2.a);       //50
        obj2.a = 60;
        System.out.println("obj2.a = " + obj2.a);       //60
        System.out.println("********************");

        //Parent obj3 = new Parent();                     //new
        Parent obj3 = Parent.getParentInstance();       //obj1
        System.out.println("obj3.a = " + obj3.a);       //60
        obj3.a = 70;
        System.out.println("obj3.a = " + obj3.a);       //70
        System.out.println("********************");

        System.out.println("** Program Ends **");
    }
}
