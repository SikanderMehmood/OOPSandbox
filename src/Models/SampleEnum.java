package Models;

/*
Enums are constants that are never going to change in your application.
Like days in a week
Months in a year
 */



public enum SampleEnum {

    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY("Some value");

    private String value;


    SampleEnum(){
    }

    SampleEnum(String value) {
        this.value=value;
    }

    public String getValue(){
        return value;
    }
    public String getName(){
        return name();
    }
}
