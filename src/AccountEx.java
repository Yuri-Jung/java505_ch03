public class AccountEx {
    public static void main(String[] args) {
        Account account = new Account();

        account.deposit(10000);
        System.out.println("예금액 : " + account.getBalance());

        try{
            account.withdraw(30000);
        }
        catch (BalanceInsufficientException e){
            String message = e.getMessage(); //BalanceInsufficientException 에서 메세지 받아옴
            System.out.println(message); // 잔고 부족 : 20000원 모자람 이거 출력됨.
            System.out.println();
//            e.printStackTrace(); // 어디서 오류 났는지 정보 보여줌
//            e.getStackTrace();
        }
    }
}
