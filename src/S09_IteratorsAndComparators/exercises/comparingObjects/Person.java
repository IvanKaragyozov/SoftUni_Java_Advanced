package S09_IteratorsAndComparators.exercises.comparingObjects;

public class Person implements Comparable<Person> {

    private String name;
    private int age;
    private String town;

    public Person(String name, int age, String town) {
        this.name = name;
        this.age = age;
        this.town = town;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getTown() {
        return town;
    }

    @Override
    public int compareTo(Person person2) {
        // person1.compareTo(person2)
        int result = this.name.compareTo(person2.getName());
        if(result == 0){
            // names are equivalent -> check years
            result = Integer.compare(this.age, person2.getAge());
        }
        if(result == 0){
            // years are equivalent -> check towns
            result = this.town.compareTo(person2.getTown());

        }
        return result;
    }
}
