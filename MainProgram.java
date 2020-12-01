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

}
