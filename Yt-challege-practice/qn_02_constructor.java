public class qn_02_constructor {
    public static void main(String[] args) {
        // Test test1 = new Test();    --- 01 error  wont work 
Test(2,50); // i got the answer
    }
    static void Test() {
        System.out.println("Hello");
    }
    static int Test(int x) {
        System.out.println("Hi");
        return 1;
    }
    static int Test(int x, int y) {
        System.out.println("Bye");
        return 1;
    }
}
// ans ---
// Test(2); --> Hi
// Test(); --> Hello 
// Test(23,45) --> Bye
      
