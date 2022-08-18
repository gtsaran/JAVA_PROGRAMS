package sample;

import java.util.Scanner;


public class String_frmt_Abc {


    public static String capitalize(String str)
    {
        String[] words = str.split("\\s");
        StringBuilder sb = new StringBuilder();
 
        for (String s: words)
        {
            if (!s.equals(""))
            {
                sb.append(Character.toUpperCase(s.charAt(0)));
                sb.append(s.substring(1));
            }
            sb.append(" ");
        }
 
        // `trim()` to remove extra space at the end before returning
        return sb.toString().trim();
    }
 
    public static void main(String[] args)
    {
        String sentence ;
        
        //"tecHie   deliGht is awesOMe!"
        
        Scanner sc = new Scanner(System.in);
        sentence = sc.nextLine();
        
        sentence = sentence.toLowerCase();
        
        String str = capitalize(sentence);
 
        System.out.println(str);
        
        sc.close();
    }

}
