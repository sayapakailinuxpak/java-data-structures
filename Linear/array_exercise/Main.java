package Linear.array_exercise;
public class Main{
    public static void main(String[] args) {
        Array array = new Array(5);
        array.insert(2);
        array.insert(5);
        array.insert(5);
        array.insert(5);
        array.insert(5);
        array.removeAt(1);
        array.print();
    }
}