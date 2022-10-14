import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashTableEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String , String> map = new Hashtable<>();

        map.put ("spring", "12");
        map.put ("summer", "123");
        map.put ("fail", "1234");
        map.put ("winter", "1245");

        while(true){
            System.out.println("아이디와 비밀번호를 입력하라 : ");
            System.out.println("아이디 : ");
            String id = sc.nextLine();

            System.out.println("비밀번호 : ");
            String password = sc.nextLine();
            System.out.println();

            if(map.containsKey(id)){
                if(map.get(id).equals(password)){
                    System.out.println("로그인 되었다");
                    break;
                }
                else {
                    System.out.println("비밀번호가 틀렸다.");
                }
            }else {
                System.out.println("아이디가 틀렸다");
            }
        }
    }
}
