package week14;

public class LeapYear {

//    public boolean isLeapYear(int year) {
//        return true;
//    }

//    public boolean isDivisibleBy4(int year) {
//        return (year % 4) == 0;
//    }
//
//    public boolean isLeapYear(int year) {
//        return isDivisibleBy4(year);
//    }
//    public boolean isDivisibleBy100(int year) {
//        return (year % 100) == 0;
//    }
//
//    public boolean isDivisibleBy4(int year) {
//        return (year % 4) == 0;
//    }
//
//    public boolean isLeapYear(int year) {
//        return isDivisibleBy4(year)&& !isDivisibleBy100(year);
//    }
    public boolean isDivisibleBy400(int year) {
        return (year % 400) == 0;
    }

    public boolean isDivisibleBy100(int year) {
        return (year % 100) == 0;
    }

    public boolean isDivisibleBy4(int year) {
        return (year % 4) == 0;
    }

    public boolean isLeapYear(int year) {
        return isDivisibleBy400(year) || (isDivisibleBy4(year) && !isDivisibleBy100(year));
    }


}
