package edu.cnm.deepdive;

public class ForEachLoop {

  public static void main(String[] args) {
    String[] names = {"Jimmy", "John", "Tom", "Anthony"};

    for (int i = 0; i < names.length; i++) {
      System.out.println("name = " + names[i]);
    }

    for (String name : names) {
      System.out.println("name = " + name);
    }

    StringBuilder[] builders = {
        new StringBuilder("for"),
        new StringBuilder("loop")
    };

    for (StringBuilder builder : builders) {
      System.out.println(builder); //prints "for" and below "loop"
    }

    for (StringBuilder builder : builders) {
      builder.append("123");//you can call methods on the elements in the for each loop.
      System.out.println(builder);//prints "for123" and "loop123"
    }

    String pets = "Parrot";
//    for (String pet : pets) {// trick on the exam: this will not compile because pets is a String
//    and not a String[].
//    }

    for (char c : pets.toCharArray()) {
      System.out.println("char = " + c);
    }
  }
}
