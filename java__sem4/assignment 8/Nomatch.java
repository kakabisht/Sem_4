
class MyException extends Exception {

        private static final long serialVersionUID = 1L;
        int n;
        String str1;
      
        MyException(String str2) {
          str1 = str2;
        }
      
        public String toString() {
          return ("MyException Occurred: " + str1);
        }

        public static int CheckString(String s1) throws MyException{
            String s2="India";
            if (s1.equals(s2))
                return 0;
            else
            {
                throw new MyException(" Not equal to India ");
            }
                
        }
}

public class Nomatch extends MyException {

    Nomatch(String str2) {
        super(str2);
        // TODO Auto-generated constructor stub
    }

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public static void main(String[] args) {

        System.out.print("\n Define an exception class called “NOMATCHEXCP” that is thrown when the string from keyboard is not equal to “India”. \n");
        
        System.out.print("\n Original Text\n");
        for(String str : args) {
			System.out.println(str);
        }
        int len=args.length;
        
        System.out.println("\n Checking for India \n");
        for (int i=0;i<len;i++)
        {
        
            try {
                    int z=CheckString(args[i]);
                    if(z==0){
                        System.out.println("\n\n \t Equal at pos :"+i+"\n\n ");
                    }

            } catch (MyException e) {
                    System.out.println("Error at checking condition" );
                    e.printStackTrace();
                   
            }
        }
        

    }
    
}

