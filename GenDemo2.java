// A simple generic class.
// Here, T is a type parameter that
// will be replaced by a real type
// when an object of type Gen is created.
class Gen2<T> {
    T ob; // declare an object of type T
    // Pass the constructor a reference to
// an object of type T.
    Gen2(T o) {
        ob = o;
    }
    // Return ob.
    T getob() {
        return ob;
    }
    // Show type of T.
    void showType() {
        System.out.println("Type of T is " +
                ob.getClass().getName());
    }
}
// Demonstrate the generic class.
class GenDemo2 {
    public static void main(String args[]) {
// Create a Gen reference for Integers.
        Gen2<Integer> iOb;
// Create a Gen<Integer> object and assign its
// reference to iOb. Notice the use of autoboxing
// to encapsulate the value 88 within an Integer object.
        iOb = new Gen2<Integer>(88);
// Show the type of data used by iOb.
        iOb.showType();
// Get the value in iOb. Notice that
// no cast is needed.
        int v = iOb.getob();
        System.out.println("value: " + v);
        System.out.println();
// Create a Gen object for Strings.
        Gen2<String> strOb = new Gen2<String>("Generics Test");
// Show the type of data used by strOb.
        strOb.showType();
// Get the value of strOb. Again, notice
// that no cast is needed.
        String str = strOb.getob();
        System.out.println("value: " + str);
    }
}