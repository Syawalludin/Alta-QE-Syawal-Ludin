public class Mean {

    private static float mean(float[] numbers){
        int middle = numbers.length/2;
        if (numbers.length%2 == 1) {
            return numbers[middle];
        } else {
            return (float) ((numbers[middle-1] + numbers[middle]) / 2.0);
        }
    }

    public static void main (String[] args){
        float[] value = {1, 2, 3, 4};
        System.out.println(mean(value));
    }

}
