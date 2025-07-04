import java.util.Scanner;

public class Demo{
    public static void main(String[] args) {
       /* Scanner i = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = i.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int max = (a > b) ? a : b;
        System.out.println("Maximum is: " + max);
    }
}

        Scanner n = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = n.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        // Swapping without temp variable
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}
Scanner n = new Scanner(System.in);
        System.out.print("Enter marks: ");
        int m = n.nextInt();

        if (m >= 90 && m <= 100)
            System.out.print("Grade: A");
        else if (m >= 75 && m< 90)
            System.out.print("Grade: B");
        else if (m >=35 && m < 75)
            System.out.print("Grade: C");
        else
            System.out.print("Fail");
    }
}
Scanner i = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = i.nextInt();

        if (age >= 18)
            System.out.println("You are eligible to vote.");
        else
            System.out.println("You are not eligible to vote.");
    }
}
       Scanner t=new Scanner(System.in);
       System.out.print()
       int days=t.nextInt();
       switch(days)
       {
           case 1:
               {
                   System.out.println("Monday");
                   break;
               }
               
           case 2:
               {
               System.out.println("Tuesday");
               break;
               }
               
           case 3:
               {
               System.out.println("Wednesday");
               break;
               }
               
           case 4:
               {
               System.out.println("Thursday");
               break;
               }
           case 5:
               {
               System.out.println("Friday");
               break;
               }
           case 6:
               {
               System.out.println("Saturday");
               break;
               }
               
           case 7:
               {
               System.out.println("Sunday");
               break;
               }
               default:
               {
                   System.out.println("Invalid");
               }
       }
       int sum=0;
       for(int i=0;i<21&&i%2==0;i++)
       {
           
       System.out.println(i);
       }
       
		Scanner in = new Scanner(System.in);
		boolean flag = true;
		while(flag){
		    System.out.println("new operation");
		    		    System.out.print("Enter num1 :");
		    		    int num1 = in.nextInt();
		    		    System.out.print("Enter num2:");
		    		    int num2 = in.nextInt();
		    		 System.out.print("Enter operator :");
		    		 char op = in.next().charAt(0);
		    		 System.out.print("output is :");
		    switch(op){
		        case '+':
		            {
		              System.out.println(num1+num2); 
		              break;
		            }
		              case '-':
		            {
		              System.out.println(num1-num2); 
		              break;
		            }
		              case '*':
		            {
		              System.out.println(num1*num2); 
		              break;
		            }
		              case '/':
		            {
		              System.out.println(num1/num2); 
		              break;
		            }
		              case '%':
		            {
		              System.out.println(num1%num2); 
		              break;
		            }
		            default :{
		                System.out.println("Invalid operator");
		                break;
		            }
		    }
		    System.out.print("Do u need to continue : (Y / N)");
		    char k = in.next().charAt(0);
		    if(k != 'y'){
		        flag = false;
		    }
		}
		Scanner l = new Scanner(System.in);
		boolean flag = true;
		
		    System.out.println("      MENU      ");
		    		    System.out.println("1.Login");
		    		    System.out.println("2.Sign in");
		    		    System.out.println("3.Logout");
		do 
		{
		        
		    		 int a=l.nextInt();
		    switch(a){
		        case 1:
		            {
		              System.out.println(" Account Login successfully"); 
		              break;
		            }
		              case 2:
		            {
		              System.out.println("Account Signed successfully "); 
		              break;
		            }
		              case 3:
		            {
		              System.out.println("Account Logout successfully"); 
		              break;
		            }
		             
		            default :{
		                System.out.println("Invalid option");
		                break;
		            }
		    }
		    System.out.print("Do u need to continue : (NEXT/ EXIST)");
		    String k = l.next();
		    if(k !="NEXT" ){
		        flag = false;
		    }
		}
		while(flag);
		    
		    		
		
		
		
		/*
		
		int k = 4;
		for(int i=0;i < k;i++){
		    for(int j = 1; j<= k-i;j++){
		        System.out.print(j + " ");
		    }
		    System.out.println();
		}
		
        int rows = 5;

        for (int i = 1; i <= rows; i++) {
            
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }
            
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
int rows = 4;

        for (int i = 1; i <= rows; i++) {
            
            for (int j = 0; j <=rows-i; j++) {
                System.out.print("*");
            }
            System.out.println();
            }
        Scanner r=new Scanner(System.in);
        int n=r.nextInt();
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    if(i==j||i+j==n-1)
                    {
                        System.out.print("*");
                        
                    }
                    else 
                    {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
            
            int rows = 5;

        for (int i = 1; i <= rows; i++) {
            
            for (int j = 1; j <= (rows-i)*2; j++) {
                System.out.print(" ");
            }
            
            for (int k = 1; k <=i ; k++) {
                System.out.print(k+" ");
            
            }
            System.out.println();
        }
       
        int r = 4; 
        int n = 1;

        for (int i = 1; i <= r; i++) {
        for (int j = 1; j <= (r-i)*2; j++) {
                System.out.print("*");
            }
        
            for (int j = 1; j <= i; j++) {
                System.out.print(n +"*");
                n++;
            }
            System.out.println(); 
        }
        int sum=0;
        int r=101;
        //while(i<0)
        for(int i=0;i<r;i++)
        {
            if(i%2==0)
      
            sum+=i;
        }
        System.out.println(sum);

//Digit manipulation
int num=5294;int rev=0;
while(num>0)
{
    int digit =num%10;
    rev=rev*10+digit;
    num/=10;
}
System.out.println(rev);


int num=5294;int rev=0;
while(num>0)
{
    int digit =num%10;
    rev=rev+digit;
    num/=10;
}
System.out.println(rev);
*/
while(num>0)
{
    int digit =num%10;
    rev=rev+digit;
    num/=10;
}
    }
    }