class Dog{
    String name;
    int age;
    String breed;
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setBreed(String breed){
        this.breed = breed;
    }
    public void printDogDetail(){
        System.out.printf("Name:%s--Breed:%s--Age:%d\n", this.name, this.breed,this.age);
    }
}
public class OOP001{
    public static void main(String[] args){
        Dog dog1 = new Dog();
        dog1.setName("Micky");
        dog1.setAge(12);
        dog1.setBreed("Husky");
        dog1.printDogDetail();
    }
} 
 