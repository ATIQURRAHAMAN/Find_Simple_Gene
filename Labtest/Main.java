class Test {
    // class contents
    void show() {
        System.out.println("Test::show() called");
    }
}
  
public class Main {
    public static void main(String[] args) {
        Test t = new Test(); //all objects are dynamically allocated
        t.show(); // No error 
    }
}