import java.util.*;

class assignment_1_JP{

    public static void main(String[] args) {
        /* will have to make a command line function for taking inputs from command line again using 
        char ch;
        ch = (char)System.in.read();*/
        System.out.println("Welcome to various methods for taking input ");
        int k=0;
        do
        {
            System.out.println(" \n 1. Scanner class \t 2.BUffered Reader and Input Steam Reader \t 3.Console \t 4.Data Input Stream");
            Scanner scan=new Scanner(System.in);
            int i= scan.nextInt();
            //scan.close();
            switch (i) {
                    case 1:
                    //scanner class
                            scanner_hsb_1 obs = new scanner_hsb_1();
                            obs.scanner_hsb(args[0]);
                        break;
                    case 2:
                        //BUffered reader
                        try {
                            buffered_reader_hsb_1 obh= new buffered_reader_hsb_1();
                            obh.buffered_hsb(args[0]);   
                        } catch (Exception e) {
                            System.out.println("IO Exception in buffered");    
                        }
                        break;
                    case 3:
                        //console
                        try {
                            console_hsb_1 obc = new console_hsb_1();
                            obc.console_hsb(args[0]);
                        } catch (Exception e) {
                            System.out.println("Error in console class");
                        }
                        break;
                    case 4:
                        //Datainput
                        try {
                            data_input_stream_hsb obd = new data_input_stream_hsb();
                            obd.data_input_hsb(args[0]);    
                        } catch (Exception e) {
                            System.out.println("IO Exception");
                        }
                        break;
                    default:
                        break;
                }
            System.out.println(" \n To continue press 0 \n");
            Scanner scan_cho=new Scanner(System.in);
            k= scan_cho.nextInt();
            scan_cho.close();
       

        }while(k==0);

    }

}
