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
}
