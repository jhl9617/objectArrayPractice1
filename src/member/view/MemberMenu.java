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
            System.out.println("***** ȸ�� ���� ���α׷� *****\n" +
                    "\n" +
                    "\t1. �� ȸ�� ���\t\t��ü�迭���\n" +
                    "\t2. ȸ�� ��ȸ\t\tequals ���\n" +
                    "\t3. ȸ�� ���� ����\tsetter���\n" +
                    "\t4. ȸ�� ���� ����\tcompareto ���\n" +
                    "\t5. ȸ�� ����\t\t\n" +
                    "\t6. ��� ���\n" +
                    "\t9. ������");
            System.out.print("�޴� ���� :");
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
        System.out.print("***** ȸ�� ���� ���� ��� �޴� *****\n" +
                "\t\n" +
                "\t1. ���̵� �������� ���� ���\n" +
                "\t2. ���̵� �������� ���� ���\n" +
                "\t3. ���� �������� ���� ���\n" +
                "\t4. ���� �������� ���� ���\n" +
                "\t5. ���� �������� ���� ���(������)\n" +
                "\t9. ���� �޴��� ����\n" +
                "\t�޴� ���� : ");
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
            System.out.print("***** ȸ�� ���� ���� �޴� *****\n" +
                    "\n" +
                    "\t1. ��ȣ ����\n" +
                    "\t2. �̸��� ����\n" +
                    "\t3. ���� ����\n" +
                    "\t9. ���� �޴��� ����\n" +
                    "\t�޴� ���� : ");

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
