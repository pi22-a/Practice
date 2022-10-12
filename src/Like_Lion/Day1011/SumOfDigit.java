public class SumOfDigit {
    public  int solution(int n){
        int result = 0;

        while (n>0){
            result += n%10;
            n = n/10;
        }
        return result;
    }
    public static void main(String[] args) {
       SumOfDigit sod = new SumOfDigit();
       int result1 = sod.solution(1234);

       if (result1 == 10){
           System.out.println("성공");
       }
    }
}