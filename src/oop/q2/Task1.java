package oop.q2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * This program processes two lists (list1 of integers and list2 of strings)
 * to create a third list (list3) following specific rules.
 * 
 * For each number n in list1:
 * 1. Iterates through each number in list1
 * 2. Calculates the index for list2 using the formula: list2Index = (n × 2) - 1
 * 3. Checks if the calculated index is within bounds of list2
 * 4. If valid, retrieves the string from list2 at that index and adds it to
 * list3
 * 
 * The program includes predefined values for list1 and list2 as shown in the
 * animation,
 * but can work with any values provided.
 * 
 * list1 contains the following integers: 4, 7, 5, 2, 5, 2, 9, 6, 2, 5, 6, 3, 5
 * list2 contains these strings: lbH, LyN, kNRM, dLl, kiiz, IVcxQ, 04M7, VAu,
 * T7WK, o1n, J58, otLm, jQ5, OgC, N8ghc, cTO, OzR, JFsS1
 * list3 is initially empty and gets populated during program execution.
 */

public class Task1 {
  /* Predefined list1 with integer values */
  List<Integer> list1 = new ArrayList<>(Arrays.asList(
      4, 7, 5, 2, 5, 2, 9, 6, 2, 5, 6, 3, 5));

  /* Predefined list2 with string values */
  List<String> list2 = new ArrayList<>(Arrays.asList(
      "lbH", "LyN", "kNRM", "dLl", "kiiz", "IVcxQ", "04M7", "VAu",
      "T7WK", "o1n", "J58", "otLm", "jQ5", "OgC", "N8ghc", "cTO", "OzR", "JFsS1"));

  /* List3 to store the results */
  List<String> list3 = new ArrayList<>();

  /**
   * This method processes the lists and fills list3 based on the rules already
   * defined:
   */
  public void processLists() {
    for (int i = 0; i < list1.size(); i++) {

      int list2Index = (list1.get(i) * 2) - 1;
      if (list2Index >= 0 && list2Index < list2.size()) {
        list3.add(list2.get(list2Index));
      }
    }
  }
}
