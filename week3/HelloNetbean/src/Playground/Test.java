/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Playground;

/**
 *
 * @author Pakkapon
 */
class Student{
   private float gpa;
   String name;
   public void setGpa(float cGpa){
       this.gpa = cGpa;
   }
   public float getGpa(){
       return this.gpa;
   }
   public String getName(){
       return this.name;
   }
   public void setName(String cName){
       this.name = cName;
   }
}
class Teacher{
    private String subjectId;
    public String subjectName;
    public void setSubjectId(String cSid){
        this.subjectId = cSid;
    }
    public String getSubjectId(){
        return this.subjectId;
    }
}
public class Test {
    public static void main(String[] args){
        Teacher a = new Teacher();
        Student b = new Student();
    }
}
