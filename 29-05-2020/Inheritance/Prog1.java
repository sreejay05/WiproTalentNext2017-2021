class Animal{
    public void eat(){
        System.out.println("Animal eats");
    }
    public void sleep(){
        System.out.println("Animal sleeps");
    }
}
class Bird extends Animal{
    public void eat(){
        System.out.println("Bird eats");
    }
    public void sleep(){
        System.out.println("Bird sleeps");
    }
    public void fly(){
        System.out.println("Bird flies");
    }
}
public class Prog1{
    public static void main(String[]args){
        Animal a= new Animal();
        a.eat();
        a.sleep();
        Bird b = new Bird();
        b.eat();
        b.sleep();
        b.fly();
    }
}
