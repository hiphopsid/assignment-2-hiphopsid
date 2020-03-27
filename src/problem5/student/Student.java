/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.student;
// to store student information and properties
public class Student 
{
      private int rollNumber;
    private String Name;
    private int BackLogCounter;
    private int appearingCounter;

    public Student(int rollNumber,String name)
    {
        this.rollNumber=rollNumber;
        Name=name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return Name;
    }
    

    public int getAppearingCounter() {
        return appearingCounter;
    }

    public void setAppearingCounter(int appearingCounter) {
        this.appearingCounter = appearingCounter;
    }

    public void setBackLogCounter(int backLogCounter) {
        BackLogCounter = backLogCounter;
    }
}
