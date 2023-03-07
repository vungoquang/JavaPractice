/*You are given an array A of integers. Find the maximum number of non-intersecting segments of length 2 (two adjacent elements), such that segments have an equal sum.
        For example, given A = [10, 1, 3, 1, 2, 2, 1, 0, 4], there are three non-intersecting
        segments, each whose sum is equal to 4: (1, 3), (2, 2), (0, 4). Another three non-intersecting segments are: (3, 1), (2, 2), (0, 4).
        Write a function:
        class Solution { public int solution (int [] A); }
          that, given an array A of N integers, returns the maximum number of segments with equal sums.
        Examples:
        1. Given A = [10, 1, 3, 1, 2, 2, 1, 0, 4], the function should return 3, as explained above.
        2. Given A = [5, 3, 1, 3, 2, 3], the function should return 1. Each sum of two adjacent
        elements is different from the others.
        3. Given A = [9, 9, 9, 9, 9] the function should return 2.
        4. Given A = [1, 5, 2, 4, 3, 3], the function should return 3. There are three segments: (1,
        5), (2, 4), (3, 3) whose sums are equal to 6.
        Write an efficient algorithm for the following assumptions:
        • N is an integer within the range [2..100,000];
        • each element of array A is an integer within the range [0.. 1,000,000,000].
*/

import java.util.*;

public class Algorthm {
    public int solution(int[] A){
        int maxIntersectincount = 0;
        int intersectingcount = 0;
        int prevSum = -1;
        int count = 1;
        Map<Integer, Integer> countSum = new HashMap<>();

        for(int i=0; i<A.length-1; i++){
            int sum = A[i] + A[i+1];
            if(sum != prevSum || count == 2) {
                intersectingcount = getCount(sum, countSum);
                maxIntersectincount = Math.max(maxIntersectincount, intersectingcount);
                count = 1;
            }else{
                if(sum == prevSum){
                    count = 2;
                }
            }
            prevSum = sum;
        }

        return maxIntersectincount;
    }

    private int getCount(int sum, Map<Integer, Integer> countSum) {
        int val = countSum.get(sum) == null ? countSum.getOrDefault(sum, 1): countSum.get(sum)+1;
        countSum.put(sum, val);
        return val;
    }

    public int solution1(int[] A){
        int sum=0;
        ArrayList<Integer> sumList= new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<A.length-1;i++){
            sum=A[i]+ A[i+1];
            sumList.add(sum);
        }
        for(Integer e: sumList) {
            if (map.containsKey(e)) {
                map.put(e, map.get(e) + 1);
            } else {
                map.put(e, 1);
            }
        }
        System.out.println(map);
        return Collections.max(map.entrySet(), Comparator.comparingInt(Map.Entry::getValue)).getValue();
    }
    public static void main(String[] args){
        Algorthm object= new Algorthm();
        System.out.println(object.solution(new int[] {1, 5, 2, 4, 3, 3}));
        System.out.println(object.solution1(new int[] {1, 5, 2, 4, 3, 3}));
    }
}
