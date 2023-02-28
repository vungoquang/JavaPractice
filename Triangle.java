public class Triangle {

    public double distance(double Ax, double Ay, double Bx, double By){
        return Math.sqrt(Math.pow(Bx-Ax,2)+Math.pow(By-Ay,2));

    }

    public void checkTriangle(double Ax, double Ay, double Bx, double By, double Cx, double Cy){
        double a=distance(Ax,Ay,Bx,By);
        double b =distance(Bx,By,Cx,Cy);
        double c =distance(Ax,Ay,Cx,Cy);
        if((a+b>c) || (a+c>b) || (b+c > a)){
            System.out.println("it's triangle");
            if(a==b && b==c && c==a){
                System.out.println("it's triangle equilateral");
            }else if(Math.pow(a+b,2)==Math.pow(c,2) || Math.pow(c+b,2)==Math.pow(a,2) || Math.pow(a+c,2)==Math.pow(b,2)){
                System.out.println("it's triangle vuong");
            }else if(a==b || a==c || b==c){
                System.out.println("it's triangle can");
            }else{
                System.out.println("it's triangle thuong");
            }

        }else{
            System.out.println("it is not triangle");
        }
    }
    public  static void  main(String [] args){
        Triangle a= new Triangle();
        a.checkTriangle(3.3,5.2,2.3,4.2,5.6,2.6);

    }
}
