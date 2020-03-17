class thisprac1{

    int id;
    String name;

    thisprac1( int id1,String na){

        id=id1;
        name=na;
    }
    void display (thisprac1 obj)
    {
        System.out.println("Id "+this.id+"name"+this.name);
        
        System.out.println("Id "+obj.id+"name"+obj.name);
    }

    public static void main(String[] args) {

        thisprac1 s1=new thisprac1(101, "ka");
        //s1.display();
        thisprac1 s2=new thisprac1(102, "ku");
      //  s1.display();
        s2.display(s1);
    }
}