import java.util.*;  

public class LinkedLinkedPolynomialme {
    private Node first = new Node(0, 0);  // sentinel
    private Node last  = first;

    private static class Node {
        int coef;
        int exp;
        Node next;

        Node() {
            this.coef = 0;
            this.exp  = 0;
        }
        Node(int coef, int exp) {
            this.coef = coef;
            this.exp  = exp;
        }
    }

    public LinkedLinkedPolynomialme() {
        last.next = new Node();
        last = last.next;
    }
    public LinkedLinkedPolynomialme(int coef, int exp) {
        last.next = new Node(coef, exp);
        last = last.next;
    }

}  
}  