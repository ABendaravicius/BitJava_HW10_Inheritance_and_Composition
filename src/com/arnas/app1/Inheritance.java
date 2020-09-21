package com.arnas.app1;

class VideoGame {
    private String name;
    private String publisher;
    private double price;
    private String style; // 2D or 3D

    public VideoGame(String name, String publisher, double price, String style) {
        this.name = name;
        this.publisher = publisher;
        this.price = price;
        this.style = style;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    @Override
    public String toString() {
        return "VideoGame\n> name= " + name + "\n" +
                "> publisher= " + publisher + "\n" +
                "> price= " + price + "\n" +
                "> style= " + style + '.';
    }
}

class Shooter extends VideoGame {
    private String type; // First-person or Third-person
    private boolean hasMultiplayer;

    public Shooter(String name, String publisher, double price, String style, String type, boolean hasMultiplayer) {
        super(name, publisher, price, style);
        this.type = type;
        this.hasMultiplayer = hasMultiplayer;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isHasMultiplayer() {
        return hasMultiplayer;
    }

    public void setHasMultiplayer(boolean hasMultiplayer) {
        this.hasMultiplayer = hasMultiplayer;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "> type= " + type + "\n" +
                "> hasMultiplayer=" + hasMultiplayer + ".";
    }
}

//class Racing extends VideoGame {
//
//}

public class Inheritance {

    public static void main(String[] args) {
        Shooter cod = new Shooter("Call of Duty", "Activision", 59.99, "3D", "First-Person Shooter", true);

        System.out.println("- - -");
        System.out.println(cod);
    }

}
