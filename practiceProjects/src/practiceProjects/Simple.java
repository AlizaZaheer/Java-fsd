package practiceProjects;

//Private

class A{  
A(){}//private constructor  
void msg(){System.out.println("Hello java");}  
}  
public class Simple{  
 public static void main(String args[]){  
   A obj=new A();//Compile Time Error  
 }  
}

//Default

package pack;  
class A{  
  void msg(){System.out.println("Hello");}  
}   
package mypack;  
import pack.*;  
class B{  
  public static void main(String args[]){  
   A obj = new A();//Compile Time Error  
   obj.msg();//Compile Time Error  
  }  
}  


//Protected

package pack;  
public class A{  
protected void msg(){System.out.println("Hello");}  
}  

package mypack;  
import pack.*;  
  
class B extends A{  
  public static void main(String args[]){  
   B obj = new B();  
   obj.msg();  
  }  
}  


//public

package pack;  
public class A{  
public void msg(){System.out.println("Hello");}  
}  
 
  
package mypack;  
import pack.*;  
  
class B{  
  public static void main(String args[]){  
   A obj = new A();  
   obj.msg();  
  }  
}  