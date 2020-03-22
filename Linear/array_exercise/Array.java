package Linear.array_exercise;



public class Array{
    int[] numbers;
    int counter;

    public Array(int length){
        numbers = new int[length];
    }

    public void insert(int value){
        numbers[counter] = value;
        counter++;
    
    }

    public void removeAt(int index){
        for(int i=0; i<counter; i++){
        
        }
    }

    public void print(){
        for(int i = 0; i<counter; i++){
            System.out.println(numbers[i]);
        }
    }
}