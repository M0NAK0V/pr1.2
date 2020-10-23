package pack1;
import java.lang.*;
public class DOG {
    private String name;
    private int age;

    public DOG(String n, int a){
        name = n;
        age = a;
    }

    public DOG(String n){
        name = n;
        age = 5;
    }

    public DOG(){
        name = "dog";
        age = 8;
    }
    public void setName(String name) {this.name = name;}
    public void setAge(int age) {this.age = age;}
    public int getAge() {return age;}
    public String getName(String name){return name;}
    public String toString() {
        return name + "`s age in human years is " + age * 7 + " years";
    }
}