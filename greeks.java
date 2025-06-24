import java.util.Scanner;

public class greeks {
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
double num1=sc.nextDouble();
System.out.println("Enter the number");
double num2=sc.nextDouble();
System.out.println("opreatoins +,-,*,/");
char operator=sc.next().charAt(0);
double result;
switch(operator){
case '+':
result=num1+num2;
System.out.println("addition of two numbrers: "+result);
break;
case '-':
result=num1-num2;
System.out.println("sub of two numbrers: "+result);
break;
case '*':
result=num1*num2;
System.out.println("multiply of two numbrers: "+result);
break;
case '/':
if(num2!=0){
result=num1/num2;
System.out.println("divide is: "+result);
}
else{
System.out.println("cannot divide by zero");
}
break;
default:
System.out.println("invalid ");
}
}
}