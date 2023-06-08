//package com.oops;
// abstract -> only the declaration of method in a class but not implementation.
abstract class Employee
{// when we dont want certain method's implementations to been seen publically
// tv remote -> 101 -> channel 101 -> watch the channel
abstract public void addEmploye();
public void addEmpAge()
{
System.out.println("Adding the age to the age collum!");
}
// methods declared in interface can not be implemented there itself
// till java 7 its not allowed for interface to write the body of method in it.

}
interface A
{
public void displayDate();
public void displaySalary();
}
public class AbstractionEx extends Employee implements A{

@Override
public void addEmploye() {
System.out.println("Adding Employee...");

}
public void displayDate() {System.out.println("dates");}
public static void main(String[] args) {
AbstractionEx obj1 = new AbstractionEx();
obj1.addEmpAge();
obj1.addEmploye();
obj1.displayDate();
}
@Override
public void displaySalary() {
System.out.println("salary..");

}

}