package com.flexon.readFile;

import java.io.FileNotFoundException;
import java.util.*;

public class App 
{
       
    public static void main(String[] args) throws FileNotFoundException{
        readFile r = new readFile();
        List<String> ans = r.read();
        for (String s : ans) {
            System.out.println(s);
        }
    }
        
    
}
