package member.view;

import member.model.dao.MemberManager;
import member.model.dto.Member;

import java.util.Scanner;

public class MemberMenu {

    Scanner scanner = new Scanner(System.in);
    MemberManager memberManager = new MemberManager();

    public MemberMenu() {
    }

    public void mainMenu(){







        do {
            System.out.println("***** 회원 관리 프로그램 *****\n" +
                    "\n" +
                    "\t1. 새 회원 등록\t\t객체배열사용\n" +
                    "\t2. 회원 조회\t\tequals 사용\n" +
                    "\t3. 회원 정보 수정\tsetter사용\n" +
                    "\t4. 회원 정보 정렬\tcompareto 사용\n" +
                    "\t5. 회원 삭제\t\t\n" +
                    "\t6. 모두 출력\n" +
                    "\t9. 끝내기");
            System.out.print("메뉴 선택 :");
            int input = scanner.nextInt();

            switch (input){
                case 1:{
                    memberManager.memberInput();
                    break;
                }
                case 2:{
                    memberManager.searchMenu();
                    break;
                }
                case 3:{
                    break;
                }
                case 4:{
                    break;
                }
                case 5:{
                    break;
                }
                case 6:{
                    memberManager.printAllMember();
                    break;
                }
                case 9:return;
                default:
            }
        }while (true);

    }
    public void searchMenu() {}
    public void sortMenu() {}
    public void modifyMenu() {}

}
