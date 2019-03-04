package ru.itmonopoly.inner;

import ru.itmonopoly.F;
import ru.itmonopoly.G;

public class Mian {
    public static void main(String[] args) {
        A a = new A();
        a.x=11;

        a = new A();
        a.x=31;

        A.B b = new A.B();
        b.y=20;


        C c = new C();

        E e = new E();
        e.myFunction();

        F f = new F();

        G g = new G(f);
        g.myFunc();
    }
}
