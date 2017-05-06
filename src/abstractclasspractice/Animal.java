
package abstractclasspractice;


public abstract class Animal {
    protected int age;                      //Instance variable can be defined in abstarct class.
    
    public void eat(){                        //Instance methods can also be defined in an abstract class.
        System.out.println("Animal is Eating");
    }
    public abstract String getName();       //abstract method should be defined in Abstract class.
    
    abstract String setName();               //default abstract Method.
    //public abstract final void chew();     //Abstract methods can never be Final. (othervise they cant be extended in child).
    //private abstract void chew();         //Abstract methods cant be Private.
    
    protected abstract void sing();
}
