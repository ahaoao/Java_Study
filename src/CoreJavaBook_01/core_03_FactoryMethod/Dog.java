package CoreJavaBook_01.core_03_FactoryMethod;
/**
 * This problem explain factory method
 * @version 2019-11-07
 * @author ahao
 * */

public class Dog {
    private String name;

    private String color;

    private int age;

    private Dog() {
    }

    public static Dog newDogWithAllParam(String name, String color, int age) {
        Dog dog = new Dog();
        dog.name = name;
        dog.age = age;
        dog.color = color;
        return dog;
    }

    public static Dog newDogWithName(String name) {
        Dog dog = new Dog();
        dog.name = name;
        return dog;
    }

    public static Dog newDogWithColor(String color) {
        Dog dog = new Dog();
        dog.color = color;
        return dog;
    }

}