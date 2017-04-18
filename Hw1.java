//Iris Osegueda

import javax.swing.*;

public class Hw1
{
	public static void main( String[] args )
	{
		int age1, age2;
        String fname1, fname2, lname1, lname2;

        fname1 = JOptionPane.showInputDialog ( "Please enter first person's first name. " );
        lname1 = JOptionPane.showInputDialog ( "Please enter first person's last name. " );
        age1 = Integer.parseInt(JOptionPane.showInputDialog("Please enter first person's age. ")) ;

        fname2 = JOptionPane.showInputDialog ( "Please enter second person's first name. " );
        lname2 = JOptionPane.showInputDialog ( "Please enter second person's last name. " );
        age2 = Integer.parseInt(JOptionPane.showInputDialog("Please enter second person's age. ")) ;

        String message = "";

        message = message + "First person: " + lname1 + ", " + fname1 + " ( " + age1 + " ) ";
        message = message + "\nSecond person: " + lname2 + ", " + fname2 + " ( " + age2 + " )";

        if ( age1 > age2 )
            message = message + "\n" + lname1 + " is older than " + lname2 ;
        else if (age1 == age2)
            message = message + "\n" + lname1 + " is of the same age as " + lname2 ;
        else
            message = message + "\n" + lname1 + " is younger than " + lname2 ;

        JOptionPane.showMessageDialog( null, message );

        System.exit ( 0 );
	}
}