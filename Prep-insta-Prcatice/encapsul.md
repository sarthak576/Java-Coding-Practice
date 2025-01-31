# Java Encapsulation Example with `this` Keyword

## **Understanding `this` in Java**
- The `this` keyword refers to the current instance of a class.
- It is used to differentiate between instance variables and method parameters when they have the same name.
- `this` **cannot** be used in a `static` context.

---

## **Simplified Code Using `this`**
```java
class Name {  // Regular class
    String name;  // Instance variable
    int age;

    void getName() {
        System.out.println(this.name);  // Using this to access instance variable
    }

    void setName(String name) {
        this.name = name;  // Using this to assign instance variable
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        System.out.println("hello");

        Name obj = new Name();  // Creating an instance directly
        obj.setName("ui");  // Setting name
        obj.getName();       // Getting name (Expected output: "ui")
    }
}
```

---

## **Key Fixes & Concepts**
1. **Removed unnecessary outer class instance** to simplify object creation.
2. **Converted `Name` to a regular class** instead of an inner class.
3. **Used `this.name = name;`** to differentiate instance variable from the method parameter.

---

## **Expected Output**
```
hello
ui
```

Now you can refer to this file whenever you need a quick refresher! 🚀

