import java.util.ArrayList;

interface Packable{
    double weight();
}
class Book implements Packable{
    String author;
    String name;
    double weight;
    public Book(String author, String name, double weight){
        this.author = author;
        this.name = name;
        this.weight = weight;
    }
    public double weight(){
        return this.weight;
    } 
    @Override
    public String toString(){
        return this.author + ": " + this.name;
    }  
}
class CD implements Packable{
    String artist;
    String name;
    int publicationYear;
    double weight;
    public CD(String artist, String name, int publicationYear){
        this.artist = artist;
        this.name = name;
        this.publicationYear = publicationYear;
        this.weight = 0.1;
    }
    public double weight(){
        return this.weight;
    }
    @Override
    public String toString(){
        return this.artist + ": " + this.name + " (" + this.publicationYear + ")";
    }
}
public class INTERFACE001 {
    public static void main(String[] args){
        ArrayList<Packable> items = new ArrayList<>();
        items.add(new Book("Fyodor Dostoevsky", "Crime and Punishment", 1.0));
        items.add(new Book("Robert Martin", "Clean Code", 1.0));
        items.add(new Book("Kent Beck", "Test Driven Development", 1.0));
        items.add(new CD("Pink Floyd", "Dark Side of the Moon", 1973));
        items.add(new CD("Wigwam", "Nuclear Nightclub", 1975));
        items.add(new CD("Rendezvous Park", "Closer to Being Here", 2012));
        for(Packable item : items){
            System.out.println(item.toString());
        }
    }
}
