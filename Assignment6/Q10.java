public class Q10 {
    // Method to calculate the area of a triangle
    public static double calculateArea(double base, double height) {
        return 0.5 * base * height;
    }
    
    // Method to calculate the area of a square
    public static double calculateArea(double side) {
        return side * side;
    }
    
    // Method to calculate the area of a circle
    public static double calculateArea(double radius, String type) {
        if(type.equalsIgnoreCase("A")) {
            return Math.PI * radius * radius;
        }
        else {
            return 2 * Math.PI * radius;
        }
    }
    
    // Method to calculate the area of a rectangle
    public static double calculateArea(int length, double width) {  //(double , double ) will create an error so (int , double ) 
        return length * width;
    }
    
    // Main method to test the above methods
    public static void main(String[] args) {
        
        double triangleArea = calculateArea(5, 7);
        System.out.println("Area of triangle is: " + triangleArea);
        
        double squareArea = calculateArea(4);
        System.out.println("Area of square is: " + squareArea);
        
        double circleArea = calculateArea(3, "A");
        System.out.println("Area of circle is: " + circleArea);
        
        double circleCircumference = calculateArea(3, "C");
        System.out.println("Circumference of circle is: " + circleCircumference);
        
        double rectangleArea = calculateArea(6, 8);
        System.out.println("Area of rectangle is: " + rectangleArea);
    }
}
