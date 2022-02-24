package Assignment1;

import java.io.File;
//use to take inputs
import java.util.Scanner;

// demo class is created
public class Demo{

    private void findFile()
    {

        // address of files or folder where to search
        File file = new File("C:\\Users\\Pulkit Prakash\\IdeaProjects");
        //string to store the name of the file
        String str ;
        //  Scanner is declare
        Scanner in = new Scanner(System.in);
        // do while is used to run the program again and again
        while(true){
            int ab =0;
            System.out.println("ENTER THE NAME OF FILE OR FOLDER");
            //take input
            str =in.nextLine();
            //list of file is stored in string
            String[] files = file.list();
            //continous check each file or folder
            for (String string : files){
                //check the name of file present or not and store in boolean str1
                Boolean str1 = str.equals(string);
                // str1 is true than print the following
                if (str1){
                    ab = 1;
                    System.out.println("File Found : ");
                    System.out.println(string);
                    //print the address of the file
                    System.out.println("Path : "+ file.getAbsolutePath());

                }
            }
            if(ab==1){
                break;
            }
            //if file not found
            if(ab == 0)
            {
                System.out.println("File not find : Reenter the name of the file.");
            }

        }
    }

    //declared main()
    public static void main(String[] args){
        //object of Demo class is created
        Demo obj =new Demo();
        //calling the findFile()
        obj.findFile();
    }
}
