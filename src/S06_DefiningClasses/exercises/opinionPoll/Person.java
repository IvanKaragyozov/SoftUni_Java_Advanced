package S06_DefiningClasses.exercises.opinionPoll;

public class Person {

    private String name;
    private int age;

    // Constructor
    public Person(String name, int age){
        this.name = name;
        this.age  = age;
    }

    // getter -> returns the value of name;
    public String getName(){
        return name;
    }

    // getter -> returns the value of age;
    public int getAge(){
        return age;
    }

    /**
     * returns object in text form
     * object = text "{name} - {age}"
     * @return name + " - " + age;
     */
    @Override
    public String toString(){
        return name + " - " + age;
    }

}
