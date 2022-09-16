package studios.areaofacircle;

public class Circle {
    public static Double getArea(Double radius) {
            return Math.round(Math.PI * Math.pow(radius, 2) * 1000.0) / 1000.0;
        }
    }
