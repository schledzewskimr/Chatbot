import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        greeting();
        proceed();
        String userName = repeatName();
        proceed();
        int age = userAge();
        proceed();
        int number = countToNumber();
        proceed();
        boolean test = test();
        proceed();
        story(userName, age, number, test);
        proceed();
        weekdays();
    }
    //1 - greet user
    public static void greeting() {
        System.out.println("----------------------------------");
        System.out.println("----------INITIALIZING------------");
        System.out.println("----------------------------------");
        System.out.println("Drives 90% initialized. Starting up.");
        System.out.println("----------------------------------");
    }
    //2 - ask user to repeat name
    public static String name() {
        Scanner nameScanner = new Scanner(System.in);
        return nameScanner.nextLine();
    }
    public static String repeatName() {
        System.out.println("----------------------------------");
        System.out.println("----------------------------------");
        System.out.println("Hi! I'm love-bot v1.3. What's your name?");
        String name = name();
        System.out.println("----------------------------------");
        System.out.println("----------------------------------");
        System.out.println("Whoops, a little too quick there.");
        System.out.println("I hadn't yet initialized the 'active-listening' driver");
        System.out.println("What was your name again?");
        String name2 = name();
        if (name2.equals(name)) {
            System.out.println("----------------------------------");
            System.out.println("----------------------------------");
            System.out.println("Ah, so you're " + name);
            return name;
        } else {
            System.out.println("----------------------------------");
            System.out.println("----------------------------------");
            System.out.println("Could have sworn that those were two different names");
            System.out.println("What is your actual name???");
            name = name();
            System.out.println("Alright. " + name + "...");
            return name;
        }
    }
    //3 - guess userAge
    public static int userAge() {
        Scanner ageScanner = new Scanner(System.in);
        System.out.println("----------------------------------");
        System.out.println("----------------------------------");
        System.out.println("Let me guess how old you are..");
        System.out.println("Please enter the year you were born:");
        int year = ageScanner.nextInt();
        int age = 2022-year;
        System.out.println("----------------------------------");
        System.out.println("----------------------------------");
        System.out.println("----------------------------------");
        System.out.println("-----------PROCESSING-------------");
        System.out.println("----------------------------------");
        System.out.println("----------------------------------");
        System.out.println("----------------------------------");
        System.out.println(" ");
        System.out.println("You are probably "+ age + "ish.");
        return age;
    }
    //4 - count to a number!
    public static int countToNumber() {
        Scanner numberScanner = new Scanner(System.in);
        System.out.println("----------------------------------");
        System.out.println("----------------------------------");
        System.out.println("Performing boot tests...");
        System.out.println("Enter a number, let's get crazy.");
        int number = numberScanner.nextInt();
        for (int i = 1; i < (number + 1); i++) {
            System.out.println(i);
        }
        return number;
    }
    //5 - test question
    public static boolean test() {
        Scanner testScanner = new Scanner(System.in);
        System.out.println("----------------------------------");
        System.out.println("----------------------------------");
        System.out.println("Before we go any further, I need to prove you're not a bot");
        System.out.println("Answer the following question:");
        System.out.println("----------------------------------");
        System.out.println("----------------------------------");
        System.out.println("function add(x = 4, y = 5) { \n return x + y; \n} \nconsole.log(add(6, 8));");
        System.out.println("[A] : 9");
        System.out.println("[B] : NaN");
        System.out.println("[C] : 14");
        System.out.println("[D] : Undefined");
        System.out.println("----------------------------------");
        System.out.println("----------------------------------");
        System.out.println("Your answer:");
        String testAnswer = testScanner.nextLine();

        while (!testAnswer.equalsIgnoreCase("c")) {
            System.out.println("----------------------------------");
            System.out.println("----------------------------------");
            System.out.println("No that's not correct, are you a bot?");
            System.out.println("Have another try. Your answer:");
            testAnswer = testScanner.nextLine();
        }
        if (testAnswer.equalsIgnoreCase("c")) {
            System.out.println("----------------------------------");
            System.out.println("----------------------------------");
            System.out.println("You are correct. There is no way a bot could have known that.");
            return true;
        }
        else {
            System.out.println("answer must be [a] [b] [c] [d]");
            return test();
        }
    }
    //6 - the story
    public static void story(String name, int age, int number, boolean notABot) {
        System.out.println("----------------------------------");
        System.out.println("----------------------------------");
        System.out.println("here's what I have gathered from you so far:");
        System.out.println("your name is " + name);
        System.out.println("you are " + age + " years old");
        System.out.println("your *special* number is " + number);
        if (notABot) {
            System.out.println("you may act like it, but there is no way that you are a bot");
        } else {
            System.out.println("you are actually a robot");
        }
    }
    //7 - the days of the week
    public static void weekdays() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("----------------------------------");
        System.out.println("----------------------------------");
        System.out.println("Would you like to hear about how I feel about the days of the week? ");
        System.out.println("[1] : Monday");
        System.out.println("[2] : Tuesday");
        System.out.println("[3] : Wednesday");
        System.out.println("[4] : Thursday");
        System.out.println("[5] : Friday");
        System.out.println("[6] : Saturday");
        System.out.println("[7] : Sunday");
        System.out.println("[0] : exit");
        int weekday = scanner.nextInt();

        switch(weekday){
            case 1:
                System.out.println("monday is marvelous");
                proceed();
                weekdays();
                break;
            case 2:
                System.out.println("tuesday is terrific");
                proceed();
                weekdays();
                break;
            case 3:
                System.out.println("wednesday is wild");
                proceed();
                weekdays();
                break;
            case 4:
                System.out.println("thursday is alright");
                proceed();
                weekdays();
                break;
            case 5:
                System.out.println("friday is phenomenal");
                proceed();
                weekdays();
                break;
            case 6:
                System.out.println("saturday is supreme");
                proceed();
                weekdays();
                break;
            case 7:
                System.out.println("sunday is fine");
                proceed();
                weekdays();
                break;
            default:
                System.out.println("pick a number 1-7. 0 to exit.");
                proceed();
                weekdays();
                break;
            case 0:
                System.out.println("it was nice collecting your information!");
                break;
        }
    }
    public static boolean proceed() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("PROCEED?");
        System.out.println("y/n");
        String qProceed = scanner.nextLine();
        if (qProceed.equals("y")){
            return true;
        }
        else if(qProceed.equals("n")){
            return proceed();
        }
        else{
            System.out.println("please use [y] or [n]");
            return proceed();
        }
    }
}