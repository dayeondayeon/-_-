import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        MainProgram mainProgram = new MainProgram();
        mainProgram.printBanner();
        while (true) {
            int studentID = mainProgram.receiveStudentID();
            mainProgram.runModule(studentID);
        }
    }

    public void printBanner() {
        System.out.println("[2020-Fall Software Engineering]");
        System.out.println("Simple Software Development Project");
        System.out.println();
    }

    public int receiveStudentID() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a student ID: ");
        return input.nextInt();
    }

    public void runModule(int studentID) {
        if (studentID == 11530)
            System.out.println("No. It is the professor ID.\n");
        
        else if (studentID == 1813545) {
        	printInitialScreen_1813545();
        }
        
        else if(studentID==1812284){
		calculate_1812284();
        }
        else if(studentID==1812967) {
        	InitialScreen_1812967();
        }
        
        else if(studentID == 1813592) {
        	print_1813592_screen();
        }
    }

    private void calculate_1812284() {
        boolean loop=true;
        int select;
        Scanner menu=new Scanner(System.in);
        while(loop) {
                System.out.println("[Student ID: 1812284]");
                System.out.println("1. Calculate Minimum Number\n2. Calculate Maximum Number\n");
                System.out.print("Enter menu number: ");
                select=menu.nextInt();
                if(select==1) {
                        int []array;
                        Scanner numbers=new Scanner(System.in);
                        System.out.print("How many numbers do you want to calculate minimum number? : ");
                        int num=numbers.nextInt();
                        array=new int[num];
                        System.out.print("Insert "+num+" numbers : ");
                        for(int i=0;i<num;i++)
                                array[i]=numbers.nextInt();
                        int min=getMinimum_1812284(array);
                        System.out.println("The smallest number from your insertion is "+min+".");
                        loop=false;
                        System.out.println("\nEnd the minimum calculate");
                }

                else if(select==2) {
                        int []array;
                        Scanner numbers=new Scanner(System.in);
                        System.out.print("How many numbers do you want to calculate maximum number? : ");
                        int num=numbers.nextInt();
                        array=new int[num];
                        System.out.print("Insert "+num+" numbers : ");
                        for(int i=0;i<num;i++)
                                array[i]=numbers.nextInt();
                        int max=getMaximum_1812284(array);
                        loop=false;
                        System.out.println("The smallest number from your insertion is "+max+".");
                        System.out.println("\nEnd the maximum calculate");
                }

                else {
                        System.out.println("Select correct menu");
                }
        }
    }

    public static int getMinimum_1812284(int []array) {
        int num=0;
        int min=array[0];
        for(int i=1; i<array.length;i++) {
                num=array[i];
                min=(num<min)?num:min;
        }
        return min;
    }

    public static int getMaximum_1812284(int []array) {
        int num=0;
        int max=array[0];
        for(int i=1; i<array.length;i++) {
                num=array[i];
                max=(num>max)?num:max;
        }
        return max;
    }
    
    
    public void printInitialScreen_1813545() {
    	int input = 0;
    	float num = 0;
    	float result = 0;
    	
    	input = selectMenu_1813545();
    	
    	if (input == 1 || input == 2) {
    		num = inputNumber_1813545();
    		
    		if (input == 1) 
        		result = calCeil_1813545(num);
    		
    		else if (input == 2) 
        		result = calFloor_1813545(num);
    		
    		printResult_1813545(result);
    	}
    	
    	else {
    		System.out.println("This number does not exist. Please choose 1 or 2.\n");
    	}
    }
    
    public int selectMenu_1813545() {
    	int input = 0;
    	
    	System.out.println("[Student ID: 1813545]");
    	System.out.println("1. Calculate ceil of a number");
    	System.out.println("2. Calculate floor of a number");
    	
    	Scanner scan = new Scanner(System.in);
    	System.out.print("Enter menu number: ");
    	input = scan.nextInt();

    	return input;
    }
    
    public float inputNumber_1813545() {
    	float num = 0;
    	Scanner scan = new Scanner(System.in);
    	
    	System.out.print("enter a number to calculate: ");
    	num = scan.nextFloat();

    	return num;
    }
    
    public void printResult_1813545(float result) {
    	System.out.println("The result of the calculation is " + result + "\n");
    }
    
    public float calCeil_1813545(float n) {
    	if (n == (int)n) 
    		return (int)n;
    	
    	if (n >= 0) 
    		return (int)(n+1);
    	
    	else 
    		return (int)n;
    }
    
    public float calFloor_1813545(float n) {
    	if (n == (int)n)
    		return (int)n;
    	
    	if (n >= 0)
    		return (int)n;
    	
    	else 
    		return (int)(n-1);
    }
    
    public void InitialScreen_1812967() {    	
    	System.out.println("[Student ID: 1812967]");
    	System.out.println("1. Calculate maximum of numbers");
    	System.out.println("2. Calculate absolute value of a number");
    	
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter menu number: ");
    	while(true) {
    		int Menu = sc.nextInt();
    		if(Menu == 1) {
    			int num1, num2;
    			System.out.print("Enter two integers: ");
    			num1 = sc.nextInt();
    			num2 = sc.nextInt();
    			System.out.println("The maximum is "+Max(num1, num2)+".");
    			break;    			
    		}else if(Menu==2) {
    			int num;
    			System.out.print("Enter one integer: ");
    			num = sc.nextInt();
    			System.out.println("The absolute value is "+Abs(num)+".");
    			break;
    		}else {
    			System.out.println("Select the appropriate menu.");
    			System.out.print("Enter menu number: ");
    		}
    	}
    }
    public int Max(int a, int b) {
    	if(a>=b) {
    		return a;
    	}else {
    		return b;
    	}
    }
    public int Abs(int a) {
    	if(a>=0) {
    		return a;
    	}
    	else {
    		return (-1)*a;
    	}
    }

    public void print_1813592_screen() {
    	Scanner scanner = new Scanner(System.in);
    	int choice;
    	
    	System.out.println("[Student ID: 1813592]");
    	System.out.println("1. Calculate Factorial");
    	System.out.println("2. Calculate Absolute value");
    	System.out.print("Enter menu number: ");
    	choice = scanner.nextInt();
    	calculate_1813592(choice);
    }
    
    public int calculate_1813592(int choice) {
    	Scanner scanner = new Scanner(System.in);
    	int number;
    	
    	System.out.print("Enter the number for calculation: ");
    	number = scanner.nextInt();
    	if(choice == 1) {
    		System.out.println("Factorial result : " + factorial_1813592(number));
    	}
    	else if(choice == 2) {
    		System.out.println("Absolute Value result : " + absolutevalue_1813592(number));
    	}
    	else {
    		System.out.println("Please choose correct menu");
    	}
    }
    
    public int factorial_1813592(int number) {
    	if(number > 1) {
    		return number * factorial_1813592(number-1);
    	}
    	else { 
    		return 1;
    	}
    }
    
    public int absolutevalue_1813592(int number) {
    	if(number == 0) {
    		return 0;
    	}
    	else if(number > 0) {
    		return number;
    	}
    	else {
    		return (0-number);
    	}		 		
    }
}
