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
