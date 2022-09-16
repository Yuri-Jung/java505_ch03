import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

//import java.sql.SQLOutput;
//while은 기본적인 반복문
//while문 실행 시 while문 밖에서 초기화 변수를 선언하고, while 안에서 초기화 변수의 카운트가 필요함.
public class While {
    public static void main(String[] args) {
//        System.out.println("\n-------while문-----\n");
//
//        int hit = 0; //초기화변수
//
//        while (hit < 100) {  //true라면 while안의 코드 블럭 실행
//            hit++;
//            System.out.println("나무를 " + hit + "번 찍었습니다.");
//
//            if (hit == 100) {
//                System.out.println("나무가 넘어갑니다.");
//            }
//        }
////          while 사용 시 주의점
////          1. 초기화 변수의 카운트 위치에 따라 결과가 달라짐.
////            1.1 프로그래밍 익숙하지 않은 경우 변수의 카운트 부분을 고정해서 사용하는게 좋음.(카운트변수를 맨 처음 혹은 맨 마지막)
////            선생님 추천은 맨마지막 줄에 넣는 것.
////            1.2 while문을 탈출할 수 있는 조건을 반드시 명시해야 한다.(그렇지않으면 무한루프에 빠질 수 있다.)
////            1.3 break문을 사용하여 탈출
//        hit = 0; //초기화변수
//
//        while (hit < 5) {  //true라면 while안의 코드 블럭 실행
//            hit++;
//            System.out.println("나무를 " + hit + "번 찍었습니다.");
//
//            if (hit == 5) {
//                System.out.println("나무가 넘어갑니다.");
//            }
//        }
////            2)while문을 사용하여 1~10까지 화면에 출력하는 프로그램 작성하세요
//        int num = 0;
//
//        while (num < 10) {
//            num++;
//            System.out.println(num);
//        }
////            선생님
//        int count = 0;
//        while (count < 10) {
//            System.out.print(" " + count);
//            count++;
//        }
//
//
////        3) while사용하여 1~10 더하는 프로그램 작성하시오.
//        int i = 0;
//        int sum = 0;
//        while (i < 10) {
//            i++;
//            sum = sum + i;
//            System.out.println("합계 = " + sum);
//        }


        //      선생님
//        int count = 0;
//        int total = 0;
//        while (count < 11) {
//            total = total + count;
//            System.out.println("count" + count + "\ntotal :" + total);
//            count++;
//
            Scanner scanner = new Scanner(System.in);
//            count = 0;
//            int n = 0; //숫자입력(정수)
//            double sum = 0.0; //전체값

//            System.out.println("정수를 입력하고 마지막에 0을 입력하세요");
////          while문의 조건식에 탈출조건까지 함께 지정 0과 같으면 탈출.
////            키보드 입력을 통한 데이터가 0이 아닐경우 아래의 while문 실행
////            0이면 while문 종료.
//            while ((n = scanner.nextInt()) != 0) {
//                sum = sum + n;
//                count++;
//                System.out.println("수의 개수는"+count+"개이며");
////                총합이 저장된 변수sum은 double형
////                입력된 데이터의 수가 저장된 변수 count는 int형
////                double형과 int형의 연산이 수행되면 자동형변환이 발생하여
////                double형으로 데이터가 만들어짐.
//                System.out.println("평균은"+sum/count+"입니다");
//
//        4)while문을 사용하여 지정한 단수의 구구단을 출력하세요
//           출력형태 : 5* 1 = 5 5~*9 = 45

        int num1 =5;
        int num2=0;
        int total = 0;
        while(num2<9){
            num2++;
            total = num1*num2;

            System.out.println(num1+ "*"+ num2+"=" + total);
        }

//        선생님
        System.out.println("보고싶은 단을 치시오");
        int dan = scanner.nextInt();
        int count = 1;

        while(count<10){
            System.out.println(dan+"*"+count+"="+(dan*count));
            count++;
        }

//        다중 while문 : 하나의 while 문 안에 또 다른 while문이 있는 형태의 while문.
        System.out.println("\n------다중 while문----\n");
//
        int i = 0;
//        int j = 0;

        while(i<5){
            int j = 0;

            while(j<5){
                System.out.println("i : "+i+"\tj :"+j);
                j++;
            }
            i++;
            j=0;
        }
//                    int j = 0;안에 넣으면 보다 더 간단하다.

//        문제 5)while문을 사용하여 2~9단 구구단 모두 출력하는 프로그램 만들어라
//        다중 while문 사용
//        출력형태 : 5*1=5~5*9=45
        System.out.println("보고싶은 단을 치세요2");

//        total=0;
//        total = i*j;
//        while(i<9){
//            int j= 0;
//
//            while(j<9){
//                System.out.println("i : "+i+"*"+"\tj :"+j+"="+total);
//                j++;
//            }
//            i++;
//            j=0;
//        }

//        선생님의 구구단
        i=2;
        while(i<10){
            System.out.println("----"+i+"단------");
            int j = 1;
            while (j<10){
                System.out.println(i+"*"+j+"="+(i*j));
                j++;
            }
            i++;
        }
//       do while: 기본적으로 while문과 동일한 반복문, 무조건 1번은 실행되는 while문
//        반복조건을 마지막에 확인한다.
        System.out.println("\n------일반 while문------\n");
//      일반 while은 조건먼저확인한다.
        int c1 = 5;
        while (c1<5){
            System.out.println(c1);
            c1++;
        }
        System.out.println("\n------do while문------\n");
//      do while은 일단 먼저 실행하고 조건을 확인하다.
        int c2 =0;
        do{
            System.out.println(c2);
            c2++;
        } while(c2<5);
    }
}
