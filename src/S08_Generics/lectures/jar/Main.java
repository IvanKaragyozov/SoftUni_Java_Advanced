package S08_Generics.lectures.jar;

public class Main {

    public static void main(String[] args) {

        Jar<Integer> jar = new Jar<>();
        jar.add(2);
        jar.add(3);
        jar.add(4);

        System.out.println(jar.remove());
        System.out.println(jar.remove());
    }
}
