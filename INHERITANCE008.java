class Person{
    private String name;
    private String address;
    public Person(String name, String address){
        this.name = name;
        this.address = address;
    }
    public String toString(){
        return this.name +" - "+ this.address;
    }
    
}
class Student extends Person{
    private int credits;
    public Student(String name, String address){
        super(name, address);
        this.credits = 0;
    }
    public void study(){
        this.credits++;
    }
    public int credits(){
        return this.credits;
    }
}
public class INHERITANCE008 {
    public static void main(String[] args){
        Student s1= new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
        System.out.println(s1.toString());
        System.out.println("Study credits " +s1.credits());
        s1.study();
        System.out.println("Study credits " +s1.credits());
    }

}
