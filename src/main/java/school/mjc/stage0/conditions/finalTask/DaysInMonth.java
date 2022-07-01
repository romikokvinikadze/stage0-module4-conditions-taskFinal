package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {
        if (year < 0 || month < 0 || month > 12) System.out.println("invalid date");
        else {
            int leap = 0;
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    leap = year % 400 == 0 ? 1 : 0;
                } else
                    leap = 1;
            }

            int days = switch (month) {
                case 1, 3, 5, 7, 8, 10, 12:
                    yield 31;
                case 2:
                    yield 28 + leap;
                default:
                    yield 30;
            };

            System.out.println(days);
        }
    }
}
