package com.arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class FindingFirstLetterInStringFrequency {
	public static Map<Character, Integer> findingCharacterFrequency(List<String> list){
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        if(list.size()<3 || list==null){
            return null;
        } else {
            for(String s : list){
                String str = s.toLowerCase();
                Character ch = str.charAt(0);
                if(map.containsKey(ch)){
                    map.put(ch, map.get(ch)+1);
                } else {
                    map.put(ch, 1);
                }
            }
        }
        return map;
    }
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("Apple");
        list.add("APPLE");
        list.add("an");
        list.add("App");
        list.add("banana");
        list.add("Banana");
        Map<Character, Integer> mapResult = findingCharacterFrequency(list);
        for(Map.Entry<Character, Integer> entry : mapResult.entrySet()){
            System.out.println(entry.getKey() + " = "+entry.getValue());
        }
    }
}
