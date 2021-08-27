package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        stringEqual("Alina", "Alina");
      stringVocal();
      stringConsonant();
      stringXorx();
      MapOperations();
    }

    static void palindrom(){
        // 2.  Given a one word string, return true if the string is a palindrome (word that reads the same forwards or backwards - e.g. madam, mom, abba )
        com.company.Palindrome pn = new com.company.Palindrome();
        if (pn.isPalindrome("ABBA")) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        new Palindrome();
    }
    static void MapOperations(){

        //4.Create an empty map that will contain Name and Email as key-value pairs
        //Add a couple of K-V entries
        //Get the size of the map
        //Check that map contains a specific name
        //Get the email that contains a specific name
        //Remove an entry
        //Sort the map by key
        HashMap<String, String> map=new HashMap<>();//Creating HashMap
        map.put("Alina","alina.mesesan@softvison.com");  //Put elements in Map
        map.put("Madalina","madalina@mail.com");
        map.put("Maria","maria.ma@mailinator.com");
        map.put("Malina","mailinaemail@gmail.com");
        System.out.println("The size of the map is " + map.size());

        System.out.println("Is the key 'Alina' present? " + map.containsKey("Alina"));
        String k = map.getOrDefault("Mihai","mihai@mail.com");
        System.out.println("What is the email for 'Mihai' key? " + k);

        map.remove("Maria");
        System.out.println("The new map looks like: ");
        for(Map.Entry m : map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
        TreeMap<String, String> sorted = new TreeMap<>(map);
        sorted.putAll(map);
        // Display the TreeMap which is naturally sorted
        for (Map.Entry<String, String> entry :
                sorted.entrySet())
            System.out.println("Key = " + entry.getKey()
                    + ", Value = "
                    + entry.getValue());
    }
    static void stringEqual(String s1, String s2) {

        // 1.Given two strings, check if the strings are equal. After that, concatenate them into one single string
        String s3 = s1.concat(s2);
        if (s1 == s2) {
            System.out.println(s3);
        }
    }
    static void stringVocal(){
        String s4 = "";
        ArrayList<String> array = new ArrayList<String>();
        ArrayList<String> list = new ArrayList<String>();
        list.add("Mango");
        list.add("Apple");
        list.add("Xanana");
        list.add("Graxpes");
        String vowels = "aeiou";
        //If the word starts with a vowel, make it all lowercase and append it to the empty string
        for (String testString : list)
            if (vowels.indexOf(Character.toLowerCase(testString.charAt(0))) != -1) {
                // Start char is vowel
                System.out.println(s4);

                s4 +=testString.toLowerCase();
                System.out.println("string empty:"+ s4);
            }
    }

    static void stringConsonant(){

        String s4 = "";
        ArrayList<String> array = new ArrayList<String>();
        ArrayList<String> list = new ArrayList<String>();
        list.add("Mango");
        list.add("Apple");
        list.add("Xanana");
        list.add("Graxpes");
        String vowels = "aeiou";

        //If the word starts with a consonant, make it all uppercase and add it to the empty array
        for (String testString : list)
            if (vowels.indexOf(Character.toLowerCase(testString.charAt(0))) == -1){
                System.out.println(s4);
                array.add(testString.toUpperCase());
                System.out.println("array"+ array);
            }
    }
static void stringXorx() {

    ArrayList<String> array = new ArrayList<String>();
    ArrayList<String> list = new ArrayList<String>();
    list.add("Mango");
    list.add("Apple");
    list.add("Xanana");
    list.add("Graxpes");
    // If the word contains letter x or X or has less than 3 letters, replace the word with "skipped" and print into the console the current word and the replaced word
    for (String testString : list)
        if (testString.contains("x") || testString.contains("X") || testString.length() < 3) {
            System.out.println("The word that contain x or X or has more than 3 characters is:  " + testString);
        }
}}
class sortmapKey {
    Map<String, String> map= new HashMap<>();
    public void sortbykey() {
        // TreeMap to store values of HashMap
        TreeMap<String, String> sorted = new TreeMap<>(map);

        // Display the TreeMap which is naturally sorted
        for (Map.Entry<String, String> entry :
                sorted.entrySet())
            System.out.println("Key = " + entry.getKey()
                    + ", Value = "
                    + entry.getValue());
    }
}

    class Palindrome {
        public boolean isPalindrome(String original) {
            int i = original.length() - 1;
            int j = 0;
            while (i > j) {
                if (original.charAt(i) != original.charAt(j)) {
                    return false;
                }
                i--;
                j++;
            }
            return true;
        }
    }








