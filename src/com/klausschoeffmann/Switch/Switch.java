package com.klausschoeffmann.Switch;

public class Switch {
    public static void main(String[] args) {
        int month = 2;
        int days = 0;
        switch(month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = 31;
                break;
            case 2:
                days = 28;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;
            default:
                System.out.println("error");
        }

        System.out.println("days=" + days);
        System.exit(1);
        int note = 1;
        String text = "";
        switch(note) {
            case 1:
                text = "Sehr Gut";
                break;
            case 2:
                text = "Gut";
                break;
            case 3:
                text = "Befriedigend";
                break;
            case 4:
                text = "Genügend";
                break;
            case 5:
                text = "Nicht Genügend";
        }

        System.out.println(text);
    }
}
