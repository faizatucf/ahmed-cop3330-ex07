/*
 *  UCF COP3330 Fall 2021 Assignment 7 Solution
 *  Copyright 2021 Faiz Ahmed
 */

import java.util.*;
public class area {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double length, width, area, constant, area_meters;
        constant = 0.09290304;
        System.out.println("What is the length of the room in feet?");
        length = sc.nextInt();
        System.out.println("What is the width of the room in feet?");
        width = sc.nextInt();
        area = length * width;
        area_meters = area * constant;
        System.out.println(String.format("You entered dimensions of %.0f feet by %.0f feet.\nThe area is\n%.0f square feet\n%.3f square meters",
        length,width,area,area_meters));
    }
}