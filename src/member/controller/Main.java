package member.controller;

import member.model.dao.MemberManager;
import member.view.MemberMenu;

public class Main {
    public static void main(String[] args) {
        MemberMenu memberMenu = new MemberMenu();
        memberMenu.mainMenu();

        System.out.println("회원관리 프로그램을 종료합니다.");
    }
}
