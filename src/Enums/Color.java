package Enums;

public enum Color {

    RED("RED"),
    GREEN("GREEN"),
    BLUE("BLUE"),
    LIGHT_BLUE("LIGHT_BLUE"),
    BROWN("BROWN"),
    WHITE("WHITE"),
    BLACK("BLACK"),
    YELLOW("YELLOW"),
    TORNASOL("TORNASOL"),
    BI_COLOR("BI_COLOR"),
    GOLDEN("GOLDEN"),
    PLATEAU("PLATEAU"),
    ORANGE("ORANGE"),
    GRAY("GRAY"),
    PURPLE("PURPLE"),
    PINK("PINK");

    private String color;

    Color(String color){
        this.color = color;
    }

    private String getColor(){
        return this.color;
    }
}
