package Enums;

public enum Sex {

    MALE("MALE"),
    FEMALE("FEMALE"),
    TRANS("TRANS"),
    NO_BINARIE("NO_BINARIE");

    private String option;

    Sex(String sex){
        this.option = sex;
    }

    public String getSex(){
        return option;
    }
}
