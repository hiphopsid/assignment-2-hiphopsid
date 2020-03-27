/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:13 PM
 */
package problem3.main;
// executable class
// use problem5.student.Student class to create object of student
public class MyMain 
{
    public static void main(String[] args) {
        MyPriorityQueue obj = new MyPriorityQueue();
        obj.insert("Siddhant",1);
        obj.insert("Snehal",4);
        obj.insert("Pradhuman",3);
        obj.insert("Prashant",2);
        obj.insert("Aishwarya",5);
        obj.display();
    }
