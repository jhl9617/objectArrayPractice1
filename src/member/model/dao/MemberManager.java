package member.model.dao;

import member.model.dto.Member;

import java.util.Objects;
import java.util.Scanner;

public class MemberManager {
    public static final int SIZE = 10;
    private Scanner scanner = new Scanner(System.in);

    public static int current = 0;
    private Member[] members = new Member[SIZE];


    public void memberInput() {
        if (current < SIZE) {
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
            System.out.print("gender : ");
            members[current].setGender(scanner.next().charAt(0));
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

            switch (input) {
                case 1: {
                    System.out.println(searchMemberId());
                    break;
                }
                case 2: {
                    System.out.println(searchMemberName());
                    break;
                }
                case 3: {
                    System.out.println(searchMemberEmail());
                    break;
                }
                case 9:
                    return;
                default:
            }
        } while (true);
    }

    private int searchMemberEmail() {
        System.out.println("검색할 이메일 : ");
        String id = scanner.next();
        for (int i = 0; i < current; i++) {
            if (Objects.equals(members[i].getId(), id)) {
                return i;
            }
        }
        return -1;
    }

    private int searchMemberName() {
        System.out.println("검색할 이름 : ");
        String id = scanner.next();
        for (int i = 0; i < current; i++) {
            if (Objects.equals(members[i].getId(), id)) {
                return i;
            }
        }
        return -1;
    }

    public int searchMemberId() {
        System.out.println("검색할 아이디 : ");
        String id = scanner.next();
        for (int i = 0; i < current; i++) {
            if (Objects.equals(members[i].getId(), id)) {
                return i;
            }
        }
        return -1;
    }

    public void printAllMember() {
        for (int i = 0; i < current; i++) {
            System.out.println(members[i]);
        }
    }

    public void sortIDAsc() {
        for (int i = 0; i < current; i++) {
            for (int j = i; i < current; i++) {
                if (members[i].getId().compareTo(members[j].getId()) == 0) {
                    Member tmp = members[i];
                    members[i] = members[j];
                    members[j] = tmp;
                }
            }
        }

    }

    public void sortIDDes() {
        for (int i = 0; i < current; i++) {
            for (int j = i; i < current; i++) {
                if (members[i].getId().compareTo(members[j].getId()) == 1) {
                    Member tmp = members[i];
                    members[i] = members[j];
                    members[j] = tmp;
                }
            }
        }
    }

    public void sortAgeAsc() {
        for (int i = 0; i < current; i++) {
            for (int j = i; i < current; i++) {
                if (members[i].getAge() > members[j].getAge()) {
                    Member tmp = members[i];
                    members[i] = members[j];
                    members[j] = tmp;
                }
            }
        }
    }

    public void sortAgeDes() {
        for (int i = 0; i < current; i++) {
            for (int j = i; i < current; i++) {
                if (members[i].getAge() < members[j].getAge()) {
                    Member tmp = members[i];
                    members[i] = members[j];
                    members[j] = tmp;
                }
            }
        }
    }

    public void sortGenderDes() {
        for (int i = 0; i < current; i++) {
            for (int j = i; i < current; i++) {
                if (members[i].getGender() < members[j].getGender()) {
                    Member tmp = members[i];
                    members[i] = members[j];
                    members[j] = tmp;
                }
            }
        }
    }

    public void deleteMember() {
        System.out.print("삭제할 아이디 입력 : ");
        String input = scanner.next();
        for (int i = 0; i < current; i++) {
            if (Objects.equals(input, members[i].getId())) {
                for (int j = i; j < current; j++) {
                    members[j] = members[j + 1];
                }
                members[current] = null;
                current--;
            }
        }

    }

    public void setPassword(int index) {
        System.out.println("새 비밀번호 : ");
        members[index].setPassword(scanner.next());
        System.out.println("비밀번호가 변경 되었습니다.");
    }
    public void setEmail(int index) {
        System.out.println("새 이메일 : ");
        members[index].setEmail(scanner.next());
        System.out.println("이메일이 변경 되었습니다.");
    }
    public void setAge(int index) {
        System.out.println("새 나이 : ");
        members[index].setPassword(scanner.next());
        System.out.println("나이가 변경 되었습니다.");
    }



}
