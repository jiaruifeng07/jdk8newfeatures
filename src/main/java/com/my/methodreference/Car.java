package com.my.methodreference;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

/**
 * @author jiaruifeng
 * @create 2018-09-03 上午11:08
 * @desc
 **/

public class Car {
    private String name;

    //Supplier是jdk1.8的接口，这里和lamda一起使用了
    public static Car create(final Supplier<Car> supplier) {
        System.out.println(">>>调用构造方法");
        return supplier.get();
    }

    public static void collide(final Car car) {
        System.out.println(">>>调用静态方法");
        System.out.println("Collided " + car.toString());
    }

    public void follow(final Car another) {
        System.out.println(">>>调用有参数实例方法");
        System.out.println("Following the " + another.toString());
    }

    public void repair() {
        System.out.println(">>>调用有参数实例方法");
        System.out.println("Repaired " + this.toString());
    }

    public static void main(String[] args) {
        final Car car = Car.create( Car::new );
        final Car car1 = Car.create( Car::new );
        final List< Car > cars = Arrays.asList( car );
        final List< Car > cars1 = Arrays.asList( car );
        System.out.println(cars);
        cars.forEach(Car::collide);
        cars.forEach(car1::follow);
        cars1.forEach(car::follow);
        cars.forEach(Car::repair);
    }
}
