
package abstractclasspractice;

public class BigCat extends Eagle{
        //subclass have to implement all the abstaract methods of Parent classes.
     
    public void roar(){
         System.out.println("i am over ridden from Eagle method");
     }
      public String getName(){
          return "Animal- class";
      }
     String setName(){
         return "Animal class ";
     } 
      protected void sing(){
          System.out.println("Animal -Class");
      }
}
