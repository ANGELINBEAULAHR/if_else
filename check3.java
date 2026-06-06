public class check3 {
    public static void main(String[] args){
        check3 c = new check3();
        System.out.println(c.examp());
         System.out.println(c.ex(56,78));
          System.out.println(c.check(20));
           System.out.println(c.name());
}
 public int examp(){
    return 5;
 }

 public int ex(int a , int b){
    return a+b;
 }

 public boolean check( int age){
     return  age >=18;
 }
 String b = "bonjour";
 public String name(){
       System.out.println(b);
       return   "hello";
}
}