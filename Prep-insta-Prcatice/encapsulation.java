// refer encapsul.md
public class encapsulation {
    public static void main(String[] args) {
        System.out.println("hello");
        Name obj = new Name(); // "error -- No enclosing instance of type encapsulation is accessible. Must
                               // qualify the allocation with an enclosing instance of type encapsulation (e.g.
                               // x.new A() where x is an instance of encapsulation)
        // obj.setName("web designer");
        obj.getName();
    }
}

class Name {
    String name = "ux designer";
    int age;

    void getName() {
        System.out.println(name);
    }

    void setName(String studentname) {
        this.name = studentname;
        System.out.println(name);
    }

}
