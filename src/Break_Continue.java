//import java.util.Scanner;
//public class Break_Continue {
//    public static void main(String[] args) {
////        break: 반복문 내에서 break만나면 해당 반복문 즉시 중단
////        4까지만 출력
//        System.out.println("\n------break------\n");
//// break문을 주로 많이 사용된다.
//        for (int i = 0; i < 10; i++) {
//            if (i == 5) {
//                break;
//            }
//            System.out.println("for문 사용시 현재 i의 값 :" + i);
//
//        }
//
////        continue: 반복문 내에서 continue만나면 해당 루프만 중단하고 다음 루프로 넘어감
////        5만 빼고 다 출력
//        System.out.println("\n------continue------\n");
//        for (int i = 0; i < 10; i++) {
//            if (i == 5) {
//                continue;
//            }
//            System.out.println("for문 사용시 현재 i의 값 :" + i);
//        }
//    }
////        문제4) 구구단 전체를 출력하는 프로그램을 작성하세요.
////        조건1)사용자 입력을 받고 사용자 입력으로 2~9까지의 숫자를 입력받고 해당하는
////        단수의 구구단을 출력
////        조건2) 사용자 입력으로 받은 단수에 break와 continue를 사용하여 구구단 작성
////
////        System.out.println("보고 싶은 단수를 입력하세요");
////        Scanner scanner = new Scanner(System.in);
////        int num = scanner.nextInt();
////        System.out.println("\n-------break----\n");
////        for (int i = 2; i <= 9; i++) {
////            for (int j = 1; j <= 9; j++) {
////                if (i == num) {
////                    break;
////                }
////                System.out.println(i + "*" + j + "=" + (i * j));
////            }
////        }
////        System.out.println("\n-------continue----\n");
////        for (int i = 2; i <= 9; i++) {
////            for (int j = 1; j <= 9; j++) {
////                if (i == num) {
////                    continue;
////                }
////                System.out.println(i + "*" + j + "=" + (i * j));
////            }
////        }
//
//
////        선생님
////        Scanner scanner = new Scanner(System.in);
////        System.out.println("숫자를 입력해주세요");
////        int num1=scanner.nextInt();
////        for(int i=2; i<10; i++){
////            if(i==num1){
////                break;
////            }
////            System.out.println("\n------"+i+"단-------\n");
////            for(int j=1; j<10; j++){
////                System.out.println(i + "*" + j + "=" + (i * j));
////            }
////        }
////        for(int i=2; i<10; i++){
////            if(i==num1){
////                continue;
////            }
////            System.out.println("\n------"+i+"단-------\n");
////            for(int j=1; j<10; j++){
////                System.out.println(i + "*" + j + "=" + (i * j));
////            }
//        }
//    }
//}

