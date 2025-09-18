package CTS_PREPARATION.Strings;

import java.util.ArrayList;

public class Stringdecode {
    public static void main(String[] args) {
        String str="2a3b";

        ArrayList<Integer> al=new ArrayList<>();
        ArrayList<Character> al2=new ArrayList<>();
        int i=0;
        while(i<str.length()){
            char a=str.charAt(i);
            if(Character.isDigit(a)){
                al.add(a-'0');
                i++;
            }
            else{
                al2.add(a);
                i++;
            }
        }

        String str3="";
//        System.out.println(al.get(0));
//        System.out.println(al2.get(0));
        for(int j=0;j<al.size();j++){
            for(int k=0;k<al.get(j);k++){
                System.out.println(al2.get(j));
            }
        }
    }
}
