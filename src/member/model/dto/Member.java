package member.model.dto;

public class Member {

    private String id;
    private String name;
    private String password;
    private char gender;
    private int age;

    public Member() {
    }

    public Member(String id, String name, String password, char gender, int age) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.gender = gender;
        this.age = age;
    }

    public Member(String id, String name, String password, int age) {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public String memberInfo() {
        return "Member{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}
