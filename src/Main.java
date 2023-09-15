//package src;
//
//import java.util.Arrays;
//
//public class Main {
//    public static void main(String[] args) {
//        Main main = new Main();
//        int[] nums1 = { 2, 7, 11, 15 };
//        int target1 = 9;
//        int[] result1 = main.twoSum(nums1, target1);
//        System.out.println(Arrays.toString(result1));
//    }
//
//    public int[] twoSum(int[] nums, int target) {
//        int[] result = new int[2]; // Create an array to store the result (indices of the two numbers)
//
//        for (int i = 0; i < nums.length - 1; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                // Check if the sum of elements at indices i and j equals the target value
//                if (nums[i] + nums[j] == target) {
//                    result[0] = i; // Store the index i in the first position of the result array
//                    result[1] = j; // Store the index j in the second position of the result array
//                    return result; // Return the result array with the indices of the two numbers
//                }
//            }
//        }
//
//        // If no solution is found, return an empty array
//        return new int[0];
//    }
//import java.io.*;
//import java.util.*;
//
//    /*
//    We are given the record of entry and exit records for a building as follows:
//
//    records1 = [
//      ["Martha",   "enter"],
//      ["Paul",     "enter"],
//      ["Martha",   "exit"],
//      ["Steve",    "enter"],
//      ["Jennifer", "enter"],
//      ["Curtis",   "enter"],
//      ["Paul",     "exit"],
//      ["Martha",   "enter"],
//      ["Martha",   "exit"],
//      ["Jennifer", "exit"],
//      ["Paul",     "enter"],
//      ["Paul",     "exit"]
//    ]
//
//    Given a list of records as shown above, return a collection of all the people that appear in the records.
//
//    Note: each person should only appear once in the output.
//
//    Expected output: ["Paul", "Curtis", "Steve", "Martha", "Jennifer"]
//
//    Complexity Discussion:
//    n: the length of the records array
//    */
//    public class Solution {
//        public static void main(String[] argv) {
//            String[][] records1 = {
//                    {"Martha", "enter"},
//                    {"Paul", "enter"},
//                    {"Martha", "exit"},
//                    {"Steve", "enter"},
//                    {"Jennifer", "enter"},
//                    {"Curtis", "enter"},
//                    {"Paul", "exit"},
//                    {"Martha", "enter"},
//                    {"Martha", "exit"},
//                    {"Jennifer", "exit"},
//                    {"Paul", "enter"},
//                    {"Paul", "exit"}
//            };
//            records(records1);
//
//        }
//        public static int returnRecord(String[] records, String name){
//            for(int i = 0;i<= records.length;i++){
//                if(records[i].equals(name)){
//                    return i;
//                };
//            }
//
//            return -1;
//        }
//
//        public static ArrayList<String> records(String[][] records){
//            HashMap<String,String> newRecords = new HashMap<>();
//            for(int i = 0;i < records.length;i++){
//                newRecords.put(records[i][0],records[i][1]);
//            }
//            System.out.println(newRecords);
//            ArrayList<String> names = new ArrayList();
//            for(String name : newRecords.keySet()) {
//                System.out.println(name);
//                names.add(name);
//            }
//            return names;
//
//        }
//
//    }
//
//}
