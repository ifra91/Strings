package StringPart1;

//inbuilt class--> string class
//ways which we can create string
//**Java is case-sensitive programming language
//Real world data which is unchangeable therefore we use

//JRE--> JVM will allocate some area for storing object; since string treated as object will store as
//in heap Area; inside heap area we have String Constant pool, string pool area, string pool or constant pool
//duplicates are not permitted in SCP;
//in heap area duplicates are allowed
//Whenever you create a string without new keyword it is created memory allocated in scp
//when created with new keyword memory created in heap area
//it was before java6 scp was a part of permanent generation
//but after java 6 it was added in heap area
//

public class ImmutableDemo {
    public static void main(String[] args) {
        //three ways we can create Strings
        String s="new";
        String st1 = new String("NewString");

        char[] ch = {'n', 'e', 'w'};
        String st2 = new String(ch);

        String s1 = "myName"; //memory will be allocated in scp
        String s2 = "myName"; //it creates another reference as duplicates are not allowed; sma eobject multiple
        //reference to save memory we can use this

        String s3 = new String("myName");// two different objects will be created
        String s4 = new String("myName");// we cna create multiple objects

        //Different ways to compare string value
        //1. == --> references variables will be compared
        //2. Equals method --> values of string will be compared
        //3. equalsIgnoreCase --> actual values will be compared by ignoring the case sensivity
        //4. compareTo--> String will be compared Lexicographically (character by character)

        String str1 = "India";
        String str2 = "India";
        String str3 = new String("India");

        System.out.println(str1 == str2); //true
        System.out.println(str1 == str3); //false objects hold address of diff objects

        //return type of equals type is boolean
        System.out.println(str1.equals(str2)); //true both references pointing to same object
        //it compares the values of both the ref var
        System.out.println(str1.equals(str3)); //true

    }




}











