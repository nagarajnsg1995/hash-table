package com.bridgelabz;

import java.util.Hashtable;

public class HashTable {
    public static void main(String[] args)
    {
        String str = " “Paranoids are not paranoid because they are paranoid but because " +
                "they keep putting themselves deliberately into paranoid avoidable situations";
        Hashtable< String, Integer> hashtable = new Hashtable();

        str = str.replace("avoidable"," ");

        String[] words = str.split(" ");

        for (String word : words) {

            // Asking whether the HashMap contains the
            // key or not. Will return null if not.
            Integer integer = hashtable.get(word);

            if (integer == null)


                hashtable.put(word, 1);

            else {

                hashtable.put(word, integer + 1);
            }
        }
        System.out.print(hashtable);
    }
}

