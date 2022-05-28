import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static String reversString(String input){
        char[] chars = new char[input.length()];

        for(int i=input.length()-1,j=0;i>=0;i--,j++){
            //System.out.println(input.charAt(i));
            chars[j]=input.charAt(i);
        }
        //System.out.println(new String(chars));

        return new String(chars);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String to reverse");
        String orignalString = sc.next();
        String result = reversString(orignalString);
        System.out.println("Original String is :"+ orignalString);
        System.out.println("Reversed String is :"+ result);
    }
}