package SEMESTR1;

public class AddManager extends Employee {
    int age;

    public AddManager(String name, int age) {
        super(name);
        this.age = age;
    }

    @Override
    public void display(){
        super.display();
        System.out.println("AddManager");
    }
}
