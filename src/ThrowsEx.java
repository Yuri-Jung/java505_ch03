public class ThrowsEx {
    public static void main(String[] args) {
        Calculator cal = new Calculator();


        try {
            cal.sum("십", "20"); //sum은 calculator에 오류처리부분이있다.
            cal.sub("10A", "20"); //실제 오류 발생한 부분은 calculator 클래스인데,
//            throw로 넘겼기 때문에 여기서 오류표시뜸. 이쪽에 정리하면 보기 편하다.
//            또한 예외처리를 따로 담당해주는 클래스를 만들 수 있다.
//            throw는 사용하는 곳에서 예외처리하게 만듦.
        }
        catch (Exception e){
            System.out.println("실행 시 오류가 발생했습니다.");
        }
    }
}
