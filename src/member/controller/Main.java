package member.controller;

import member.model.dao.MemberManager;
import member.view.MemberMenu;

public class Main {
    public static void main(String[] args) {
        MemberMenu memberMenu = new MemberMenu();
        memberMenu.mainMenu();

        System.out.println("ȸ������ ���α׷��� �����մϴ�.");
    }
}
