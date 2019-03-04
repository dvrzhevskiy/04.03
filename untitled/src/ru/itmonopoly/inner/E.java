package ru.itmonopoly.inner;

public class E {
    int x=1;
    static int pp=21;
    public void myFunction(){
        System.out.println("this = " + this);
        D d = new D();
        d.print();
    }
    public class D{
        int y=2;
        int x=111;
        void print(){
            System.out.println("y = " + y);
            System.out.println("x = " + x);
            System.out.println("pp = " + pp);
            System.out.println("E.x = " + E.this.x);
        }

    }
}
