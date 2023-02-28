import java.util.ArrayList;

public class FindLoop {
    public ArrayList<Integer> loop(int[] A){
        ArrayList<Integer> loopNumbers= new ArrayList<>();
        for(int i=0; i<A.length-1;i++){
            for(int j=i+1;j<A.length;j++){
                if(A[j]==A[i]){
                    if(!loopNumbers.contains(A[i])){
                        loopNumbers.add(A[i]);
                    }
                    break;
                }
            }
        }
        return loopNumbers;
    }

    public static void main(String[] args){
        FindLoop object= new FindLoop();
        int[] A={3,4,3,3,4,4,2,6,8,9,0,2,2};
        System.out.println("print loops: " + object.loop(A));
    }
}
