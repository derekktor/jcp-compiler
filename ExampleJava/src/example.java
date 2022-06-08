import utils.Student;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();

        int a = student.getAge();

        System.out.println(student.get_name());
    }

    private void print(int a) {
        System.out.println(a);
    }

    protected int getAge() {
        return 0;
    }
}
