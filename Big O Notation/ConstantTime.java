public class ConstantTime{

    //No matter how many inputs, the algorrithm time complexity is always constant time O(1)
    public void log(int[] numbers){
        System.out.println(numbers[0]); //O(1)
        System.out.println(numbers[0]); //O(2)
    }
}