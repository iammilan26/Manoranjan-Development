package com.school.schoolManagement.service;
import java.lang.*;
import java.io.*;
import java.util.*;

public class CountOfSpecialDigits
{
    public static int countOfSpecialDigits(int N)
    {
        int result = 0;
        //write your Logic here:
        if(N%3 ==1){
        	System.out.println(true);
            for(int i=1; i<=N; i++)
            {
                result = result +i;
            }
        }
        
        return result;
    }
    
    public static void main(String[] args)
    {
        //INPUT [uncomment & modify if required]
        Scanner sc=new Scanner(System.in);
        int N;
        N = sc.nextInt();

        //OUTPUT [uncomment & modify if required]
        System.out.println(countOfSpecialDigits(10));
    
    }
}