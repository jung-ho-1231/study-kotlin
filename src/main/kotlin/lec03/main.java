package lec03;

public class main {
    public static void main(String[] args) {

    }

    public static void PrintAgeIfPerson(Object obj) {
        if (obj instanceof Person) {
            Person person = (Person) obj;
            System.out.println(person.getAge());
        }
    }
}
