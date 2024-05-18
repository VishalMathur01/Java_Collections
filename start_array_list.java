import java.util.ArrayList;

public class start_array_list {
 public static void problem_with_the_array(){
    String []student_name = new String[30];
    student_name[0] = "Raju";
    //all students in between 
    student_name[29] = "Ramesh";
    //now, we cannot add 
    student_name[30] = "Rahul";
    //Since, we cannot dynamically increase the size of the array
    // which is not a scalabel solution which is provided to us by the "ArrayList"


 }   
 public static void main(String[] args){
    ArrayList<String> student_names = new ArrayList<>();
    student_names.add("Rajeev");
    student_names.add("Aditya");
    student_names.add(0, "Suyash");
    ArrayList<String> names = new ArrayList<>();
    names.add("India");
    names.add("China");
    names.add("Japan");
    names.set(2, "Singapore");
    names.addAll(student_names);

    // Methods for the iterations of the elements in the list
    // 1
    for(int i = 0; i < names.size(); i++) System.out.println("names: "+ names.get(i));
    // 2
    for(String i: names) System.out.println("elements: " + i);
    // 3. apparently do not work so do not use it and it is also bad than the for each loop method which was discussed in 2.
    // Iterator<String> it = names.iterator();

    names.remove("China");
    System.out.println(student_names);
    System.out.println(names);
    System.out.println(names.contains("India"));
    System.out.println(names.get(0));
    names.clear();
    System.out.println(names);    
}
}
 