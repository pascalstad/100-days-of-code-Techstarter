public class CE5_LeapYear {

    public static void main(String[] args) {
        System.out.println(isLeapYear(2017));
    }
    
    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        } else if (year % 4 == 0 && year % 100 != 0) {
            return true;
        }
        return year % 100 == 0 && year % 400 == 0;
    }
}
