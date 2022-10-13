import java.io.*;
import java.util.Scanner;

public class TryCatchEx {
    public static void main(String[] args) throws FileNotFoundException {

//        String data = null;
//        System.out.println(data.toString());//현재 오류나는 부분(NullPointerException)

        System.out.println("======NullPointerException========");
        try {
            String data = null;
            System.out.println(data.toString());
        } catch (Exception e) {
            System.out.println("null인 데이터에서는 toString() 메서드를 사용할 수 없습니다.");
        }

        System.out.println("=====ArrayIndexOutOfBoundsException=======");
        try {
            String data1 = args[10]; //오류발생. 바로 catch로 넘어감. 이렇게하면 프로그램이 멈추지 않는다.
            String data2 = args[20];

            System.out.println("args[10] : " + data1);
            System.out.println("args[20] : " + data2);
        } catch (Exception e) {
            System.out.println("배열의 최대 index 범위를 넘어서 사용하였습니다.");
        }

        System.out.println("=====다중 catch=======");
        try {
            String data1 = "100";
            String data2 = "a100";

            int value1 = Integer.parseInt(data1);
            int value2 = Integer.parseInt(data2);

            int result = value1 + value2;
            System.out.println(data1 + "+" + data2 + "=" + result);
        }
//        예외처리를 하나로 모두 처리하면 Exception을 사용.
//        지정한 예외 상황만 처리하고자 하면 해당 예외 클래스를 사용해야 함.

//        catch (NumberFormatException e){
//            System.out.println("정수로 변환할 수 없습니다.");
//        }
//        catch (NullPointerException e){ //오류난다.
//            System.out.println("정수로 변환할 수 없습니다.");
//        }
//        catch (Exception e){
//            System.out.println("정수로 변환할 수 없습니다.");
//        }

//        하나의 try 구문에서 여러 개의 지정된 예외처리를 하고자 한다면 catch를 여러 개 사용할 수 있다.
        catch (NullPointerException e) {
            System.out.println("null을 사용하여 진행할 수 없습니다.");
        } catch (NumberFormatException e) { //e는 Exception이 발생할 때 저장되는 데이터들을 넣어놨다.

            System.out.println("정수로 변환할 수 있습니다.");
            System.out.println(e.getMessage()); //For input string: "a100". 오류 왜났는지
            System.out.println(e.getStackTrace()); //[Ljava.lang.StackTraceElement;@1e643faf //주소
//            e.printStackTrace();// 에러와 관련된 정보를 전부 보여줌.
        }
//        Exception 클래스는 모든 예외 클래스의 최상위 클래스이므로 여러 개의 catch문을 사용할 경우
//        가장 마지막에 입력해야 한다.
        catch (Exception e) { //위에 있으면 Exception을 제외한 catch들을 오류로 표시.
            System.out.println("알 수 없는 오류가 발생했습니다.");
        }

//        finally : try ~ catch 구문에서 예외가 발생하던 발생하지 않던 무조건 실행되어야 하는 소스코드를 입력하는
//        부분을 finally라고 한다. 주로 외부 리소스(파일, 네트워크 연결) 사용 시 해당 리소스를 해제하기 위한 목적으로 많이 사용함
//        자바의 가장 큰 특징 : 가비지 컬렉터 -> 비사용메모리 자동 정리. 파일, 네트워크 연결은 자동정리 안됨.
//        open만 하고 close를 안하면 계속 돌고 있다.

        System.out.println("\n======finally 사용하기 =======");
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("문자를 입력해주세요 : ");
            String data = scanner.nextLine();

            if (data.equals("")) {
                data = null;
            }

//            System.out.println(data.toString());
            System.out.println("입력된 내용 : " + data.toString());
            System.out.println("여기는 정상 실행 완료 후 실행되는 부분입니다");
        } catch (NullPointerException e) {
            System.out.println("여기는 예외 발생시 실행되는 부분입니다.");
            System.out.println("예외이유 : " + e.getMessage());
        } finally {
            System.out.println("여기는 무조건 실행되는 부분입니다.");
        }
        System.out.println("try ~ catch가 완료된 후 실행되는 부분입니다.");

        System.out.println("\n\n ");


        File file = new File("test.txt");
        String str = "java file write test";

        try { //file 생성 -> 왼측에 있다.
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            writer.write(str);
            writer.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("파일 쓰기 사용 시 오류가 발생했습니다.");
        }
        System.out.println("파일 쓰기 완료");

        System.out.println("\n==== 파일 읽기 시작====");
        FileReader fr = null;
        BufferedReader reader = null;


        try {
            fr = new FileReader("c:\\test.txt"); //실제 파일 읽어온다(파일객체)
            reader = new BufferedReader(fr); // 실제 안의 내용 읽어옴

            String tmp;

            while ((tmp = reader.readLine()) != null){
                System.out.println("파일 내용 >> " + tmp); //안에 내용있다면 tmp에 저장
            }
        }
        catch (IOException e){
            System.out.println("파일 사용시 오류가 발생했습니다.");
            System.out.println(e.getMessage());
        }
        finally {
            try{
                if(reader != null) reader.close(); //닫는 순서 중요! 리더 -> 파일
                if(fr != null) reader.close();
            }
            catch (Exception e){

            }
        }
        System.out.println("=====파일 읽기 완료=======");
    }
}
