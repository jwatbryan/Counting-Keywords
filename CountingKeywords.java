
import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CountingKeywords {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Java source file: ");
        String filename = input.nextLine();
        
        File myFile = new File(filename);
        if (myFile.exists()) {
            System.out.println("The number of keywords in "
                    + filename + " is " + countKeywords(myFile));
        }
        else {
            System.out.println("File " + filename + " DNE");
        }
    }
    public static int countKeywords(File myFile) throws Exception {
        
        String[] keywordString = {"abstract", "assert", "boolean", 
        "break", "byte", "case", "catch", "char", "class", "const",
        "continue", "default", "do", "double", "else", "enum",
        "extends", "for", "final", "finally", "float", "goto",
        "if", "implements", "import", "instanceof", "int", 
        "interface", "long", "native", "new", "package", "private",
        "protected", "public", "return", "short", "static", 
        "strictfp", "super", "switch", "synchronized", "this",
        "throw", "throws", "transient", "try", "void", "volatile",
        "while", "true", "false", "null"};
        
        Set<String> myKWSet = new HashSet<>(Arrays.asList(keywordString));
        int count = 0;
        Scanner input = new Scanner(myFile);
        while (input.hasNext()) {
            String line = input.nextLine();
            
            if (line.startsWith("//")) { 
            }
            if (line.startsWith("String")) {  
            }
            if (myKWSet.contains(line)) {
                count++;
            }    
        }
        return count;
    }
}
