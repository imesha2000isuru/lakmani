public class Triangle implements Shape {
    @Override
    public void draw() {
        int height = 5; // Height of the triangle
        for (int i = 1; i <= height; i++) {
            for (int j = 0; j < height - i; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k < 2 * i - 1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
