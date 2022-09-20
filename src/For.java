import java.util.Scanner;

public class For {
    public static void main(String[] args) {
//        for: 가장 많이 사용되는 반복문.
//        while문과 차이점
//        1.초기화 변수와 초기화 변수 카운트를 for문의 설정 부분에 입력
//        2.초기화 변수가 for문의 설정 부분에 입력되면서 for문의 지역변수로
//        사용되어 같은 이름의 변수를 계속 사용할 수 있다.
//        3.초기화 변수 카운트가 항상 마지막에 동작함.(for문의 공식)
        System.out.println("\n-------for문--------\n");
        for (int i=0; i<10; i++){  //i++ 형식 고정되어있기 때문에 값이 유동적이지 않다.
            System.out.println(i);
        }
//        for문은 가증. int i는 for문 안에서 사용됨{ }안에서만. 그렇기 때문에
//        밑에 있는 for문을 사용할 때는 이미 i가 사라져 있기에 다시 사용가능하다.
        for (int i=0; i<10; i++){
            System.out.println(i);
        }




//  while은 기존 변수명 재사용 불가하다.
//        기존의 변수를 재활용하고 저장된 값을 초기화하여 사용해야 함.
//        System.out.println("\n-------while문--------\n");
//        int count=0;
//        while(count<10){
//            System.out.println(count);
//            count++; //while은 내부에 있다. 위치에 따라 값이 달라짐.
//        }
//        int count=0; 동일한 이름의 변수를 선언할 수 없음.
//        while(count<10){
//            System.out.println(count);
//            count++;
//        }

//        문제 1) 아래의 while문을 for문으로 변환하여 출력하세요.
        int hit=0;
        while(hit<5){
            hit++;
            System.out.println("나무를"+hit+"번 찍었습니다.");

            if(hit==5){
                System.out.println("나무가 넘어갑니다.");
            }
     }

        int i=0;
        for( i=1; i<5; i++){
            System.out.println("나무를"+i+"번 찍었습니다.");
        }
        if(i==5){
            System.out.println("나무가 넘어갑니다.");
        }

//

//        문제2) 원하는 단수의 구구단을 출력하는 프로그램을 for문 사용하여 출력
        System.out.println("원하는 단의 구구단을 말하시오");
        Scanner scanner=new Scanner(System.in);
        int dan = scanner.nextInt();
        int j;
        int total;

        for(j=1; j<10; j++){
            total=dan*j;
            System.out.println(dan+"*"+j+"="+total);
        }

//      3) 사용자 입력을 통해서 데이터 5개 입력받은 값의 총합을 구하는
//        프로그램을 for문을 사용하여 작성하세요.

//        System.out.println("5개의 수를 쓰세요.");
//        int num= scanner.nextInt();
//        int sum=0;
//
//        for(i=1; i<=6; i++){
//            sum=num+sum;
//        }
//        System.out.println("총합은 "+sum+"입니다.");



//        4)for문을 사용하여 아래의 모양과 동일한 모양이 출력 되도록 프로그래밍 하세요.
//        *
//        **
//        ***
//        ****
//        *****


//        for(int p=1; p<6; p++) {
//            for (int s = 1; s < 6; s++)
//                System.out.println("*");
//        }
//
//    선생님
    String star ="";
    for(int s=0; s<5; s++){
        star +="*";
        System.out.println(star);
        }

        System.out.println("\n---------------중첩 for문--------\n");
//        for문 안에 for문 존재하는 형태의 for문
//        2차원 배열의 내용을 출력할 때 많이 사용함.

//        for (int m=0; m<5; m++){
//            for(int n=0; n<5; n++){
//                System.out.println("m의 값: "+ m+"\tn의 값: "+n);
//            }
//            System.out.println("---------");
//        }

//        구구단
//        i+=2;하면 2씩 숫자가 올라간다.
//        변수의 카운트 부분을 ++를 사용한 단항 연산자가 아닌 산출 대입 연산자를
//        사용시 원하는 크기만큼 카운트 값을 변경할 수 있다.
//        밖에 꺼 한 번 돌 때 안에 꺼 전체 다 돈다.
//        for(int i=2; i<10; i++ ){
//            System.out.println("--------"+i+"단------");
//            for(int j=1; j<10; j++){
//                System.out.println(i+"*"+j+"="+(i*j));
//            }
//        }


    }
}

