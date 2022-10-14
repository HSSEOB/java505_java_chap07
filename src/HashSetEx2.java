import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx2 {
    public static void main(String[] args) {
//        문제 1) HashSet 이용하여 로또 번호 7개 생성하는 프로그램 작성하라.

//
//        Set<Integer> lotto = new HashSet<>();
//        int size = lotto.size();
//
//        while (true){
//            lotto.add((int)(Math.random()*45+1));
//            if(size==7){
//                break;
//            }
//        }
//
//
//
//        Iterator<Integer> iterator = lotto.iterator();
//        String number = "";
//        while (iterator.hasNext()){
//            int num = iterator.next();
//            number += String.valueOf(num)+"";
//
//        }System.out.println("\t"+ number);

        System.out.println("\n--------------------\n");

        Set<Member> set = new HashSet<>();

        set.add(new Member("홍길동", 30));
        set.add(new Member("홍길동", 30));

        System.out.println("총 객체 수 : " + set.size());
    }


    }

