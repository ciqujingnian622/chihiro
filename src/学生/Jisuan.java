package ѧ��;

public class Jisuan {

		public static void main(String[] args) {
			DepositAccount saver = new DepositAccount("1234567890","Zhang san",5000); 
			DepositAccount.szll(0.023);  //����������    
			saver.deposit(2000);         //����2000Ԫ    
			System.out.println("���ã���������Ϣ�ǣ�" + saver.jsYearInterest());//��������Ϣ
			} 
	}
	class DepositAccount{  

			String accountNum = new String();//�˺�  
			String name = new String();           //����
			private double balance;        //���
			static double interest;  //�����ʣ����Ա����  
			
			public static void szll(double d ) 
			{  //����������   
				interest = d; 
				}  
			public DepositAccount(String num,String na,double ba) 
				{  //���������ù��췽��  
					accountNum = num; 
					name = na; 
					balance = ba;  } 
				public double jsYearInterest() 
				{  //��������Ϣ
					return balance * interest; //����
					} 
				public void deposit(double cash)
				{  //���   
					System.out.println("���ã����˻�ԭ�����Ϊ��" + balance);
					System.out.println("���ã������ڴ��룺" + cash);  
					balance += cash;
					System.out.println("��ϲ�����ɹ������ĵ�ǰ���Ϊ��" + balance); 
					}  
				
		}

		


