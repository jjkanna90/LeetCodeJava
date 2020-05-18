package org.leetcode.practice;

/**
 * You are given a sorted array consisting of only integers where every element appears exactly twice, except for one element which appears exactly once. Find this single element that appears only once.
 * Input: [1,1,2,3,3,4,4,8,8]
 * Output: 2
 *
 * Input: [3,3,7,7,10,11,11]
 * Output: 10
 *
 */
public class FindNonRepetition {

    public int findNonRepeat(int[] arr){
        int length = arr.length;
        int diff = length;

        int start = 0;
        int end = length-1;
        diff = end-start+1;

        while(diff > 2){
            int mid = start+(diff)/2;
            //diff will always be odd
            if(arr[mid] == arr[mid-1]){
                if(diff == 3){
                    return arr[mid+1];
                }
                // the lone element is to the left
                end = mid;
            }
            else if(arr[mid] == arr[mid+1]){
                if(diff == 3){
                    return arr[mid-1];
                }
                //the lone elment is to the right
                start = mid;
            }
            else{
                return arr[mid];
            }
            diff = end-start+1;
        }
        return -1;

    }


    public int recursiveFind(int[] arr, int start, int end){
        int diff = end-start+1;
        int mid  = start+diff/2;
        if(arr[mid] == arr[mid-1]){
            if(diff == 3){
                  return arr[mid+1];
            }
            return recursiveFind(arr,start,mid);
        }

            //the lone elment is to the right
        else if(arr[mid] == arr[mid+1]){
            if(diff == 3){
                return arr[mid-1];
            }
            return recursiveFind(arr,mid,end);
        }
        else{
            return arr[mid];
        }
     }



}
