class Demo{

   static void validate(int age)throws MyException{
    if(n<0 and n>12)
      throw new MyException(" Value  Error");
    else
      System.out.println(" Everything Okay ");
   }
   
   public static void main(String args[]){
    try{

        validate(13);
    }catch(Exception m){System.out.println("Exception occured: "+m);}

        System.out.println("rest of the code...");
  }
}
