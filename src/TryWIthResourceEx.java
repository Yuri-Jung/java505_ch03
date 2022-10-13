public class TryWIthResourceEx {
    public static void main(String[] args) {
//        이 방식으로만 해야 한다.
//        자동으로 메모리 해제
//        try with resources
        try (FileInputStream fis = new FileInputStream("file.txt")){
            fis.read();
            throw new Exception();  //예외 강제 발생
//            throw : 예외 자체를 사용자가 인위적으로만듦
        }
        catch (Exception e){
            System.out.println("예외처리 코드가 실행되었습니다.");
        }


//        FileInputStream fis = new FileInputStream("testfile.txt");
//        fis.read();
//        fis.close();



        //선생님 지우신 부분..
//        FileInputStream fis = null;
//        try{
//            fis = new FileInputStream("filename.txt");
//            fis.read();
//            throw new Exception();
//        }
//        catch (Exception e) {
//            System.out.println("예외 발생시 동작하는 부분");
//        }

    }
}
