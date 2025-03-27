
abstract class Product{
    String name;
    double price;
    int quantity;
    public Product(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    abstract double calculateCost(int quantity);
    void displayDetails(){
        System.out.println("Name: "+name);
        System.out.println("Price: "+price);
        System.out.println("Quantity: "+quantity);
    }
}
class Book extends Product{
    String author;
    public Book(String name, double price, int quantity, String author){
        super(name, price, quantity);
        this.author=author;
    }
    double calculateCost(int quantity){
        return this.price*quantity;
    }
    @Override
    void displayDetails(){
        super.displayDetails();
        System.out.println("Author: "+author);
    }
}
class Electronics extends Product{
    String brand;
    public Electronics (String name, double price, int quantity, String brand){
        super(name, price, quantity);
        this.brand=brand;
    }
    double calculateCost(int quantity){
        return price*quantity*1.1;
    }
    @Override
    void displayDetails(){
        super.displayDetails();
        System.out.println("Brand: "+brand);
    }
}
class User{
    String username;
    double totalSpent;
    public User(String username){
        this.username=username;
    }
    public void buyProduct(Product product, int quantity){
        if(product.quantity<quantity){
            System.out.println("Insufficient quantity of "+product.name+" available");
        }else{
            this.totalSpent+=product.calculateCost(quantity);
            product.quantity-=quantity;
            System.out.printf("User: %s bought %d %s for $ %f\n",
            this.username, quantity, product.name, product.calculateCost(quantity));
        }
    
    }
}
public class INTERFACE010 {
    public static void main(String[] args){
        Product lap = new Electronics("laptop",20 ,10,"Dell" );
        Product book = new Book("Harry potter",10.12,12,"camnh");
        User a =new User("Alice");
        User b=new User("Bob");
        User c= new User("Charlie");
        a.buyProduct(lap, 3);
        a.buyProduct(book, 10);
        b.buyProduct(lap, 1);
        c.buyProduct(book, 5); 
        System.out.println("====");
        System.out.println("User with Highest Total Spent:");
        User[] users = {a,b,c};
        for(int i=0;i<users.length;i++){
            System.out.println( (i+1) +". "+ users[i].username+": "+users[i].totalSpent);
        }
        System.out.println("====");
        lap.displayDetails();
        System.out.println("---");
        book.displayDetails();
    }
}
