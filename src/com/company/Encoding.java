package com.company;

public class Encoding {
    private int i,n;
    private String str1="";

    private char ch3;
    public String encode(String  str, int shift)
    {
        char ch1[]=str.toCharArray();
        n=str.length();
        for(i=0;i<n;i++)
        {
            if(Character.isLetter(ch1[i]))
            {
                ch3=(char)(((int)ch1[i]+shift-97)%26+97);
                //System.out.println(ch1[i]+" = "+ch3);
                str1=str1+ch3;
            }
            else if(ch1[i]==' ')
            {
                str1=str1+ch1[i];
            }
        }
        return str1;
    }
}
