import java.util.ArrayList;

public class PersonMain {
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<Person>();
    persons.add(new Teacher("Ada Lovelace", "24 Maddox St. London W1S 2QN", 1200));
    persons.add(new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028"));

        Person ada = new Person("Ada Lovelace", "24 Maddox St. London W1S 2QN");
        Person esko = new Person("Esko Ukkonen", "Mannerheimintie 15 00100 Helsinki");

        System.out.println(ada);
        System.out.println(esko);

        Teacher adaL = new Teacher("Ada Lovelace", "24 Maddox St. London W1S 2QN", 1200);
        Teacher eskoU = new Teacher("Esko Ukkonen", "Mannerheimintie 15 00100 Helsinki", 5400);
        System.out.println(adaL);
        System.out.println(eskoU);

        Student ollie = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");

        int i = 0;
        while (i < 25) {
            ollie.study();
            i = i + 1;
        }
        System.out.println(ollie);
        // ollie.study();
        System.out.println(ollie);

        printPerson(persons);

    }

    public static void printPerson(ArrayList<Person> persons) {
        for (Person person : persons) {
            System.out.println(person);
        }
    };
}
