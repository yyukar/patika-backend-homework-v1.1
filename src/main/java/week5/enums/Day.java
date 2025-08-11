package week5.enums;

public enum Day {

    MONDAY("Monday", "Work hours for MONDAY: 9:00 - 17:00"),

    TUESDAY("Tuesday", "Work hours for TUESDAY: 9:00 - 17:00"),

    WEDNESDAY("Wednesday", "Work hours for WEDNESDAY: 9:00 - 17:00"),

    THURSDAY("Thursday", "Work hours for THURSDAY: 9:00 - 17:00"),

    FRIDAY("Friday", "Work hours for FRIDAY: 9:00 - 17:00"),

    SATURDAY("Saturday", "Work hours for SATURDAY: 10:00 - 14:00"),

    SUNDAY("Sunday", "Work hours for SUNDAY: 10:00 - 14:00");

    private final String workHour;
    private final String displayName;

    Day(String displayName , String workHour) {
        this.workHour = workHour;
        this.displayName = displayName;
    }

    public String getWorkHour() {
        return workHour;
    }

    public String getDisplayName() {
        return displayName;
    }

    public static String printDay(String inputDayName) {
        for (Day currentDay : values()) {
            if (currentDay.displayName.equalsIgnoreCase(inputDayName)) {
                return currentDay.getWorkHour();
            }
        }
        return "Invalid day entered!";
        //return values()[number-1].getWorkHour();
    }
}
