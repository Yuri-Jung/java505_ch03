public class ExceptionEx {
//    NullPointerException
    public static void main(String[] args) {
//        String data = null;
//        System.out.println(data.toString()); //여기서는 말짱하지만 오류발생됨


//        ArrayIndexOutOfBoundsException

//        String data1 = args[0]; //인덱스값 없어서 나는 오류.
//        String data2 = args[1];
//        String data3 = args[2];
//
//        System.out.println("args[0] : " + data1);
//        System.out.println("args[1] : " + data2);
//        System.out.println("args[2] : " + data3);

        String data1 = "100";
        String data2 = "a100"; //a 때문에 정수형 변형 불가.

        int value1 = Integer.parseInt(data1); // 문자형을 정수형으로 바꿔줌
        int value2 = Integer.parseInt(data2);

        int result = value1 + value2;
        System.out.println(data1 + "+" + data2 + "=" + result);
    }
}
