import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        System.out.println("----배열 사용하기-----");

//        배열 : 하나의 이름으로 여러 데이터를저장하기 위한 데이터 타입
//        자바의 배열은 동일한 데이터 타입의 데이터만 저장할 수 있다.
//        배열은 index를 가지고 있으며 데이터를 index를 통해서 구분함
//        index는 0부터 시작
//        new키워드를 사용해서 배열을 초기화시 해당 데이터 타입의 초기값으로 초기화됨
//        지정된 크기 이상의 index에 접근 시 오류발생.

//        사용법 :
//        선언 : 1) 데이터타입 배열명 [] = new 데이터타입[크기];
//              2) 데이터 타입 배열명[]; 배열명= new 데이터타입[크기];
//              3) 데이터 타입 배열명 []={데이터1, 데이터2, 데이터3, ,,,};
//        사용 : 1.배열명[index]; //지정한 index에 있는 데이터를 가져옴.
//              2.배열명[index]=데이터; // 지정한 index에 데이터를 저장.
//
//        빈 배열 선언, 메모리 상에 array1이란 빈 배열을 등록, 해당 배열을 사용 시
//        반드시 초기화 작업을 해야 한다.


//        첫번째 방법
        int arrray1[];
//        System.out.println(arrray1); 초기화하지 않은 배열 사용시 오류
        arrray1 = new int[5]; // 배열을 초기화함.
        System.out.println("배열 array1의 메모리주소: " + arrray1); //초기화하니까 출력됨.[I@43a25848-메모리주소 데이터 없으니까 데이터는 안나옴.
        System.out.println("배열 array1의 index 0의 값: " + arrray1[0]);
        arrray1[2] = 10;
        System.out.println("배열 array1의 index 2의 값: " + arrray1[2]);
        System.out.println("배열 array1의 index 4의 값: " + arrray1[4]); //이래도 0으로 출력됨
//        System.out.println("배열 array1의 index 4의 값: "+arrray1[5]); 지정된 크기 이상의 index에 접근 시 오류발생.
        System.out.println("배열 array1의 길이: " + arrray1.length); //해당 배열의 길이 알려줌


        System.out.println();
//        두 번째 방법
        int arrray2[] = new int[5];

        System.out.println("배열 array2의 메모리주소: " + arrray2);
        System.out.println("배열 array2의 index 0의 값: " + arrray2[0]);
        arrray2[2] = 20;
        System.out.println("배열 array1의 index 2의 값: " + arrray2[2]);
        System.out.println("배열 array2의 index 4의 값: " + arrray2[4]);
        System.out.println("배열 array2의 길이: " + arrray2.length);

        System.out.println();

//        3번째 방법
        int array3[] = {10, 20, 30, 40, 50}; //{}안의 값만큼 길이가 자동으로 정해진다.
        System.out.println("배열 array3의 메모리주소: " + array3);
        System.out.println("배열 array3의 index 0의 값: " + array3[0]);
        array3[2] = 300;
        System.out.println("배열 array3의 index 2의 값: " + array3[2]);
        System.out.println("배열 array3의 index 4의 값: " + array3[4]);
        System.out.println("배열 array3의 길이: " + array3.length);

//                array3[2]=-500; (-)를 넣으면 안됨


//        int array4[];
//        array4={10,20,30,40,50}; //반드시 선언과 동시에 사용해야 한다. 오류발생, 무조건 new를 사용해야한다.
//        아래처럼 해야한다.
//        배열을 먼저 선언한고 데이터를 나중에 입력하는 1번 형식으로 배열을 선언 시
//        3번 형식의 데이터 입력은 불가능함.
//        array4=new int[5]; //무조건 new사용해야 한다.
//        array4[0]=10;
//        array4[1]=20;
//        array4[2]=30;
//        array4[3]=40;
//        array4[4]=50;

//        문제5) int 타입의 변수 intArray를 생성하고 크기를 10으로 설정한 후 각 index에 1-10까지의 데이터를 입력하고
//        저장된 데이터를 출력하세요.
//        int intArray[];
//        intArray=new int[10];
        int intArray[] = {1, 2, 3, 4, 5,6,7,8,9,10};
        System.out.println(intArray[0]);
        System.out.println(intArray[1]);
        System.out.println(intArray[2]);
        System.out.println(intArray[3]);
        System.out.println(intArray[4]);
        System.out.println(intArray[4]);
        System.out.println(intArray[6]);
        System.out.println(intArray[7]);
        System.out.println(intArray[8]);
        System.out.println(intArray[9]);

        int intArray2[]=new int[10];
        intArray2[0]=1;
        intArray2[1]=2;
        intArray2[2]=3;
        intArray2[3]=4;
        intArray2[4]=5;
        intArray2[5]=6;
        intArray2[6]=7;
        intArray2[7]=8;
        intArray2[8]=9;
        intArray2[9]=10;

        System.out.println(intArray[0]);
        System.out.println(intArray[1]);
        System.out.println(intArray[2]);
        System.out.println(intArray[3]);
        System.out.println(intArray[4]);
        System.out.println(intArray[4]);
        System.out.println(intArray[6]);
        System.out.println(intArray[7]);
        System.out.println(intArray[8]);
        System.out.println(intArray[9]);
