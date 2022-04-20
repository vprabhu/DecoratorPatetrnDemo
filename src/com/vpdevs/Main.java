package com.vpdevs;

public class Main {

    public static void main(String[] args) {

        View textView = new TextView();

        View button = new ButtonDecorator(new TextView());

        View circleImageView = new CircularImageViewDecorator(new ImageView());

        System.out.println("add TextView");
        textView.draw();

        System.out.println("\nAdd Button");
        button.draw();

        System.out.println("\nAdd CircleImageView");
        circleImageView.draw();

    }
}
