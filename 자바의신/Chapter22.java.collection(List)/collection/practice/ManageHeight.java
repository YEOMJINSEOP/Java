package d.collection.practice;

import java.util.ArrayList;

public class ManageHeight {
  public static void main(String[] args) {
    ManageHeight sample = new ManageHeight();
    sample.setData();
  }

  ArrayList<ArrayList<Integer>> classArray = new ArrayList<ArrayList<Integer>>();

  public void setData() {
    ArrayList<Integer> heightArray1 = new ArrayList<Integer>();
    heightArray1.add(170);
    heightArray1.add(180);
    heightArray1.add(173);
    heightArray1.add(175);
    heightArray1.add(177);

    ArrayList<Integer> heightArray2 = new ArrayList<Integer>();
    heightArray2.add(160);
    heightArray2.add(165);
    heightArray2.add(167);
    heightArray2.add(186);

    ArrayList<Integer> heightArray3 = new ArrayList<Integer>();
    heightArray3.add(158);
    heightArray3.add(177);
    heightArray3.add(187);
    heightArray3.add(176);

    ArrayList<Integer> heightArray4 = new ArrayList<Integer>();
    heightArray4.add(173);
    heightArray4.add(182);
    heightArray4.add(181);

    ArrayList<Integer> heightArray5 = new ArrayList<Integer>();
    heightArray5.add(170);
    heightArray5.add(180);
    heightArray5.add(165);
    heightArray5.add(177);
    heightArray5.add(172);

    classArray.add(heightArray1);
    classArray.add(heightArray2);
    classArray.add(heightArray3);
    classArray.add(heightArray4);
    classArray.add(heightArray5);

    printHeight(1);
    printAverage(1);
  }

  public void printHeight(int classNo) {
    System.out.println("Class No. : " + (classNo));
    ArrayList<Integer> heightArray = classArray.get(classNo - 1);
    for (int heightLoop = 0; heightLoop < heightArray.size(); heightLoop++) {
      System.out.println(heightArray.get(heightLoop));
    }
  }

  public void printAverage(int classNo) {

    ArrayList<Integer> heightArray = classArray.get(classNo - 1);

    double sum = 0;

    for (int loop = 0; loop < heightArray.size(); loop++) {
      sum += (double) heightArray.get(loop);
    }

    double average = (sum / heightArray.size());
    System.out.println("Height average: " + average);
  }
}
