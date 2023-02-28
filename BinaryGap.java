public class BinaryGap {
    public int solution(int N){
        int counter=0;
        int maxCounter=0;
        String binary= Integer.toBinaryString(N);
        for(int i=0; i<binary.length();i++){
            String subString= binary.substring(i,i+1);
            if(subString.equals("1")){
                if(maxCounter<counter){
                    maxCounter=counter;
                }
                counter=0;
            }
            if(subString.equals("0")){
                counter++;
            }

        }
        return maxCounter;
    }

    public static void main(String[] args){
        BinaryGap bg= new BinaryGap();
        System.out.println(bg.solution(561892));
    }

//9    A=1001
//    529 A=1000010001
//    A=10001001001011100100_2
}
