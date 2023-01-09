package member.model.dao;

import member.model.dto.Member;

import java.util.Objects;
import java.util.Scanner;

public class MemberManager {
    public static final int SIZE = 10;
    Scanner scanner = new Scanner(System.in);

    public static int current = 0;
    Member[] members = new Member[SIZE];






    public void memberInput() {
        if(current < SIZE){
            members[current] = new Member();
            System.out.print("id : ");
            members[current].setId(scanner.next());
            System.out.print("name : ");
            members[current].setName(scanner.next());
            System.out.print("password : ");
            members[current].setPassword(scanner.next());
            System.out.print("emil : ");
            members[current].setEmail(scanner.next());
            System.out.print("age : ");
            members[current].setAge(scanner.nextInt());
            current++;
        }
    }

    public void searchMenu() {
        do {
            System.out.println("***** 회원 정보 검색 메뉴 *****\n" +
                    "\t\n" +
                    "\t1. 아이디로 검색\n" +
                    "\t2. 이름으로 검색\n" +
                    "\t3. 이메일로 검색\n" +
                    "\t9. 이전 메뉴로 가기\n" +
                    "\t메뉴 선택 :");
            System.out.print("메뉴 선택 :");
            int input = scanner.nextInt();

            switch (input){
                case 1:{
                    System.out.println(searchMemberId());
                    break;
                }
                case 2:{
                    System.out.println(searchMemberName());
                    break;
                }
                case 3:{
                    System.out.println(searchMemberEmail());
                    break;
                }
                case 9:return;
                default:
            }
        }while (true);
    }

    private int searchMemberEmail() {
        System.out.println("검색할 이메일 : ");
        String id = scanner.next();
        for(int i = 0; i < current; i++){
            if (Objects.equals(members[i].getId(), id)){
                return i;
            }
        }
        return -1;
    }

    private int searchMemberName() {
        System.out.println("검색할 이름 : ");
        String id = scanner.next();
        for(int i = 0; i < current; i++){
            if (Objects.equals(members[i].getId(), id)){
                return i;
            }
        }
        return -1;
    }

    public int searchMemberId() {
        System.out.println("검색할 아이디 : ");
        String id = scanner.next();
        for(int i = 0; i < current; i++){
            if (Objects.equals(members[i].getId(), id)){
                return i;
            }
        }
        return -1;
    }

    public void printAllMember() {
        for(int i = 0 ; i < current; i++){
            System.out.println(members[i]);
        }
    }


}
