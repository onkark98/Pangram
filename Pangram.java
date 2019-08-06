import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Pangram {

    // Complete the pangrams function below.
    static String pangrams(String s) {

        String mod1 = s.replaceAll(" ","");
        String mod2 = mod1.toLowerCase();

        HashMap<Character,Integer> map = new HashMap<>();

        int len = mod2.length();
        
        for(int i=0;i<len;i++)
        {
            char key = mod2.charAt(i);
            if(map.containsKey(key))
            {
                map.put(key,map.get(key)+1);
            }
            else
            {
                map.put(key,1);
            }
        }

        if(map.size()==26)
            return "pangram";

        return "not pangram";

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        String result = pangrams(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
