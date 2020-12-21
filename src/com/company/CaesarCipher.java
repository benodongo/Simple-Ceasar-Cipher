package com.company;
import java.util.*;
public class CaesarCipher {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str;
        String str1="";
        String str2="";
        int shift;
        System.out.println("Enter the plaintext");
        str=sc.nextLine();
        str=str.toLowerCase();
        System.out.println("Enter the value by which each letter of the string is to be shifted");
        shift=sc.nextInt();
        //Instantiate the Encoding class
        Encoding obj1 = new Encoding();


        System.out.println();
        System.out.println("Encrypted text is");
        str1 = obj1.encode(str,shift);
        System.out.println(str1);
        //Instantiate decoding class
        Decoding obj2 = new Decoding();
        str2 = obj2.Decode(str1,shift);
        System.out.println();
        System.out.println("Decrypted text is");
        System.out.println(str2);

    }
}
