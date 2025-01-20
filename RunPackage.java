package JAVA;
public class RunPackage{
    public static void main(String[] args){
        System.out.println("How to use package in java : ");
        // // Check your directory structure: Ensure your file is in the correct folder structure:
        System.out.println("STEPS :- ");
        System.out.println("1. Create a folder named JAVA");
        System.out.println("2. Create a file named firstjavacode.java");
        System.out.println("3. Write the code in the file");
        System.out.println("4. Check your directory structure, in this case /home/shatrughan-shukla/Desktop/CODEEE/JAVA/");
        System.out.println("5. Compile the code using javac -d . firstjavacode.java");
        // // with -d
        // // Why It Creates a Folder:

        // // Java enforces a directory structure that matches the package hierarchy. The -d . flag ensures the package directory (JAVA) is created starting from the current directory (.) 
        // // and the compiled class file is placed in the package directory.
        // // If you don't use the -d flag, the compiled class file will be placed in the current directory, and the package directory will not be created.

        /* javac firstjavacode.java -> Use this command if your Java program does not have a package declaration */
        System.out.println("6. Run the code using java JAVA.firstjavacode");
        /*  java firstjavacode -> 
            The JVM searches for firstjavacode.class in the current directory (.).
            The class must not have a package declaration, as the JVM treats it as part of the default package.
         */
        System.out.println("7. Output will be displayed");
        System.out.println(" // ADDITIONAL INFORMATION // ");
        System.out.println("1. // // PascalConvention -> classes\n" + 
                        "2. // // camelCaseConvention -> function");
    }
}
// // Checking on something
