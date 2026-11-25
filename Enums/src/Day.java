public enum Day {

    SUNDAY(1),
    MONDAY(2),
    TUESDAY(3),
    WEDNESDAY(4),
    THURSDAY(5),
    FRIDAY(6),
    SATURDAY(7);

    private final int DayNumber;


    Day(int DayNumber) {
        this.DayNumber = DayNumber;
    }

    public int getDayNumber() {
        return this.DayNumber;
    }
}
