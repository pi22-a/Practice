package Like_Lion.Day1017.algorithm;

public class Pyramid {
    public void printstar(int n, String a) {

        for(int i = 0; i<n; i++){
            for (int j = 1; j< n-i; j++) {
                System.out.printf(" ");
            }
            for (int j = 0; j<(2*i)+1; j++){
                System.out.printf(a);
            }
            System.out.printf("\n");
        }
    }

    public static void main(String[] args) {
        Pyramid pr = new Pyramid();
        pr.printstar(5,"@");
    }
}
