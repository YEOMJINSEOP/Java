public class ManageStudent {
  public static void main(String[] args) {
    Student student[] = null; // student라는 이름을 갖는 Student 배열을 만듦
    ManageStudent sample = new ManageStudent();
    // student = sample.addStudent();
    // sample.printStudent(student);
    sample.checkEquals();
  }

  public Student[] addStudent() {
    Student[] student = new Student[3]; // 만든 Student 배열에 3명의 Student를 넣을 수 있도록 배열을 초기화
    // int[] lottoNumbers = new int[7]
    student[0] = new Student("Lim");
    student[1] = new Student("Min");
    student[2] = new Student("Sook", "Seoul", "010XXXXXXXXX", "ask@godofjava.com");
    return student;
  }

  public void printStudent(Student[] student) {
    for (int count = 0; count < student.length; count++) {
      System.out.println(student[count]);
    }
  }

  public void checkEquals() {
    Student a = new Student("Min", "Seoul", "010xxxxxxxx", "ask@godofjava.com");
    Student b = new Student("Min", "Seoul", "010xxxxxxxx", "ask@godofjava.com");
    if (a.equals(b)) {
      System.out.println("Equal");
    } else {
      System.out.println("Not Equal");
    }
  }

}

// 자바에서는
// Student student[] 이거나
// Student[] student 이거나
// 똑같이 둘 다 허용되는거다. 똑같은 의미!!
