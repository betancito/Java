import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Password validator
//        System.out.println("Hello and welcome to the password validator. next up type your password below to check if its secure");
//        String pass = scanner.next();
//        scanner.close();
//        boolean length  = false;
//        boolean hasUpperCase = false;
//        boolean hasLowerCase = false;
//        boolean hasSpecialChar = false;
//
//        if (pass.length() < 8) {
//            length = false;
//        }else{
//            length = true;
//        }
//        for (char c : pass.toCharArray()) {
//            if (Character.isUpperCase(c)){
//                hasUpperCase = true;
//            }else if (Character.isLowerCase(c)){
//                hasLowerCase = true;
//            }else if (!Character.isLetterOrDigit(c)){
//                hasSpecialChar = true;
//            }
//        }
//        if (length==true&&hasUpperCase==true&&hasLowerCase==true&&hasSpecialChar==true){
//            System.out.println("Your password is valid");
//        }else{
//            System.out.println("Your password is invalid");
//        }

        //Char checker
//        System.out.println("Hello and welcome to the Character checker, next up type a character we'll validate if it's either \na vocal, a consonant or an special character");
//        String newChar = scanner.next().toLowerCase();
//        String vocals = ("aeiou");
//        String consonants = ("bcdfghjklmnpqrstvwxyz");
//        boolean isVocal=false;
//        boolean isConsonant=false;
//        boolean isSpecial=false;
//        for (char c : newChar.toCharArray()) {
//            if (vocals.contains(String.valueOf(c))) {
//                isVocal = true;
//            } else if (consonants.contains(String.valueOf(c))) {
//                isConsonant = true;
//            } else if (!Character.isLetterOrDigit(c)) {
//                isSpecial = true;
//            }
//        }
//        if (isVocal==true){
//            System.out.println("This is a Vocal");
//        } else if (isConsonant==true){
//            System.out.println("This is a Consonant");
//        }else if (isSpecial==true){
//            System.out.println("This is an Special character");
//        }else{
//            System.out.println("enter a valid character");
//        }

        //Rock paper scissors
//        System.out.println("Hello and welcome to the app to play rock paper scissors");
//        System.out.println("next up choose your option by typing 'rock', 'paper' or 'scissors'");
//        String Playerop = scanner.nextLine().toLowerCase();
//        String[] options = {"rock", "paper", "scissors"};
//        int random = (int)(Math.random()*3);
//        String Computerop = options[random];
//        if (Playerop.equals(Computerop)){
//            System.out.println("it's a tie :0 !");
//            System.out.println("the computer chosen " + Computerop);
//        } else if ((Playerop.equals("rock") && Computerop.equals("scissors")) ||
//                (Playerop.equals("paper") && Computerop.equals("rock")) ||
//                (Playerop.equals("scissors") && Computerop.equals("paper"))) {
//            System.out.println("You Win c: !");
//            System.out.println("the computer chosen " + Computerop);
//        }else {
//            System.out.println("You Lose :c !");
//            System.out.println("the computer chosen " + Computerop);
//        }
        //Age Calculator
//        System.out.println("Hello and welcome to the app where you can type your age to know if you're an adult already");
//        System.out.println("Next up please provide your birth date in the following format dd/MM/yyyy");
//        String DobStr = scanner.next();
//
//        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//        LocalDate DOB = LocalDate.parse(DobStr, fmt);
//        LocalDate hoy = LocalDate.now();
//
//        Period period = Period.between(DOB, hoy);
//        int age = period.getYears();
//
//        System.out.println("your age is: " + age);
//
//        if (age >= 18) {
//            System.out.println("You're an adult");
//        } else {
//            System.out.println("You're a minor");
//        }
        //Caesar  Method
        //Not finished yet, stuck in the process to be sincere
//        System.out.println("Hello and welcome to the message encryption application");
//        for (int i = 0; i < 50; i++) {
//            int jumps =5;
//            System.out.println("please select what you want to do: \n0. Set a new amount of jumps \n1. encrypt\n2. decrypt \n3. exit \n(ツ)_/¯");
//            int choice = scanner.nextInt();
//            if (choice == 0) {
//                System.out.println("Please enter the amount of jumps for the encryption");
//                jumps = scanner.nextInt();
//            } else if (choice == 1) {
//                System.out.println("Please enter your message to encrypt: ");
//                String message = scanner.next().toLowerCase();
//                StringBuilder encryptedMessage = new StringBuilder();
//                String alphabet = "abcdefghijklmnopqrstuvwxyz";
//                for (int e = 0; e < message.length(); e++) {
//                    char currentChar = message.charAt(e);
//                    int charPosition = alphabet.indexOf(currentChar);
//                    int keyVal = (jumps + charPosition) % 26;
//                    char replaceVal = alphabet.charAt(keyVal);
//                    encryptedMessage.append(replaceVal);
//                }
//
//                System.out.println(encryptedMessage);
//                i=0;
//            } else if (choice == 2) {
//            System.out.println("Please enter your message to encrypt: ");
//            String message = scanner.next().toLowerCase();
//            StringBuilder decryptedMessage = new StringBuilder();
//            String alphabet = "abcdefghijklmnopqrstuvwxyz";
//                for (int a = 0; a < message.length(); a++) {
//                    char currentChar = message.charAt(a);
//                    int charPosition = alphabet.indexOf(currentChar);
//                    int keyVal = (jumps - charPosition) % 26;
//                    if (keyVal < 0) {
//                        keyVal += 26; // Handle negative values
//                    }
//                    char replaceVal = alphabet.charAt(keyVal);
//                    decryptedMessage.append(replaceVal);
//                }
//                System.out.println(decryptedMessage);
//                i=0;
//            }else if (choice == 3) {
//                System.out.println("Thank you for using the encryption application");
//                i=50;
//            }
//        }

    }
}