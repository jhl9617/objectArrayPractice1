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
            System.out.println("***** ȸ�� ���� �˻� �޴� *****\n" +
                    "\t\n" +
                    "\t1. ���̵�� �˻�\n" +
                    "\t2. �̸����� �˻�\n" +
                    "\t3. �̸��Ϸ� �˻�\n" +
                    "\t9. ���� �޴��� ����\n" +
                    "\t�޴� ���� :");
            System.out.print("�޴� ���� :");
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
        System.out.println("�˻��� �̸��� : ");
        String id = scanner.next();
        for (int i = 0; i < current; i++) {
            if (Objects.equals(members[i].getId(), id)) {
                return i;
            }
        }
        return -1;
    }

    private int searchMemberName() {
        System.out.println("�˻��� �̸� : ");
        String id = scanner.next();
        for (int i = 0; i < current; i++) {
            if (Objects.equals(members[i].getId(), id)) {
                return i;
            }
        }
        return -1;
    }

    public int searchMemberId() {
        System.out.println("�˻��� ���̵� : ");
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
        System.out.print("������ ���̵� �Է� : ");
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
        System.out.println("�� ��й�ȣ : ");
        members[index].setPassword(scanner.next());
        System.out.println("��й�ȣ�� ���� �Ǿ����ϴ�.");
    }
    public void setEmail(int index) {
        System.out.println("�� �̸��� : ");
        members[index].setEmail(scanner.next());
        System.out.println("�̸����� ���� �Ǿ����ϴ�.");
    }
    public void setAge(int index) {
        System.out.println("�� ���� : ");
        members[index].setPassword(scanner.next());
        System.out.println("���̰� ���� �Ǿ����ϴ�.");
    }



}
