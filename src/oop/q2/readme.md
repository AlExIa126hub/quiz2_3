# Quiz #2 - Description and functionalities of the program

## Description

This program processes two lists (`list1` of integers and `list2` of strings) to generate a third list (`list3`) based on specific rules. The solution consists of two Java files:

1. `Task1.java` - Contains the main logic
2. `q2Tester.java` - Tests the functionality

## Files

### Task1.java

The core class that performs the list processing.
The program processes two lists (list1 of integers and list2 of strings) to create a third list (list3) following specific rules.

For each number n in list1:

1. Iterates through each number in list1
2. Calculates the index for list2 using the formula: list2Index = (n × 2) - 1
3. Checks if the calculated index is within bounds of list2
4. If valid, retrieves the string from list2 at that index and adds it to
   list3

**Lists:**

- `list1`: Predefined integers [4, 7, 5, 2, 5, 2, 9, 6, 2, 5, 6, 3, 5]
- `list2`: Predefined strings ["lbH", "LyN", "kNRM", ..., "JFsS1"]
- `list3`: Result list (initially empty)

### q2Tester.java

Shows an example of workflow with the program designed in the Task1 file.

- Creates a Task1 object
- Runs the list processing
- Shows the final list3 result
