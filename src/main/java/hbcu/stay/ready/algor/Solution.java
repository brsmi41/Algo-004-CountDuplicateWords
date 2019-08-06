package hbcu.stay.ready.algor;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Solution {

    public String countUniqueWords(String input){
       Map<String,Integer> duplicates = new LinkedHashMap<>();

        String result = "";
        String updatedInput = input.replace(".","");
        String updateInput = updatedInput.replace("!","");
        String[] word = updateInput.split(" ");
        for(String a: word){
            if(!duplicates.containsKey(a)){
                duplicates.put(a,1);
            }
            else{
                int currentValue = duplicates.get(a);
                currentValue++;
                duplicates.put(a,currentValue);
            }


        }
        result += String.format("The %d unique words are:\n", duplicates.size());
        int size = 0;
        for (String s : duplicates.keySet()) {
            size++;
            int value = duplicates.get(s);
            if (size < duplicates.size()) {
                result += String.format("%s (Seen %d)\n", s, value);
            }
            else {
                result += String.format("%s (Seen %d)", s, value);
            }
        }
        System.out.println(result);
        return result;

    }
}
