package homework3;
//Task2
public class Person {
    public String name;
    int age;
    int id;
    static int counter =1;


    public Person(String myName , int myAge){
        this.name=myName;
        this.age=myAge;
        id = counter++;
    }

    public void information() {
        System.out.printf("%d:%s is %d years old ;\n",id, name,age);
    }

    public static void main(String[] args) {
        Person p1 = new Person("Max", 19);
        Person p2 = new Person("Danulo", 15);
        Person p3 = new Person("Zahar", 16);
        p1.information();
        p2.information();
        p3.information();
    }
    }