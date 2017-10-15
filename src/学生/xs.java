package 学生;

public class xs {
		  //public class xs1
		   public static void main(String[] args)
		  {   Student s1 = new Student("李航", 18, "高中"); 
		  s1.show();   System.out.println(); 
		   Undergraduate u1 = new Undergraduate("白瑜", 20, "本科", "软件工程");   
		   u1.show(); 
		   Graduate g1 = new Graduate("李林",24,"研究生","大数据");  
		   g1.show();  } 
		   } 
class Student
{  //学生类  
		  	 String name;      //姓名
		  	 int age; //年龄  
		  	 String education;   //学历
		  	 public Student(String name, int age, String education) 
		  	 {  //构造方法  
		  		 this.name = name;   
		  		 this.age = age;  
		  		 this.education = education;  }  
		  	 public void show() { 
		  		 System.out.print("姓名:" + name + "  年龄:" + age + "  学历:" + education); 
		  		 }
		  	 } 
class Undergraduate extends Student
{
		  			 //本科生类，从学生类继承
		  			 String specialty;   //专业，新增属性 
		  			 public Undergraduate(String name, int age, String education,    String specialty)
		  			 {  
		  				 super(name, age, education); 
		  			 this.specialty = specialty; 
		  			 } 
		  
		  			 public void show() 
		  			 {  
		  				 // show() 方法
		  				 super.show();  
		  				 System.out.println("  专业:" + specialty );  }  } 
		  		 class Graduate extends Student
		  		 {  //研究生类，从学生类继承
		  			 String direction;    //研究方向，新增属性  
		  			 public Graduate(String name, int age, String education, String direction)
		  			 { 
		  				 super(name, age, education); 
		  			 this.direction = direction;
		  			} 
		  			 public void show() 
		  			{  //show()方法 
		  				super.show(); 
		  				System.out.println("  研究方向:" + direction );
		  				
		  			}  
 
		  	 }
		  


	
	

