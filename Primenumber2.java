package Assignments;

import java.util.Scanner;

public class Primenumber2 {

	public void methodprime(int arg1){

int flag = 0;
int n= arg1;
for (int m = 2;m<n/2;m++){
if(n%m==0){
flag=1;
System.out.println("The given number is  a composite number");
break;
}

}
if(flag==0){
System.out.println("The number is prime number");
}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Primenumber2 p1 = new Primenumber2();
Scanner sc1 = new Scanner(System.in);
System.out.println("Enter the number to check whether it is prime or not :");
int n = sc1.nextInt();
System.out.println("after validaion");
p1.methodprime(n);

	}

}
