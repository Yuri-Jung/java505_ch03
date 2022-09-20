public class Array2 {
    public static void main(String[] args) {
        System.out.println("\n-----다차원배열----\n");

//        1차원 배열 : 기본 배열, 배열의 요소로 데이터를 가지는 배열
//        2차원 배열 : 배열의 요소로 1차원 배열을 가지는 배열
//        3차원 배열 : 배열의 요소로 2차원 배열을 가지는 배열

//        1차원 배열 선언
        int arr1[]={1,2,3,4,5}; //5개 데이터를 가지는 배열
//        2차원 배열선언
        int arr2[][]={  //앞에는 줄, 뒤에는 칸
                {1,2,3},
                {4,5,6}
        };
//        3차원 배열 선언
        int arr3[][][]={{{1,2,3},{4,5,6}},{{7,8,9},{10,11,12}}};

        System.out.println("\n-----다차원배열----\n");
//        2차원 배열 - 줄이 먼저, 칸이 나중. 줄 안에 칸이 존재하는 형태
//        2차원 배열에서 항상 라인번호가 먼저, 칸 버전은 나둥
//        라인 안에 칸이 있는 형태로 구성되어 있음.
//        2차원 배열에서 크기를 확인하기 위한 속성인 length를 사용 시
//        배열명.length를 하면 해당 배열의 라인 수를 출력한다.
//        numArr.length=>4(줄) // numArr[0].length=>4 0번째 줄에 몇 개가 들어있는가.
        int numArr[][]={
                {1,2,3,4,5},
                {6,7,8,9,10},
                {11,12,13,14,15},
                {16,17,18,19,20},
                {21,22,23,24,25}
        };

        System.out.println("numArr[4][1] : "+numArr[4][1]); //22
        System.out.println("numArr[1][4] : "+numArr[1][4]); //10

        System.out.println(numArr[2]);//[I@6bf256fa => 2번 배열 주소
        int test[]=numArr[2];
//        2차원 배열의 요소가 1차원의 배열이므로 새로운 1차원 배열 형식의 변수에
//        2차원 배열의 요소를 대입하면 1차원 배열을 얻을 수 있다.
        System.out.println(test[0]+" "+test[1]+" "+test[2]+" "+test[3]+" "+test[4]+"");

//        반복문을 사용하여 2차원 데이터를 출력하려면 2중 반복문을 사용해야 함.
//        1번
        for (int i=0; i<5; i++){ //열
//            System.out.println(numArr[i]); //이러면 주소가 5개 나옴.
            for(int j=0; j<5; j++){  //칸
                System.out.print(numArr[i][j]+" ");
            }
        }
        System.out.println();

//        2번
        for (int item[] : numArr){
            for (int i : item){
                System.out.print(i+" ");
            }
        }
        System.out.println();

//        3번
        for(int item[]:numArr){
            for (int i=0; i<item.length; i++){
                System.out.print(item[i]+ " ");
            }
        }
        System.out.println();

//        4번 (" "):공백기호
        for (int i=0; i<numArr.length; i++){
            for(int item:numArr[i]){
                System.out.print(item+" ");
            }
        }

        int numArr2[][]={
                {1,2,3},
                {4,5,6,7},
                {8,9,10,11,12},
                {13,14}
        };
        System.out.println();
        System.out.println(numArr2[3][1]); //14
        System.out.println(numArr2[2][4]); //12

        for (int i=0; i<numArr2.length; i++){
            for(int j=0; j< numArr2[i].length; j++){
                System.out.println(numArr2[i][j]+" ");
            }
        }

        for(int items[]: numArr2){
            for(int item:items){
                System.out.println(item+" ");
            }
        }
    }
}
