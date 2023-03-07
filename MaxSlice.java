/* A non-empty array A consisting of N integers is given. A slice of that array is a pair of integers (P, Q) such that 0 < P < Q< N. Integer P is called the beginning of the slice; integer Q is called the end of the slice. The number Q - P + 1 is called the size of the slice. A slice (P, Q) of array A is called ascending if the corresponding items form a strictly increasing sequence: A[P] < A[P+1] < ... < A[Q-1] < A[Q].
        Note that we consider a slice (P, P) consisting of one element to be ascending.
        For example, consider array A such that:
        A[0] = 2
        A[1] = 2
        A[2] = 2
        A[3] = 2
        A[4] = 1
        A[5] = 2
        A[6] = -1
        A[7] = 2
        A(8] = 1
        A[9] = 3
        Pair (0, 3) is a slice of array A of size 4 that is not ascending. Pair (2, 2) is a slice of size 1 that is ascending. Pair (4, 5) is a slice of size 2 that is ascending. Pairs (6, 7) and (8,
        9) are other slices of size 2 that are ascending. There is no slice of array A that is ascending and has size greater than 2.
        Write a function:
class Solution { public int solution(int[] A); }
that, given an array A consisting of N integers, returns the beginning of any ascending slice of A of maximal size.
        For instance, in the above example the function may return 4, 6 or 8 as explained above.
        For the following array A consisting of N = 3 elements:
        A[01 = 30
        Write an efficient algorithm for the following assumptions:
• N is an integer within the range [1.. 150,000];
• each element of array A is an integer within the range
[-2,147,483,648.2,147,483,647].

 */
public class MaxSlice {
    public int solution(int[] A) {
        int max = 0;
        int sublen = 1;
        int begin = 0;
        for (int i = 1; i < A.length; i++) {
            if (A[i] > A[i-1]) {
                sublen++;
            } else {
                if (sublen > max) {
                    max = sublen;
                    begin = i - max;
                }
                sublen = 1;
            }
        }
        if (sublen > max) {
            max = sublen;
            begin = A.length - max;
        }
        return begin;
    }

    public static void main(String[] args){

        MaxSlice java= new MaxSlice();
        int result= java.solution(new int[] {2, 2, 2, 2, 1, 2, -1, 2, 1, 3});
        System.out.println("print max longest: " + result);

    }
}
