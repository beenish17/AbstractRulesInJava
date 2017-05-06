
package abstractclasspractice;

public class Swan extends Animal {
    //we cant instatiate an Abstract class.
    //Swan is first subclass of Animal so it should implement all abstract methods of parent class.
    
    public String getName() {
        return "I am Swan Class.";
    }
    //public abstract swim();   //It cant be defined in Non-Abstract class as it is Abstract Method.
    //public abstract swim(){}  //It will give compile time error as it abstract methods dont have implementation.
   
    String setName(){
        return "Default implementation of default Abstract Method";
    }
     protected void sing(){
         System.out.println("the access of child class should be same or more then the parent Class.");
    }
//  private void sing(){
//         System.out.println("This will give Compile time error.as the child access is limited then Parent access.");
//  }
}
