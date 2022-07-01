package school.mjc.stage0.conditions.finalTask;

public class CoordinatePane {
    public void printQuadrant(int x, int y) {
        if (x == 0 && y == 0){
            System.out.println("zero");
        }else if (x > 0){
            System.out.println(y > 0 ? "first" : "second");
        }else{
            System.out.println(y > 0 ? "fourth": "third");
        }
    }
}
