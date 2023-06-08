//This filr will be having code for inhertance::
//

class GrandParent{
    public void method1(){
        System.out.println("Grand Parent method 1");
    }
}
class Parent extends GrandParent{
    public void method2(){
        System.out.println("Parent method 2");
    }
}    
class Child extends Parent {
    public void method3(){
        System.out.println("Child method 3");
  }
 }
public class Inherit{
    public static void main(String[] args) {
        Child obj1 = new Child();
        obj1.method3();
        obj1.method2();
        obj1.method1();
    }
  }




