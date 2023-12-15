public class HW_6 {

    public static void main(String[] args) {
        int[]arrayNumbers = new int[]{1,2,3,4,5,6,7,8,9};
        System.out.println(binary_search(arrayNumbers, 1));


    }

    public static int binary_search(int[]arrayNumbers, int searchNumber){
        int minValue = 0;
        int maxValue = arrayNumbers.length - 1;


        while (minValue <= maxValue){
            int mid = (minValue + maxValue)/2;
            int midIndexValue = arrayNumbers[mid];

            if (midIndexValue == searchNumber){
                return mid;
            }
            if (midIndexValue > searchNumber) {
                maxValue = mid - 1;

            }
            if (midIndexValue < searchNumber){

                minValue = mid + 1;
            }


        }
        return -1;

    }
}
