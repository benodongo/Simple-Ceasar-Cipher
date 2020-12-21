package com.company;

public class Decoding {
    private int i,n;
    private String str2="";
    private char ch4;
    public String Decode(String str1, int shift)
    {
        char ch2[]=str1.toCharArray();
        for(i=0;i<str1.length();i++)
        {
            if(Character.isLetter(ch2[i]))
            {
                if(((int)ch2[i]-shift)<97)
                {
                    ch4=(char)(((int)ch2[i]-shift-97+26)%26+97);

                }
                else
                {
                    ch4=(char)(((int)ch2[i]-shift-97)%26+97);
                }
                str2=str2+ch4;
            }

            else if(ch2[i]==' ')
            {
                str2=str2+ch2[i];
            }
        }
        return str2;
    }
}
