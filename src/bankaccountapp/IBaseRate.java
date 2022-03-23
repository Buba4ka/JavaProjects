package bankaccountapp;

public interface IBaseRate {

    //write method that return the base rate
    default double getBaseRate() {
        return 2.5;
    }


}
