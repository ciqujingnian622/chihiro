package 学生;

public class Jisuan {

		public static void main(String[] args) {
			DepositAccount saver = new DepositAccount("1234567890","Zhang san",5000); 
			DepositAccount.szll(0.023);  //设置年利率    
			saver.deposit(2000);         //存入2000元    
			System.out.println("您好！您的年利息是：" + saver.jsYearInterest());//计算年利息
			} 
	}
	class DepositAccount{  

			String accountNum = new String();//账号  
			String name = new String();           //姓名
			private double balance;        //余额
			static double interest;  //年利率，类成员变量  
			
			public static void szll(double d ) 
			{  //设置年利率   
				interest = d; 
				}  
			public DepositAccount(String num,String na,double ba) 
				{  //开户，利用构造方法  
					accountNum = num; 
					name = na; 
					balance = ba;  } 
				public double jsYearInterest() 
				{  //计算年利息
					return balance * interest; //计算
					} 
				public void deposit(double cash)
				{  //存款   
					System.out.println("您好！您账户原有余额为：" + balance);
					System.out.println("您好！你现在存入：" + cash);  
					balance += cash;
					System.out.println("恭喜您存款成功！您的当前余额为：" + balance); 
					}  
				
		}

		


