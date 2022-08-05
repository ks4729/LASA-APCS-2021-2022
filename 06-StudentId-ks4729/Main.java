class Main {
  public static void main(String[] args){
    StudentID ada = new StudentID();
    System.out.println(ada.toString());
    ada.setStudentFirstName("Ada");
    ada.setStudentLastName("Lovelace");
    ada.setStudentID(223344);
    System.out.println(ada.toString());
    
    StudentID buzz = new StudentID("Buzz", "Lightyear", 123456);
    System.out.println(buzz.toString());

    System.out.println("" + buzz.getStudentFirstName() + " " + buzz.getStudentLastName() + " ID = " + buzz.getStudentID() + " Password = " + buzz.getPassword());
  }
}