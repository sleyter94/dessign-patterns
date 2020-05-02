package edu.excercise.leetcode;

public class FirstBadVersion extends VersionControl{
  private int first = Integer.MAX_VALUE;
  public int firstBadVersion(int n) {
    helper(1,n);
    return first;
  }

  public int firstBadVersion2(int n) {
    int left = 1;
    int right = n;
    while (left < right) {
      int mid = left + (right - left) / 2;
      if (isBadVersion(mid)) {
        right = mid;
      } else {
        left = mid + 1;
      }
    }
    return left;
  }

  public int helper(int start, int end){
    if(end<start) return 0;

    int mid = (end-start)/2  + start;
    if(isBadVersion(mid)){
      first = Math.min(first,mid);
      return helper(start,mid-1);
    }else{
      return helper(mid+1,end);
    }
  }

  public static void main(String[] args) {
    FirstBadVersion fbv = new FirstBadVersion();
    FirstBadVersion fbv2 = new FirstBadVersion();
    System.out.println(fbv.firstBadVersion(2126753390));
    System.out.println(fbv.count);
    System.out.println(fbv2.firstBadVersion2(2126753390));
    System.out.println(fbv2.count);
  }
}

class VersionControl{
  int firstBadVersion = 1702766719;
  int count = 0;
  boolean isBadVersion(int version){
    count++;
    return version >= firstBadVersion;
  }
}
