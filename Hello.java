// Program Creator: Jack-O-Brian - https://github.com/Jack-O-Brian
// Documentation: MuazAlhaidar - https://github.com/MuazAlhaidar

// Date: Feb 10, 2022

// Your First Program

// Creating Hello class where the main program will be executed
class Hello {

/*
    =============================================================================
    ||                         Hello World Program                             ||
    =============================================================================
*/

    // The purpose for the main method being static is three fold
    //    + it now belongs to the class rather than the object of a class
    //    + it can be invoked without the need for creating an instance of
    //      a class
    //    + it can access static data members and can change their values

    // The main method returns void due to the fact that it doesn't return
    // any values

    // Java args contains the supplied command-line arguments as an array
    // of String objects.
    public static void main(String[] args) {

        // System is a final class defined in the java.lang.package
        
        // out: This is an instance of PrintStream type, which is a public
        //      and static member field of the System class
        
        // println(): As all instances of PrintStream class have a public
        //            method println(), hence we can invoke the same on out
        //            as well. This is an upgraded version of print(). It
        //            prints any argument passed to it and adds a new line
        //            to the output. We can assume that System.out represents
        //            the Standard Output Stream

        // The "Hello, World!" being passed to println() is the test that
        // will be printed to the Standard Output Stream

        // The semi-colon marks the end of the println() statement
        System.out.println("Hello, World!");
    }
}
