package com.flexon.readFile;

import java.io.FileNotFoundException;
import java.util.*;

public class App 
{
       
    public static void main(String[] args){
        readFile r = new readFile();
        try {
            List<String> ans = r.read();
            for (String s : ans) {
                System.out.println(s);
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("******Invalid File Directory******");
            System.out.println("Please create an example.txt file in the following directory:");
            System.out.println("src/files/example.txt");
        }
        
    }
        
    
}
