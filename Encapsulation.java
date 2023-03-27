class Area {

    // fields to calculate area
    int length;
    int breadth;

    // constructor to initialize values
    Area(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // method to calculate area
    public int calculateArea() {
        return length * breadth;
    }

    private void getAssignedValue() {
        System.out.println(length);
        System.out.println(breadth);
    }

    protected void getArea(float x) {
        System.out.println("Area: " + x);
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Area area = new Area(5, 6);
        int result = area.calculateArea();
//        area.getAssignedValue(); this will return error
        area.getArea((float) result);
    }
}
