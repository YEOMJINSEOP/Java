public class ManageStudent{
  public static void main(String[] args) {
    ManageStudent sample = new ManageStudent();
    // Student[] student = sample.addStudent();
    // for(Student temp: student){
    //   System.out.println(temp);
    // }
    sample.checkEquals();
  }

  public Student[] addStudent(){
    Student[] student = new Student[3];
    student[0] = new Student("Lim");
    student[1] = new Student("Min");
    student[2] = new Student("Sook", "Seoul", "010XXXXYYYY", "ask@godofjava.com");
    return student;
  }


  public void checkEquals(){
    Student a = new Student("Min", "Seoul", "01012345678", "abc@gmail.com");
    Student b = new Student("Min", "Seoul", "01012345678", "abc@gmail.com");

    if(a.equals(b)){
      System.out.println("Equal");
    } else System.out.println("Not Equal");

  }
}