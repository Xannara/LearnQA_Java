public class Day4_Numbers {

    public static void main(String[] args) {

        int[] numbers = {1, 3, 2, 12, 11};
        int sum = 5;
        findSumTrue(numbers, sum);
    }

    public static boolean findSumTrue(int[] numbers, int sum) {
        for(int i = 0; i < numbers.length; i++) {
            for(int j = i; j < numbers.length-1; j++) {
                if(i != j) {
                    int num = numbers[i] + numbers[j];
                    if (num == sum) {
                        System.out.println(numbers[i] + " + " + numbers[j] + " = " + sum + " True");
                        return true;
                    }
                }
            }
        }
        System.out.println("False");
        return false;
    }
}
