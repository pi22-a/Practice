package Like_Lion.Day1018.algorithm;

import Like_Lion.Day1018.algorithm.SquareStar;

public class SquareStar {
    public void printstar(int n, String a) {

        for(int i = 0; i<n; i++){
            for (int j = 0; j < n; j++) {
                System.out.printf(a);
            }

            System.out.printf("\n");
        }
    }

    public static void main(String[] args) {
        SquareStar rt = new SquareStar();
        rt.printstar(5,"#");
    }
}
