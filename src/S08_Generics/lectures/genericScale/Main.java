package S08_Generics.lectures.genericScale;

public class Main {

    public static void main(String[] args) {

        Scale<String> stringScale = new Scale<>("12", "11");
        System.out.println(stringScale.getHeavier());

    }
}
