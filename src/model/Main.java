package model;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();

        student.setName("xxx");
        student.setNo("20152480245");
        student.setSex("男");

        System.out.println(student.getName());
        System.out.println(student.getNo());
        System.out.println(student.getSex());
    }
}
