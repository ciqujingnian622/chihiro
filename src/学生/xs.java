package ѧ��;

public class xs {
		  //public class xs1
		   public static void main(String[] args)
		  {   Student s1 = new Student("�", 18, "����"); 
		  s1.show();   System.out.println(); 
		   Undergraduate u1 = new Undergraduate("���", 20, "����", "�������");   
		   u1.show(); 
		   Graduate g1 = new Graduate("����",24,"�о���","������");  
		   g1.show();  } 
		   } 
class Student
{  //ѧ����  
		  	 String name;      //����
		  	 int age; //����  
		  	 String education;   //ѧ��
		  	 public Student(String name, int age, String education) 
		  	 {  //���췽��  
		  		 this.name = name;   
		  		 this.age = age;  
		  		 this.education = education;  }  
		  	 public void show() { 
		  		 System.out.print("����:" + name + "  ����:" + age + "  ѧ��:" + education); 
		  		 }
		  	 } 
class Undergraduate extends Student
{
		  			 //�������࣬��ѧ����̳�
		  			 String specialty;   //רҵ���������� 
		  			 public Undergraduate(String name, int age, String education,    String specialty)
		  			 {  
		  				 super(name, age, education); 
		  			 this.specialty = specialty; 
		  			 } 
		  
		  			 public void show() 
		  			 {  
		  				 // show() ����
		  				 super.show();  
		  				 System.out.println("  רҵ:" + specialty );  }  } 
		  		 class Graduate extends Student
		  		 {  //�о����࣬��ѧ����̳�
		  			 String direction;    //�о�������������  
		  			 public Graduate(String name, int age, String education, String direction)
		  			 { 
		  				 super(name, age, education); 
		  			 this.direction = direction;
		  			} 
		  			 public void show() 
		  			{  //show()���� 
		  				super.show(); 
		  				System.out.println("  �о�����:" + direction );
		  				
		  			}  
 
		  	 }
		  


	
	

