import java.util.ArrayList;

public class JavaPractice extends TestGetSet {
    public void swithA(String input){
        switch (input){
            case "a":
                System.out.println("ta la vu ngo");
                break;
            case "b":
                System.out.println("ta la dung");
                break;
            case "c":
                System.out.println("ta la Mua");
                break;
        }
    }

  public void testifelseshort(int old){
        String tuoi=(old<18) ? "nho qua" : "lon quas";
        System.out.println("print nhe:" + tuoi);
  }

  public void testwhile(int i){
        while(i<5){
            System.out.println("value in range");
            i++;
        }

        do{
            System.out.println("value in range 1");
            i++;
        }while(i<5);
  }

  public void testforeach(){
        String[] arr={"te","fda","fa","fadfksa"};
      for (String i:arr) {
          System.out.println("print for each: " + i);
      }

      for(int j=0; j<7;j++){
          if(j==4){
              continue;
          }
          System.out.println("print j and continue: " + j);
      }
  }

  public void testArraylist(){
      ArrayList<String> car= new ArrayList<>();
      car.add("test car1");
      car.add("test car2");
      car.add("test car3");
//      car.clear();
      car.set(2,"test nha");
      for(int i=0; i<car.size();i++){
          System.out.println("print cars: " + car.get(i));
      }
      System.out.println("print cars size: " + car.size());

  }

  public boolean checkArrayStoreOder(int[] a){
        if (a.length==0 || a.length==1) return true;
        for(int i=1; i<a.length;i++){
            if(a[i]<a[i-1]) return false;
        }
        return true;
  }




    public static void main(String[] args){

        JavaPractice java= new JavaPractice();
//        java.swithA("b");
//        java.testifelseshort(19);
//        java.testwhile(7);
//        java.testforeach();
//        java.setName("vungo quang");
//        System.out.println(java.getName());
//        java.testArraylist();
//        int result= java.solution(new int[] {2, 2, 2, 2, 1, 2, -1, 2, 1, 3});
//        System.out.println("print max longest: " + result);

    }
}

class TestGetSet{
    private String Name;

    public String getName(){
        return Name;
    }

    public void setName(String newName){
        this.Name=newName;
    }

}
