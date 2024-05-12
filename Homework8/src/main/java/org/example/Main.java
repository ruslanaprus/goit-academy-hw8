package org.example;

import org.example.shapes.Oval;
import org.example.shapes.Triangle;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Shape square = new Triangle();
        Shape deanmeow = new Oval();
        System.out.println("deanmeow.getNumberOfSegments() = " + deanmeow.getNumberOfSegments());
    }
}