public class StudentID{
  String studentFirstName;
  String studentLastName;
  int studentID;

  //instantiator and constructor
  public StudentID(){
    studentFirstName = "First";
    studentLastName = "Last";
    studentID = 111111;
  }
  public StudentID(String f, String l, int i){
    studentFirstName = f;
    studentLastName = l;
    studentID = i;
  }
  //setters and getters
  public void setStudentLastName(String l){
    studentLastName = l;
  }
  public String getStudentLastName(){
    return studentLastName;
  }
  public void setStudentFirstName(String f){
    studentFirstName = f;
  }
  public String getStudentFirstName(){
    return studentFirstName;
  }
  public void setStudentID(int i){
    studentID = i;
  }
  public int getStudentID(){
    return studentID;
  }

  public String getPassword(){
    String password = "" + studentLastName.charAt(0) + studentID + studentLastName.charAt((studentLastName.length()-1));
    return password;
  }
  public String toString(){
    String info = "Name = " + studentFirstName + " " + studentLastName + " Student ID = " + studentID;
    return info;
  }
}