package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        int xDiffer = x2 - x1;
        int yDiffer = y2 - y1;
        double rsl = Math.sqrt((Math.pow(xDiffer,2)) + Math.pow(yDiffer, 2));
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);

        double result2 = Point.distance(1, 5, 6, 20);
        System.out.println("result2 (1, 5) to (6, 20) " + result2);

        double result3 = Point.distance(7, 45, 34, 11);
        System.out.println("result3 (7, 45) to (34, 11) " + result3);
    }
}
