package test1;

//1929. Concatention of Array 

/*
Question. Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).

Specifically, ans is the concatenation of two nums arrays.

Return the array ans.
*/


class Solution {
    public int[] getConcatenation(int[] nums) {
        
        //배열의 길이
        int size = nums.length;
        
        //새로운 배열(길이 2배)
        int[] ans = new int[size * 2];
        
        //기존 배열이 복사됨과 동시에 사이즈 만큼 더해서 또 복사
        for(int i = 0; i < size; i++){
            ans[i] = nums[i];
            ans[i + size] = nums[i];
        }
        
        
        return ans;
    }
}
