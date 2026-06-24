package collections.Generics;

public class Box <T> {
    private T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}

 class Main {
    public static void main(String[] args) {

        Box<String> box = new Box<>();

        box.setValue("Hello");

        System.out.println(box.getValue());
    }

}
