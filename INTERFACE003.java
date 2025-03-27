interface TacoBox{
    int tacoRemaining();
    void eat();
}
class TripleTacoBox implements TacoBox{
    int tacos =3;
    public int tacoRemaining(){
        return this.tacos;
    }
    public void eat(){
        if(this.tacos>0){
            this.tacos--;
        }
    }
}
class CustomTacoBox implements TacoBox{
    int tacos;
    public CustomTacoBox(int tacos){
        this.tacos = tacos;
    }
    public int tacoRemaining(){
        return this.tacos;
    }
    public void eat(){
        if(this.tacos>0){
            this.tacos--;
        }
    }
}
public class INTERFACE003 {
    public static void main(String[] args){
        TacoBox box = new TripleTacoBox();
        box.eat();
        box.eat();
        System.out.println("Triple taco boxes left: "+box.tacoRemaining());
        box = new CustomTacoBox(8);
        box.eat();
        System.out.println("Custom taco boxes left: "+box.tacoRemaining());
    }
}
