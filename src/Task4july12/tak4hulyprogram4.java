package Task4july12;

public class tak4hulyprogram4 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Aditya");
        System.out.println("Name " + person.getName());


    }
}





class Person
{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}