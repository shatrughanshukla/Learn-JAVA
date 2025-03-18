package JAVA;
class A{
    public A()
    {
        super();  // // Calling the constructor of the super class
        System.out.println("in A");
    }
    public A(int i)
    {
        super();
        System.out.println("in A int");
    }
}
class B extends A
{
    public B()
    {
        super();
        System.out.println("in B");
    }
    public B(int i)
    {
        this();  // // This will execute the constructor of the same class.
        System.out.println("in B int");
    }
}
public class L16_0ThisnSUPERMethod {
    public static void main(String[] args) {
        
        B obj = new B(4);
    }
}
/*super is always present n constructors whether u mention it or not, for e.g. in constructor public B(int i) when accessing it
 * the first thing it sees is super whic takes it to the super class constructor(which one, default one as no parameter is given),
 *  when super(i)(i is a parameter)a parameteris given then it takes it to the super class peremeteric constructor. 
*/

/////EVERY CLASS IN JAVA EXTENDS OBJECT CLASS EVEN IF YOU DON'T MENTION IT