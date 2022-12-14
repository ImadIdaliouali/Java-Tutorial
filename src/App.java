import Car.*;

public class App {
    public static void main(String[] args) {
        Car myCar = new Car();
        Car otherCar = new Car();
        myCar.year = 2022;
        otherCar = myCar;
        otherCar.year = 2010;
        myCar.test(otherCar);
        System.out.println(myCar.year);
        System.out.println(otherCar.year);
    }
}
