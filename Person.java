

package com.mycompany.person;


public class Person {

    private  String name;
    private  int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void printPerson() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        Person person1 = new Person("HARLIN", 25);
        Person person2 = new Person("MATTY", 30);

        person1.printPerson();
        person2.printPerson(); 
    }
}