//
//        int intArray3[]=new int[10];
//
//        for(int i=0; i<10; i<intArray3.length; i++){
//            intArray3[i]=i+1;
//
//        }

//        문제6) 문제 5의 intArray에 저장된 값을 모두 합하는 프로그램을 작성하세요
        System.out.println(intArray[0]+ intArray[1]+intArray[2]+intArray[3]+intArray[4]+intArray[5]+intArray[6]+
                intArray[7]+intArray[8]+intArray[9]);

        int total=0;
        total = intArray[0]+ intArray[1]+intArray[2]+intArray[3]+intArray[4]+intArray[5]+intArray[6]+
                intArray[7]+intArray[8]+intArray[9];
        System.out.println(total);



//        for(int i=0; i<11; i++){
//            int sum = sum+intArray[i];
//        System.out.println(sum);
//        }
        System.out.println("\n-----기본 타입과 레퍼런스 타입-----\n");
        int a=10;
        int b=20;
//      변수 a의 값을 변수 b에 복사하여 넘겨줌.
        System.out.println("변수 a의 값: "+a+"+"+"\t변수 b의 값: "+b);

        b=a;
        System.out.println("변수 a의 값: "+a+"\t변수 b의 값: "+b);

//        변수a의 값을 변경해도 변수 b의 값은 그대로 남아있음. 값을 복사해서 넘겨줬기 때문
            a=100;
        System.out.println("변수 a의 값: "+a+"\t변수 b의 값: "+b);

        System.out.println();
        int arr1[]={100};
        int arr2[]={200};
        System.out.println("배열 arr1의 주소: "+arr1+"\t배열 arr2의 주소: "+arr2);
        System.out.println("배열 arr1[0]의 주소: "+arr1[0]+"\t배열 arr2의 주소: "+arr2[0]);

        arr2=arr1; //arr1과 arr2의 주소가 동일해짐. 주소를 복사했기 때문
        System.out.println("배열 arr1의 주소: "+arr1+"\t배열 arr2의 주소: "+arr2);
        System.out.println("배열 arr1[0]의 주소: "+arr1[0]+"\t배열 arr2의 주소: "+arr2[0]);

        arr1[0]=2000;
        System.out.println("배열 arr1의 주소: "+arr1+"\t배열 arr2의 주소: "+arr2);
        System.out.println("배열 arr1[0]의 주소: "+arr1[0]+"\t배열 arr2의 주소: "+arr2[0]);
//        결과가 동일하게 나온다. arr1과 arr2의 주소가 동일하기 때문에


//        p.106 배열 선언 및 생성

        int arrayInt[]; //배열선언
        arrayInt=new int[5]; //배열 크기 설정
        //        int c=5;
//        arrayInt=new int[c];
        arrayInt[4]=100;
//        크기 선언할 때 변수사용안된다.ex.new int[e](x)
//        배열 선언 시 배열의 크기를 설정하는 부분에 변수 사용 금지.
//        하지만 상수는 사용 가능하다.
//        변수는 변경되는 값이기 때문에 배열의 크기가 어떻게 될지 알 수 없다.
//        배열의 index접근에는 변수를 사용하는 것이 가능.
        int max= 0;  //현재 가장 큰 수를 저장하기 위한 변수
        System.out.println("양수 5개를 입력하세요");

        Scanner scanner =new Scanner(System.in);

        for(int i=0; i<5; i++){
//            사용자 입력을 통해 얻은 데이터를 배열에 저장
            arrayInt[i]= scanner.nextInt(); //i번째 . 사용자가 입력한 걸 대입
//            배열에 저장된 데이터를 max와 비교
            if(arrayInt[i]>max){ //max값과 비교.
//                max에 배열에 저장된 값을 저장
                max=arrayInt[i]; //결국 가장 큰 값이 max에 들어감.
            }
        }
        System.out.println("가장 큰 수는 "+max+"입니다.");


        System.out.println("\n-----for~each-----\n");



        System.out.println("\n-----기존 for문 사용한 배열의 데이터 출력-----\n");

        int arrNum1[] = {10,20,30,40,50};
        int total1=0;

        for(int i=0; i<arrNum1.length; i++){ //반복 조건을 사용자가 지정.
            System.out.println("arrNum1["+i+"]: "+arrNum1[i]);
//            total1+=arrNum1[i];
//            System.out.println("total1: "+total1);

            for(i=0; i<arrNum1.length; i++){
                total1=total1+arrNum1[i];
                System.out.println("total : "+total1);
            }
        }
        System.out.println("\n-----for~each 사용한 배열의 데이터 출력-----\n");
            int arrNum2[]={10,20,30,40,50};
            int total2=0;

            for(int num: arrNum2){  //반복 가능한 객체의 크기만큼 반복동작(arrNum2의 크기만큼) 무조건 처음부터 끝까지 동작
                System.out.println("num: "+num);
            }
        for(int num : arrNum2){
            total2 = total2+num;
            System.out.println("total2 : "+total2);
        }
//        p.109 for each문 활용
        int [] n ={1,2,3,4,5};
        int sum=0;
        for(int k :n){
            System.out.println(k+"");
            sum+=k;
        }
        System.out.println("합은 "+sum);

        String f[]={"사과","배","바나나","체리","딸기","포도"};
        for (String s:f)
            System.out.println(s+"");



    }
}

