package com.company;
import java.util.*;

class Main {
    public static void main(String[] args){
        Scanner Sc = new Scanner(System.in);
        System.out.println("Input start and end number: ");
        int startNum = Sc.nextInt();
        int endNum = Sc.nextInt();
        int resCount = 0;
        for(int i=startNum; i<=endNum; i++){
            int digitCount = 0;
            String numStr = String.valueOf(i);
            outer:
            for(int j=0; j<numStr.length(); j++){
                for(int k=j+1; k<numStr.length(); k++){
                    if(numStr.charAt(j)==numStr.charAt(k)){
                        digitCount++;
                        break outer;
                    }
                }
            }
            if(digitCount>0){
                continue;
            }else{
                resCount++;
            }
        }
        System.out.println(resCount);
    }
}