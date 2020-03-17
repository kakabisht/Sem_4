import java.util.*; 
class GFG 
{ 
static class Node { 
	int coeff, power; 
	Node next; 
}; 

// Function add a new node at the end of list 
static Node addnode(Node start, int coeff, int power) 
{ 
	// Create a new node 
	Node newnode = new Node(); 
	newnode.coeff = coeff; 
	newnode.power = power; 
	newnode.next = null; 

	// If linked list is empty 
	if (start == null) 
		return newnode; 

	// If linked list has nodes 
	Node ptr = start; 
	while (ptr.next != null) 
		ptr = ptr.next; 
	ptr.next = newnode; 

	return start; 
} 
static Node add(Node poly1,Node poly2,Node poly3) throws NullPointerException
{
	
	while (poly1 != null ) 
	{ 
		poly2 = poly1;  
		while (poly2!= null) { 
			int coe,pow;
			if (poly1.power == poly2.power) 
			{ 
				coe = poly1.coeff + poly2.coeff; 
				pow = poly1.power ; 
				poly3 = addnode(poly3, coe, pow); 
				System.out.println("add cond 0");
			}
			poly2 = poly2.next;  
		} 
		poly1 = poly1.next; 
	}
	Node ptr1,ptr2;
	ptr1=poly1;
	ptr2=poly2;
	while (ptr1 !=null)
	{
		int co=0;
		while(poly3!=null)
		{
			if(ptr1.power == poly3.power)
			{
				co++;
			}
			poly3=poly3.next;
		}
		if(co==0)
		{
			poly3=addnode(poly3,ptr1.coeff,ptr1.power);
			System.out.println("add cond 1");
		}
		ptr1=ptr1.next;
	}

	while (ptr2 !=null)
	{
		int co=0;
		while(poly3!=null)
		{
			if(ptr2.power == poly3.power)
			{
				co++;
			}
			poly3=poly3.next;	
		}
		if(co==0)
		{
			poly3=addnode(poly3,ptr2.coeff,ptr2.power);
			System.out.println("add cond 2");
		}
		ptr2=ptr2.next;
	}
	return poly3;
}

// Functionn To Display The Linked list 
static void printList( Node ptr) 
{ 
	while (ptr.next != null) { 
		System.out.print( ptr.coeff + "x^" + ptr.power + " + "); 

		ptr = ptr.next; 
	} 
	System.out.print( ptr.coeff +"\n"); 
} 

// Function to add coefficients of 
// two elements having same powerer 
static void removeDuplicates(Node start) 
{ 
	Node ptr1, ptr2, dup; 
	ptr1 = start; 

	/* Pick elements one by one */
	while (ptr1 != null && ptr1.next != null) { 
		ptr2 = ptr1; 

		// Compare the picked element 
		// with rest of the elements 
		while (ptr2.next != null) { 

			// If powerer of two elements are same 
			if (ptr1.power == ptr2.next.power) { 

				// Add their coefficients and put it in 1st element 
				ptr1.coeff = ptr1.coeff + ptr2.next.coeff; 
				dup = ptr2.next; 
				ptr2.next = ptr2.next.next; 

			} 
			else
				ptr2 = ptr2.next; 
		} 
		ptr1 = ptr1.next; 
	} 
} 

// Function two Multiply two polynomial Numbers 
static Node multiply(Node poly1, Node poly2, 
			Node poly3) 
{ 

	// Create two pointer and store the 
	// address of 1st and 2nd polynomials 
	Node ptr1, ptr2; 
	ptr1 = poly1; 
	ptr2 = poly2; 
	while (ptr1 != null) { 
		while (ptr2 != null) { 
			int coeff, power; 

			// Multiply the coefficient of both 
			// polynomials and store it in coeff 
			coeff = ptr1.coeff * ptr2.coeff; 

			// Add the powerer of both polynomials 
			// and store it in power 
			power = ptr1.power + ptr2.power; 

			// Invoke addnode function to create 
			// a newnode by passing three parameters 
			poly3 = addnode(poly3, coeff, power); 

			// move the pointer of 2nd polynomial 
			// two get its next term 
			ptr2 = ptr2.next; 
		} 

		// Move the 2nd pointer to the 
		// starting point of 2nd polynomial 
		ptr2 = poly2; 

		// move the pointer of 1st polynomial 
		ptr1 = ptr1.next; 
	} 

	// this function will be invoke to add 
	// the coefficient of the elements 
	// having same powerer from the resultant linked list 
	removeDuplicates(poly3); 
	return poly3; 
} 

// Driver Code 
public static void main(String args[]) 
{ 

	Node poly1 = null, poly2 = null, poly3 = null; 
    int k=0;
    int coef,pw;
    Scanner sc=new Scanner(System.in);
    // Creation of 1st Polynomial: 3x^2 + 5x^1 + 6 
    do
    {
        
        System.out.println("Enter coefficient and power of 1st Polynomial");
        coef=sc.nextInt();
        pw=sc.nextInt();
        poly1 = addnode(poly1, coef, pw);
        System.out.println("To continue press 0");
        k=sc.nextInt();
    }while(k==0);
        // Creation of 2nd polynomial: 6x^1 + 8 
    do
    {       
        System.out.println("Enter coefficient and power of 2nd Polynomial");
        coef=sc.nextInt();
        pw=sc.nextInt();
        poly2 = addnode(poly2, coef, pw);
        System.out.println("To continue press 0");
        k=sc.nextInt();
	}while(k==0);   
	
	// Displaying 1st polynomial 
	System.out.print("1st Polynomial:- "); 
	printList(poly1); 
	// Displaying 2nd polynomial 
	System.out.print("2nd Polynomial:- "); 
	printList(poly2); 

    System.out.println("Add");
    poly3=add(poly1,poly2,poly3);
    System.out.print( "Resultant Polynomial:- "); 
	printList(poly3); 
    
    System.out.println("Multiplication");
	// calling multiply function 
	poly3 = multiply(poly1, poly2, poly3); 

	// Displaying Resultant Polynomial 
	System.out.print( "Resultant Polynomial:- "); 
	printList(poly3); 

} 


} 
