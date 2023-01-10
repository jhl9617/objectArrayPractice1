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
                    if(MemberManager.current > 0 )
                        memberManager.searchMenu();
                    break;
                }
                case 3:{
                    modifyMenu();
                    break;
                }
                case 4:{
                    if(MemberManager.current > 0 )
                        sortMenu();
                    break;
                }
                case 5:{
                    memberManager.deleteMember();
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
    public void searchMenu() {

    }
    public void sortMenu() {
        System.out.print("***** 회원 정보 정렬 출력 메뉴 *****\n" +
                "\t\n" +
                "\t1. 아이디 오름차순 정렬 출력\n" +
                "\t2. 아이디 내림차순 정렬 출력\n" +
                "\t3. 나이 오름차순 정렬 출력\n" +
                "\t4. 나이 내림차순 정렬 출력\n" +
                "\t5. 성별 내림차순 정렬 출력(남여순)\n" +
                "\t9. 이전 메뉴로 가기\n" +
                "\t메뉴 선택 : ");
        int inp = scanner.nextInt();
        switch (inp) {
            case 1:
                memberManager.sortIDAsc();
                break;
            case 2:
                memberManager.sortIDDes();
                break;
            case 3:
                memberManager.sortAgeAsc();
                break;
            case 4:
                memberManager.sortAgeDes();
                break;
            case 5:
                memberManager.sortGenderDes();
                break;
            case 9:
                return;
            default:

        }

    }
    public void modifyMenu() {

        do {
            int index = -1;
            System.out.print("***** 회원 정보 수정 메뉴 *****\n" +
                    "\n" +
                    "\t1. 암호 변경\n" +
                    "\t2. 이메일 변경\n" +
                    "\t3. 나이 변경\n" +
                    "\t9. 이전 메뉴로 가기\n" +
                    "\t메뉴 선택 : ");

            int input = scanner.nextInt();
            switch (input){
                case 1:
                    index = memberManager.searchMemberId();
                    if(index != -1){
                        memberManager.setPassword(index);
                    }
                    break;
                case 2:
                    index = memberManager.searchMemberId();
                    if(index != -1){
                        memberManager.setPassword(index);
                    }
                    break;
                case 3:
                    index = memberManager.searchMemberId();
                    if(index != -1){
                        memberManager.setPassword(index);
                    }
                    break;
                case 9:
                    return;
                default:
            }
        }while(true);


    }

}
