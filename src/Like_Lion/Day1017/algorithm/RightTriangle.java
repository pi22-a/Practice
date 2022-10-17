package Like_Lion.Day1017.algorithm;

public class RightTriangle {
    public void printstar(int n, String a) {

        for(int i = 0; i<n; i++){
            for (int j = 0; j<i; j++){
                System.out.printf(a);
            }
            System.out.printf("\n");
        }
    }

    public static void main(String[] args) {
        RightTriangle rt = new RightTriangle();
        rt.printstar(10,"#");
    }
}
