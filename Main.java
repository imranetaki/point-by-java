public class Main {
    public static void main(String[] args) {
        point pts1 = new point(4, 3);
        System.out.println("Distance is: " + pts1.distance(new point(0, 0)));
        System.out.println("Norm: " + pts1.norm());
    }
}