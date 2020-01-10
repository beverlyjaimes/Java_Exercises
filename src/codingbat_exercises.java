public class codingbat_exercises {
    public static void main(String[] args) {
        System.out.println(sleepIn(false, false));
        System.out.println(diff21(5));
        System.out.println(nearHundred(60));
    }




//    The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation. We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.
//
////        sleepIn(false, false) → true
////        sleepIn(true, false) → false
////        sleepIn(false, true) → true

//

    public static boolean sleepIn(boolean weekday, boolean vacation) {

        if(!weekday || vacation){
            return true;
        }
        return false;
    }

//
//    Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21.
//
//
//    diff21(19) → 2
//    diff21(10) → 11
//    diff21(21) → 0

    public static int diff21(int n) {
        if (n <= 21) {
            return 21 - n;
        } else {
            return (n - 21) * 2;
        }
    }



//    Given an int n, return true if it is within 10 of 100 or 200. Note: Math.abs(num) computes the absolute value of a number.
//
//
//        nearHundred(93) → true
//        nearHundred(90) → true
//        nearHundred(89) → false

    public static boolean nearHundred(int n) {
        return ((Math.abs(100 - n) <= 10) || (Math.abs(200 - n) <= 10));
    }
}