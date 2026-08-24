public class Student {
    //put the student's information here
    int id;
    String name;
    int age;
    String course;
    double score;

    public Student(int id, String name, int age, String course, double score) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course;
        this.score = score;
    }

    public void displayStudent() {

        System.out.println("--------------------");
        System.out.println("ID: " + id);;
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
        System.out.println("Score: " + score);
        System.out.println("---------------------");

    }

    public String calculateGrade() {

        if (score >= 70) {
            return "A";
        } else if (score >= 60) {
            return "B";
        } else if (score >= 50) {
            return "C";
        } else if (score >= 45) {
            return "D";
        } else if (score >= 40) {
            return "E";
        } else {
            return "F";
        }
    }

}
