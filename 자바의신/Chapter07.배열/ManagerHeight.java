public class ManagerHeight {

  int[][] gradeHeights = new int[5][];

  public static void main(String[] args) {
    ManagerHeight array = new ManagerHeight();
    array.setData();
    for (int i = 1; i <= array.gradeHeights.length; i++) {
      // array.printHeight(i);
      array.printAverage(i);
    }
  }

  public void printHeight(int classNo) {
    classNo -= 1;
    int count = gradeHeights[classNo].length;
    System.out.println("Class No." + classNo);
    for (int i = 0; i < count; i++) {
      System.out.println(gradeHeights[classNo][i]);
    }
  }

  public void setData() {
    gradeHeights[0] = new int[5];
    gradeHeights[0][0] = 170;
    gradeHeights[0][1] = 180;
    gradeHeights[0][2] = 173;
    gradeHeights[0][3] = 175;
    gradeHeights[0][4] = 177;

    gradeHeights[1] = new int[4];
    gradeHeights[1][0] = 160;
    gradeHeights[1][1] = 165;
    gradeHeights[1][2] = 167;
    gradeHeights[1][3] = 186;

    gradeHeights[2] = new int[4];
    gradeHeights[2][0] = 158;
    gradeHeights[2][1] = 177;
    gradeHeights[2][2] = 187;
    gradeHeights[2][3] = 176;

    gradeHeights[3] = new int[3];
    gradeHeights[3][0] = 173;
    gradeHeights[3][1] = 182;
    gradeHeights[3][2] = 181;

    gradeHeights[4] = new int[5];
    gradeHeights[4][0] = 170;
    gradeHeights[4][1] = 180;
    gradeHeights[4][2] = 165;
    gradeHeights[4][3] = 177;
    gradeHeights[4][4] = 172;
  }

  public void printAverage(int classNo) {
    classNo -= 1;
    double sum = 0;
    double average = 0;
    int count = gradeHeights[classNo].length;

    for (int i = 0; i < count; i++) {
      sum += gradeHeights[classNo][i];
    }

    average = sum / count;
    System.out.println("Class No." + classNo + " `s average : " + average);
  }
}
