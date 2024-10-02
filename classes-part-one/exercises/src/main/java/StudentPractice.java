public class StudentPractice {
    public static void main(String[] args){
        //insantiate your Student class below
        Student student=new Student("hari",123);
        student.setNumberOfCredits(1);
        student.setGpa(4.0);
        System.out.println("student gpa :"+student.getGpa());
        System.out.println("number of credits :"+student.getNumberOfCredits());
        Teacher teacher=new Teacher("abil","danger","math",5);
        teacher.setSubject("science");
        System.out.println(teacher.getSubject());
    }
}
