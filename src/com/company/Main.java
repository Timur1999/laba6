package com.company;

public class Main {
   protected  int fildN=100;
   private int fild2=44;
    public static void main(String[] args) {
        fclass3 f3=new fclass3();
        double nn=200.2;
        f3.setFildN((int)nn);
            }
    public int getFild2(){
        return this.fild2;
    }
}
class fclass2 extends fclass3{

}
class fclass3 extends Main{

    public  int getFildN(){
        return this.fildN;

    }

    public void setFildN(int newN){
        this.fildN=newN;
    }

}
