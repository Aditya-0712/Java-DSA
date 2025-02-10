public class String1 {
    public static void main(String[] args) {

        //Static memory (more efficient)
        String str1 = "Static";
        System.out.println(str1);

        //Heap memory (JVM makes a new object)
        String str2 = new String("Heap Memory");
        System.out.println(str2);

        //StringBuffer is mutable in nature and it is thread safe class , we can use it when we have multi threaded environment and shared object of string buffer i.e, used by mutiple thread.
        StringBuffer str3 = new StringBuffer();
        str3.append("Appending to StringBuffer");

        //StringBuilder is same as tringBuffer but it is not Thread Safe
        StringBuilder str4 = new StringBuilder();
        str4.append("Appending to StringBuilder");

        //Strings are immutable in Java, e.g:-
        String s = "Eden";
        s.concat(" Hazard");
        System.out.println(s); //Output = Eden

        //Solution: Either use StringBuffer or StringBuilder or do the following
        s=s.concat(" Hazard");
        System.out.println(s);
    }    
}
