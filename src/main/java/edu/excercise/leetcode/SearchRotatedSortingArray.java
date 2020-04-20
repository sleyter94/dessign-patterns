package edu.excercise.leetcode;

public class SearchRotatedSortingArray {

  public static void main(String[] args) {
    int[] a = {5,1,2,3,4};
    System.out.println(search(a,1));
  }

  public static int search(int[] nums, int target) {
    return search(nums,0,nums.length-1,target);
  }

  public static int search(int[] nums, int low, int high, int target){
    if(low>high) return -1;
    int mid = (low+high)/2;
    if(nums[mid]>nums[low]){
      if(target > nums[mid]){
        return search(nums,mid+1,high,target);
      }else if(target < nums[mid]){
        if(target > nums[low]) return search(nums,low,mid-1,target);
        else if(target < nums[low]) return search(nums,mid+1,high,target);
        else return low;
      }else return mid;
    }else if(nums[mid]<nums[high]){
      if(target<nums[mid]){
        return search(nums,low,mid-1,target);
      }else if(target > nums[mid]){
        if(target < nums[high]) return search(nums,mid+1,high,target);
        else if(target > nums[high]) return search(nums,low,mid-1,target);
        return high;
      }else return mid;
    }else if(mid == low){
      if(nums[mid] == target) return mid;
      else if(nums[high] == target) return high;
    }
    if(nums[mid]>target) return search(nums,low,mid-1,target);
    else if(nums[mid]<target) return search(nums,mid+1,high,target);
    else return mid;
  }

  int search2(int[] nums, int target){
    int left = 0, right = nums.length - 1;
    int mid;

    while (left <= right) {
      mid = left + (right - left) / 2;
      if (target == nums[mid])
        return mid;
      else if (nums[mid] <= nums[right]) {
        if (target > nums[mid] && target <= nums[right]) {
          left = mid + 1;
        } else
          right = mid - 1;
      }else {
        if (target < nums[mid] && target >= nums[left]) {
          right = mid - 1;
        }else
          left = mid + 1;
      }
    }

    return -1;
  }
}
