package example;


import java.util.Scanner;

class Area {
    int x;
    int y;
    void  setDim(int length,int breadth){
       this.x=length;
       this.y=breadth;

    }

    double getDIm(){


double area=x*y;
return area;
    }

}



public class ExampleA {
    public static void main(String[] args){

        Area result=new Area();

        Scanner scan=new Scanner(System.in);

        System.out.println("Enter length of triangle");
        result.y= scan.nextInt();

        System.out.println("Enter width of triangle");
        result.x= scan.nextInt();

        System.out.println(result.getDIm());

    }



}
