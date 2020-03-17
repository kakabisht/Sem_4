
public class Polynomial
{
    // instance variables
    private Node head;

    /**
     * A polynomial object with zero terms.
     */
    public Polynomial()
    {

    }
    /**
     * Creates a new polynomial from an existing polynomial.
     * @param oldPoly Existing polynomial.
     */
    public Polynomial(Polynomial oldPoly)
    {
        Polynomial newPoly = new Polynomial(oldPoly);
    }
    /**
     * Creates a Term and places it in its proper position in
     * the linked list.
     * @param coefficient The coefficient of a term.
     * @param exponent The exponent of a term.
     */
    public void addTerm( int coefficient, int exponent )
    {
        // create an instance of a term with the coefficient and exponent
        Node newNode = new Node ( new Term (coefficient, exponent));

        if (this.head == null)   // if no pointer to a node
        {
            this.head = newNode;  // insert term into a new node
            this.head = lastNode(); // the first node is the last node
            return;
        }
        else    // otherwise insert next node to next position
        {
            lastNode().next = newNode;
        }
    }
    /**
     * Computes and returns the sum of the current polynomial with the
     * parameter polynomial.
     * @param p A polynomial.
     * @return The sum of both polynomials.
     */
    public Polynomial polyAdd( Polynomial p )
    {
        Polynomial poly = new Polynomial();

        Node temp = head;   // point to first node

        while ( temp != null)  // while temp is not pointing to null
        {
            Node pTemp = p.head;    // a node for the head of polynomial p

            while ( pTemp != null)  // while p is not pointing to null
            {
                // add new term with sum of coefficients containing the same exponent

                if ( pTemp.head.getExponent() == temp.head.getExponent())   // do they share the same exponent?
                {
                    Node temPoly = poly.head;   // set a pointer to the first node on poly
                    while ( temPoly != null)    // while there are terms in the new polynomial
                    {
                        //  if exponents are the same
                        if ( pTemp.head.getExponent() == temPoly.head.getExponent()) {

                            // set term with coefficient sum
                            temPoly.head.setCoefficient(poly.head.head.getCoefficient() + pTemp.head.getCoefficient());
                        }
                        break;
                    }
                    // add term with sum of coefficients
                    poly.addTerm(pTemp.head.getCoefficient() + temp.head.getCoefficient(),
                            temp.head.getExponent());
                }
                pTemp = pTemp.next; // next node on p
            }

            temp = temp.next;    // move onto to the next node
        }

        // Now check that terms are not repetitive on new polynomial...
        // compare with original polynomial

        temp = head;    // point to first node ( first pointer )
        Node other = head;  // point to first node ( second pointer )

        while ( temp != null)   // while temp is not pointing to null
        {
            // point to the first node on poly
           Node polyTemp = poly.head;

           while ( polyTemp != null)    // while poly is not pointing to null
           {
               // compare exponents on all terms
               if (temp.head.getExponent() != polyTemp.head.getExponent()
                       && temp.head.getExponent() != other.head.getExponent()
                       && temp.head.getExponent() != other.next.head.getExponent())
               {
                   // add the coefficients if alike exponents
                   poly.addTerm(temp.head.getCoefficient(), temp.head.getExponent());

                   break;   // leave when condition met
               }
               polyTemp = polyTemp.next;    // move onto next node
           }
            temp = temp.next;   // move to next node
        }

        // now compare poly with polynomial p for repetitive terms

        // set a pointer to the first node on p
        Node pTemp = p.head;

        // update other pointer as well
        other = head;

        while ( pTemp != null)  // while not pointing to null
        {
            // point to first node
            Node polyTemp = poly.head;

            while ( polyTemp != null)   // while not pointing to null
            {
                // compare exponents
                if (pTemp.head.getExponent() != polyTemp.head.getExponent()
                        && pTemp.head.getExponent() != other.head.getExponent()
                        && pTemp.head.getExponent() != other.next.head.getExponent())
                {
                    // if alike exponents, add coefficients
                    poly.addTerm(pTemp.head.getCoefficient(), pTemp.head.getExponent());

                    break;  // leave when condition met
                }
                polyTemp = polyTemp.next; // move to next node
            }
            pTemp = pTemp.next; // move to next node
        }

        return poly;    // return the sum of both polynomials;
    }

    /**
     * Computes and returns the product of the current polynomial with the
     * parameter polynomial.
     * @param p A polynomial.
     * @return The product of both polynomials as a polynomial.
     */
    public Polynomial polyMultiply ( Polynomial p )
    {
        Polynomial poly = new Polynomial(); // instance of a polynomial

        Node temp = head;   // a node in the place of the head

        while ( temp != null)  // while temp is not pointing to null
        {
            Node pTemp = p.head;    // a node for the head of polynomial p

            while ( pTemp != null)  // while ptemp is not pointing to null
            {
                // add new term with the product of each coefficient and the sum of
                // each exponent

                poly.addTerm(temp.head.getCoefficient() * pTemp.head.getCoefficient(),
                        temp.head.getExponent() + pTemp.head.getExponent());

                pTemp = pTemp.next; // next node on p
            }

            temp = temp.next;    // move onto to the next node
        }

        return poly;    // return the sum of both polynomials;
    }
    /**
     * An overridden toString method that returns a String representation of
     * a polynomial as a sum of terms. For example a polynomial would
     * have this String representation: 3x^2 + 48x^4 + x^6
     * @return A string representation of a polynomial as a sum of terms.
     */
    @Override
    public String toString()
    {

        String s = "" ;
        Node temp = head ; 				// start at head of list

        if (temp == null)   // if null
        {
            s = "null"; // print null
        }
        else {
            while (temp != null)            // while more nodes on list...
            {
                if (temp.head.getCoefficient() == 1)    // if coefficient is 1
                {
                    // ...append current obj excluding the 1
                    s += "x^" + temp.head.getExponent();

                    // ...and move to next node
                    temp = temp.next;
                } else {  //..otherwise
                    // ...append current obj
                    s += temp.head.getCoefficient() + "x^" + temp.head.getExponent();

                    // ...and move to next node
                    temp = temp.next;
                }
                if (temp != null)  // add a (+) before each term
                {
                    s += " + ";
                }
            }
        }
        return s + "\n" ;
    }
    /**
     * Returns the last node on the list.
     * @return The last node on the list.
     */
    public Node lastNode()
    {
        if (head == null)				// if list empty...
            return null ;					// ...return null pointer
        else 							// else, get pointer to last node
        {
            Node temp = head ;			// ...start at head of list
            while (temp.next != null) 	// ...while not at last node...
                temp = temp.next ;			// ......move to next node
            return temp ;					// ...return pointer to last node
        }
    }
}

/**
 * Represents a node that extends Term.java.
 */
class Node<E extends Term>
{
    // each Node stores an object of a class to be determined later...
    E head ;

    Node next ;		// ...including a pointer to another node

    /**
     * Node constructor takes one param of class E.
     * @param x The parameter of type E.
     */
    public Node (E x)		//
    {
        // set info portion to parameter passed
        head = x ;
    }
} // end of Node class definition