import java.util.Scanner;
public class bank{
float accountnumber;
float bankbalance;
float depositamount;
float withdrawalamount;
float money;
void deposit(){
System.out.println("the deposited amount is "+depositamount);
}
void withdraw(){
System.out.println("the withdrawal amount"+withdrawalamount);
}
public static void main(String args[]){
Scanner input=new Scanner(System.in);
bank obj=new bank();
System.out.println("account number is ");
obj.accountnumber=input.nextFloat();
System.out.println("Enter the amount in bank balance:"); 
obj.bankbalance=input.nextFloat();
System.out.println("enter the money that should be deposited or withdrawal");
obj.money=input.nextFloat();
obj.depositamount = obj.bankbalance+obj.money;
obj.deposit();
obj.withdrawalamount=obj.bankbalance-obj.money;
obj.withdraw();
}
}

