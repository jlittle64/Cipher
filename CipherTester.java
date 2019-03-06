/**
 * This program tests the CaesarCipher class, which includes 
 * encrypt and decrypt methods.  
 * 
 * @author (Joshua Little) 
 * @version (February 13, 2019)
 */
import java.util.*; 
public class CipherTester
{
    public static void main (String[] args)
    {
        int key;  // key for shift 
        CaesarCipher sender, receiver; // to keep track of sender and receiver objects         
        String plainText, cipherText; // plain text and cipher text messages
        char response; // user response to continue or not 
        Scanner input = new Scanner (System.in); // to read user input

        // display purpose
        System.out.println ("This program tests the CaesarCipher class, "
            + "which includes," ); 
        System.out.println ("encrypt and decrypt methods."); 
        System.out.println (); // print blank line
        System.out.println ("Author: Joshua Little\tVersion: February 13, 2019"); 
        System.out.println (); // print blank line

        // see if user wants to run the program 
        System.out.print ("Want to run? (enter y to run): "); 
        response = input.next().charAt(0); 
        System.out.println (); // print blank line

        // process input if user wishes to continue
        while (response == 'y' || response == 'Y') { 
            // prompt and read a key and plain text message for transmission 
            System.out.println ("Enter non-negative int key "
                + "and input string, all in one line"); 
            key = input.nextInt(); // read int value for key
            plainText = input.nextLine(); // read input string
            System.out.println (); // print blank line
            
            // create sender and receiver                
            sender = new CaesarCipher(key);
            receiver = new CaesarCipher(key);
            
            // sender side processing
            System.out.println ("Input to sender:    " + plainText);
            // Make the sender encrypt plainText and assign the returned String to cipherText
            cipherText = sender.encrypt(plainText);             
            System.out.println ("Output of sender:   " + cipherText); 
            
            // transmisson of encrypted text from sender to receiver
            System.out.println ("Sender transmits encrypted text to receiver"); 
             
            // receiver side processing 
            System.out.println ("Input to receiver:  " + cipherText); 
            // Make the receiver decrypt ciphertext and assign the returned String to plainText
            plainText= receiver.decrypt(cipherText);
            System.out.println ("Output of receiver: " + plainText); 
            
            System.out.println (); // print blank line
            // see if user wants to tun the program 
            System.out.print ("Want to run? (enter y to run): "); 
            response = input.next().charAt(0); 
            System.out.println (); // print blank line
        }
        
        // print closing remarks
        System.out.println ("Program has terminated."); 
        System.out.println (); // print blank line
    }  
}