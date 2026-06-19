## Day 1 Exercise 01 - Code Explanation
What is the purpose of Course.java?
ANS: It represents a course with details like ID, title, duration, level, and credit hours. It also holds a reference to an Instructor and has a printSummary() method to display all course info.

What is the purpose of Instructor.java?
ANS: It represents an instructor with fields for ID, name, and expertise. It has getters and a printProfile() method to display the instructor's details.

What is the purpose of Student.java?
ANS: It's a placeholder for future student data like name, ID, enrolled courses.

What does the constructor do?
ANS: The constructor such as in Course.java is a special method that runs when you create a new Course object. It takes values as arguments and uses this.field = value to assign them to the object's fields. 

Why are the fields marked as private?
ANS: private means the field can only be accessed from inside its own class while outside code can't read or change it directly. This protects the data from accidental or unauthorized changes.

What does course1.assignInstructor(instructor1); mean?
ANS: This would call a method named assignInstructor on the course1 object, passing an Instructor object as the argument.

What does student1.printProfile(); do?
ANS: It would call the printProfile() method on a Student object, printing that student's details to the console.


AI-Assisted Task: Use the AI of your choice (ChatGPT, Gemini, Claude, Windsurf) and ask:
Explain this Java class to someone who already knows Python or C++.

Then write down:
One explanation from AI that helped you.
ANS: In Python you can just do course.title directly. In Java, private blocks that - so instead you use getTitle() to read and setTitle() to change it. It feels like extra work, but it gives you control over how the data is accessed or validated before it's changed.

One part you still needed the trainer or your own reading to understand.
ANS: why not all setter function didnt need to defined in the code ?