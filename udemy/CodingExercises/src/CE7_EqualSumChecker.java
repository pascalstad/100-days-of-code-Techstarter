public class CE7_EqualSumChecker {

    public static void main(String[] args) {
        System.out.println(hasEqualSum(1, -1, 0));
    }

    public static boolean hasEqualSum(int myFirstInt, int mySecondInt, int myThirdInt) {
        if (myFirstInt + mySecondInt == myThirdInt) {
            return true;
        }
        return false;
    }
}
