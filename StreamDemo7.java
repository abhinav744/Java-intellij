// Use collect() to create a List and a Set from a stream.
import java.util.*;
import java.util.stream.*;
class NamePhoneEmail2 {
    String name;
    String phonenum;
    String email;
    NamePhoneEmail2(String n, String p, String e) {
        name = n;
        phonenum = p;
        email = e;
    }
}
class namephone2 {
    String name;
    String phonenum;
    namephone2(String n, String p) {
        name = n;
        phonenum = p;
    }
}
class StreamDemo7 {
    public static void main(String[] args) {
// A list of names, phone numbers, and e-mail addresses.
        ArrayList<NamePhoneEmail2> myList = new ArrayList<>( );
        myList.add(new NamePhoneEmail2("Larry", "555-5555",
                "Larry@HerbSchildt.com"));
        myList.add(new NamePhoneEmail2("James", "555-4444",
                "James@HerbSchildt.com"));
        myList.add(new NamePhoneEmail2("Mary", "555-3333",
                "Mary@HerbSchildt.com"));
// Map just the names and phone numbers to a new stream.
        Stream<namephone2> nameAndPhone = myList.stream().map(
                (a) -> new namephone2(a.name,a.phonenum)
        );
// Use collect to create a List of the names and phone numbers.
        List<namephone2> npList = nameAndPhone.collect(Collectors.toList());
        System.out.println("Names and phone numbers in a List:");
        for(namephone2 e : npList)
            System.out.println(e.name + ": " + e.phonenum);
// Obtain another mapping of the names and phone numbers.
        nameAndPhone = myList.stream().map(
                (a) -> new namephone2(a.name,a.phonenum)
        );
// Now, create a Set by use of collect().
        Set<namephone2> npSet = nameAndPhone.collect(Collectors.toSet());
        System.out.println("\nNames and phone numbers in a Set:");
        for(namephone2 e : npSet)
            System.out.println(e.name + ": " + e.phonenum);
    }
}