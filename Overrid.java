class shape{
    public int x,y;
    void printArea(){
        System.out.println("prints the area of a shape");
  }
}
class rectangle extends shape{
  void printArea(){
     System.out.println("area of rectangle is "+x*y);
  }
}
public class Overrid{
   public static void main(String[] args){
      rectangle r=new rectangle();
      r.x=10;
      r.y=20;
      r.printArea();
  }
}