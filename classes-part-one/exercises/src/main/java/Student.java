public class Student {
        private int studentId;
        private int numberOfCredits = 0;
        private double gpa = 0.0;

        public Student(String name,int studentId){
                this.name=name;
                this.studentId=studentId;
                this.numberOfCredits=0;
                this.gpa=0.0;
        }

        private String name;

        public String getName() {
                return name;
        }

        public void setName(String name) {

                this.name = name;
        }

        public int getStudentId() {
                return studentId;
        }

        public void setStudentId(int studentId) {
                this.studentId = studentId;
        }

        public int getNumberOfCredits() {
                return numberOfCredits;
        }

        public void setNumberOfCredits(int numberOfCredits) {
                this.numberOfCredits = numberOfCredits;
        }

        public double getGpa() {
                return gpa;
        }

        public void setGpa(double gpa) {
                this.gpa = gpa;
        }


        // Drop your getters and setters below for the Student class.
        // To instantiate the Student class, add your code to the main in the file, SchoolPractice.

}
