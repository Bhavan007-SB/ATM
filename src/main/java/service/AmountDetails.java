package service;

public class AmountDetails implements InterfaceClass {

    public double withdrawAmount(double amt,double bal){
        return bal-amt;
    }
    public double depositAmount(double amt,double bal){
        return bal+amt;
    }
    public double accountBalance(double amt){
        return amt;
   
     }

}
