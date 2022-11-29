class Test {
 
 
    static int i;
   
    int j; //Instance variable

    void method1() {
        int k = 20; //local variable
        System.out.println(k);
    }
    
    //Anonymous block
    {
        j = 20;
        System.out.println("anonymous block called");
    }
  
    //Static block
    static
    {
        i = 10;
        System.out.println("static block called ");
    }
    // End of static block
}
public class Main
{
	public static void main(String[] args) {
	 System.out.println(Test.i);
     Test tst  = new Test();
     System.out.println(tst.j);
	}
}

