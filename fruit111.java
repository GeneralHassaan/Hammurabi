import java.util.Scanner;
public class fruit111 {
   
     
   
  protected String name;
  protected String taste;
  protected double size;
   
   public fruit111 ( String name, String taste, double size ) {
   
      this.name = name;
      this.taste = taste;
      this.size = size;
         
         }
           void myEat() {
            Scanner object = new Scanner(System.in);
            
            System.out.println("What is your favourite fruit?");
            String name = object.next();
            System.out.println(name +": It's very Juicy.");
           
            }
        public void main(String [] args) {
        myEat();
        }
         class fruit {
        public fruit() {
        }
        }    
          
        // extender
        class apple extends fruit {
        public apple() {
        }
        public void myEat() {
            System.out.println("name of the fruit is Apple");
            System.out.println("Taste of the fruit is Sweet");
            
}

}
   //extender 2
      
      class orange extends fruit {
      public orange() {
      }
      public void myEat() {
         System.out.println("Name of this fruit is orange");
         System.out.println("taste is sweet and sour");
         }
}
}      
         
        
       
         
         
         
         
        
                   