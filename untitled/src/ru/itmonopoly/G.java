package ru.itmonopoly;

public class G {//inner
    F external;
    int y=30;
    public G(F f){
        external=f;
    }
    public void myFunc(){
       this.y=40;
       external.x=60;
    }
}
