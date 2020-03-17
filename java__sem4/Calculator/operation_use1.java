import java.util.*;
public class operation_use1{
	int j;

	float  input_float(){
		Scanner in = new Scanner(System.in);  
		 System.out.print("Enter a number: ");  
		float x = in.nextFloat();  
		return x;         
	}
	int  input_int(){
		Scanner in_i = new Scanner(System.in);  
		 System.out.print("Enter a number: ");  
		int y = in_i.nextInt();  
		return y;         
	}
	void display(float[] arey , int si){
		for(j=0;j<=si;j++){
			System.out.print("\t"+arey[j]);
		}
	}	
	int  ch(){
		System.out.println("Enter the position you want to perform the function at ");
		int x=input_int();
		return x;
	}

	void  add(Float a,Float b){
		System.out.println(a+b);
	}
	void sub(Float a,Float b){
		System.out.println(a-b);
	}	
	void  mul(Float a,Float b){
		System.out.println(a*b);
	}	
	void div(float a,Float b){
		 float result;
		try{
			 result= a/b;
			 System.out.println("Result ="+ result);	
		}//catch(Exception e) is used for universal exceptions , while catch(Exceptiontype e) is used for a particular error !
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("Error in program!");
		}
	}
	void mod(Float a,Float b){
		float result;
		try{
			 result= a%b;
			 System.out.println("Result ="+ result);	
		}//catch(Exception e) is used for universal exceptions , while catch(Exceptiontype e) is used for a particular error !
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("Error in program!");
		}	
	}
	void St(float a){
		System.out.println("Sqrt is =" +Math.sqrt(a));
	}
	void po(float a,float b){
		System.out.println("power is =" +Math.pow(a,b));
	}
	void mn(float []a){
		float sum_mean=0;
		for (j=0;j<a.length;j++){
			sum_mean+=a[j];
		}
		System.out.println("mean"+(sum_mean)/a.length);
		//float mea;

	}
	void var(){
		System.out.println("Don't know ");
	}
	

	
}
