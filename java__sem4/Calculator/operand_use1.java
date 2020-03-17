import java.util.*;

class operand_use1{
	public static void main(String[] args){
		operation_use1 obj =new operation_use1();
		System.out.println("welcome to calculator by kaka ");
		int k=0;
		int i=0;
		float [] Arey = new float[20];
		do{

			System.out.println(" \n 0.Input numbers \t 1.Display the current list \t 2.Add \t 3.Sub \t 4.Div \t 5.Mod \t 6.Mod \t 7.Mean \t 8.Sqrt \t 9.power \t 10.Varience ");
			int choice=obj.input_int();
			int pos1,pos2;
			switch (choice) {
				case 0:
					Arey[i]=obj.input_float();
					i++;
					break;
				case 1:
					obj.display(Arey,i);
					break;
				case 2:
					obj.display(Arey,i);	
					System.out.println("Enter the first postion ");
					pos1=obj.ch();
					System.out.println("Enter the second postion ");
					pos2=obj.ch();
					obj.add(Arey[pos1],Arey[pos2]);
					break;
				case 3:
					obj.display(Arey,i);
					System.out.println("Enter the first postion ");
					pos1=obj.ch();
					System.out.println("Enter the second postion ");
					pos2=obj.ch();
					obj.sub(Arey[pos1],Arey[pos2]);
					break;
				case 4:
					obj.display(Arey,i);
					System.out.println("Enter the first postion ");
					pos1=obj.ch();
					System.out.println("Enter the second postion ");
					pos2=obj.ch();
					obj.mul(Arey[pos1],Arey[pos2]);
					break;
				case 5:
					obj.display(Arey,i);
					System.out.println("Enter the first postion ");
					pos1=obj.ch();
					System.out.println("Enter the second postion ");
					pos2=obj.ch();
					obj.div(Arey[pos1],Arey[pos2]);
					break;
				case 6:
					obj.display(Arey,i);
					System.out.println("Enter the first postion ");
					pos1=obj.ch();
					System.out.println("Enter the second postion ");
					pos2=obj.ch();
					obj.mod(Arey[pos1],Arey[pos2]);
					break;
				case 7:
					obj.mn(Arey);
					break;	
				case 8:
					System.out.println("Enter the first postion ");
					pos1=obj.ch();
					obj.St(Arey[pos1]);
					break;
				case 9:
					System.out.println("Enter the first postion ");
					pos1=obj.ch();
					System.out.println("Enter the second postion ");
					pos2=obj.ch();
					obj.po(Arey[pos1],Arey[pos2]);
					break;
				case 10:
					obj.var();
					break;
				default:
					break;
			}
			
		}while(k==0);
	}
}
