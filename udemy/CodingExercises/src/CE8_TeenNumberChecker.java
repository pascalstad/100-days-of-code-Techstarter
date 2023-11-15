public class CE8_TeenNumberChecker {

    public static void main(String[] args) {
        System.out.println(hasTeen(22, 23, 34));
        System.out.println(isTeen(9));
    }

    public static boolean hasTeen(int myFirstInt, int mySecondInt, int myThirdInt) {
        if (myFirstInt >= 13 && myFirstInt <=19) {
            return true;
        } else if (mySecondInt >= 13 && mySecondInt <= 19) {
            return true;
        } else if (myThirdInt >= 13 && myThirdInt <=19) {
            return true;
        }
        return false;
    }

    /*
    after second method it can be used in the first like:
        public static boolean hasTeen(int myFirstInt, int mySecondInt, int myThirdInt) {
            return isTeen(myFirstInt) || isTeen(mySecondInt) || isTeen(myThirdInt;
        }
     */

    public static boolean isTeen(int age) {
        return age >= 13 && age <= 19;
    }
}
