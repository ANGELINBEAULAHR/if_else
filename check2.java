public class check2 {
    public static void main(String[] args)
    {
      check2 c = new check2();
      System.out.println(c.com());
      c.comp(2,3);      
    }

    public void comp(int a, int b){
        System.out.println(a+b);
    }
    int d = 4;
    public int com(){
        return d;
    }
}
