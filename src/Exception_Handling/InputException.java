package Exception_Handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));
        System.out.println("정수 3개를 입력하세요");
        int sum=0, n=0;
        for(int i=0; i<3; i++){
            System.out.println(i+">>");
            try {
                n = scanner.nextInt();
            }
            catch (InputMismatchException e){ // 입력 오류 시 발생하는 예외
                System.out.println("정수가 아닙니다. 다시 입력해주세요.");
                scanner.next(); // 입력 스트림에 있는 정수가 아닌 토큰을 버린다.
                i--; // 인덱스가 증가하지 않도록 미리 감소해준다.
                continue;
            }
            sum += n;
        }
        System.out.println("합 : " + sum);
        scanner.close();
    }
}
