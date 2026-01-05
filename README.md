# Introduction to Arrays in Java

Welcome to your first Java program working with arrays! This program is designed to help you understand how arrays work and how to manipulate them. By the end of this exercise, you will have learned how to modify an array, navigate through its elements, and implement functionality using an `ActionListener`.

## How the Program Works

This program uses an array to store a list of items (e.g., names, numbers, or other data). You will be able to navigate through the array using buttons and display the current item. The program is structured to help you practice key concepts in Java, such as:

- Declaring and initializing arrays
- Accessing elements in an array
- Using event listeners to handle user interactions

## TO DOs

Below are the tasks you need to complete. Follow the instructions carefully and test your program after each step.

### 1. Modify the Array
- Locate the array in the program (e.g., `String[] items = {"Item1", "Item2", "Item3"};`).
- Add or change the elements in the array to create your own list. For example, you could use a list of goals for 2026, things you did over break, etc.

### 2. Add a "Back" Button
- Add a new button labeled "Back" to the program's user interface.
- This button will allow the user to navigate to the previous item in the array.

### 3. Connect an ActionListener
- Write an `ActionListener` for the "Back" button.
- In the `ActionListener`, use a helper function to determine the previous index in the array and display the corresponding item.

### 4. Create the `getPreviousIndex` Function
- Write a helper function called `getPreviousIndex` that calculates the previous index in the array.
- Make sure the function handles edge cases, such as when the user is at the first item in the array (it should loop back to the last item).

### 5. Test Your Program
- Run your program and test the "Back" button to ensure it works as expected.
- Verify that the program correctly displays the previous item in the array.

## Optional Challenges

If you finish the main tasks, try these optional challenges to deepen your understanding:

1. **Add a "Random" Button**  
   - Create a button that displays a random item from the array when clicked.

2. **Enhance the User Interface**  
   - Use additional Java Swing components (e.g., labels, text fields) to make the program more interactive and visually appealing.

3. **Dynamic Array Modification**  
   - Allow the user to add or remove items from the array at runtime using input fields and buttons.

4. **Wrap Navigation**  
   - Modify the navigation so that when the user reaches the end of the array and clicks "Next," it wraps back to the first item (and vice versa for the "Back" button).

5. **Display Array Length**  
   - Show the total number of items in the array and the current item's position (e.g., "Item 2 of 5").

## Tips for Success

- Use comments in your code to explain what each part does.
- Test your program frequently to catch and fix errors early.
- Ask questions if you're unsure about any part of the assignment.

Good luck, and have fun learning about arrays!
