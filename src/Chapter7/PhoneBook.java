package Chapter7;

import java.util.Scanner;

public class PhoneBook {

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }

    private static void menu() {
        System.out.println("""
                select an option
                    1: Phone book
                    2: Messages
                    3: Charts
                    4: Call register
                    5: Tones
                    6: Settings
                    7: call divert
                    8: Games
                    9: Calculator
                    10: Reminders
                    11: Clock
                    12:Profiles
                    13: Sim Services
                """);
        System.out.println("""
                select an option from phone Setting
                1.Call Settings
                2.phone settings
                3.security settings
                4.Restore factory settings
                """);
        System.out.println("Enter Menu of phone settings 1-4: ");
        int menu1 = input.nextInt();
        switch (menu1){
            case 1:
                callSettings();
                break;
            case 2:
                phoneSettings();
                break;
            case 3:
                securitySettings();
                break;
            case 4:
                restoreFactorySettings();
                break;
        }

        System.out.print("Enter your Menu:1-14 ");
        int menu = input.nextInt();
        switch (menu) {
            case 1:
                phoneBook();
                break;
            case 2:
                messages();
                break;
            case 3:
                System.out.println("chat");
                break;
            case 4:
                callRegister();
                break;
            case 5:
                tones();
                break;
            case 6:
                settings();
                break;
            case 7:
                callDivert();
                break;
            case 8:
                games();
                break;
            case 9:
                calculator();
                break;
            case 10:
                reminder();
                break;
            case 11:
                clock();
                break;
            case 12:
                profiles();
                break;
            case 13:
                simServices();
                break;
            case 14:
                callSettings();
                break;
        }
    }

    public static void phoneBook() {
        System.out.println("""
                select numbers:
                1.Search
                2.Service Nos
                3.Add name
                4.Erase
                5.Edit
                6.Assign tone
                7.Send b'card
                8.option
                9.speed dial
                10.voice tags
                """);
        System.out.println("Enter Your Menu phone:1-10 ");
        int phoneBook = input.nextInt();

        switch (phoneBook) {
            case 1:
                System.out.println("search");
                break;
            case 2:
                System.out.println("service Nos");
                break;
            case 3:
                System.out.println("Add Name");
                break;
            case 4:
                System.out.println("Erase");
                break;
            case 5:
                System.out.println("Edit");
                break;
            case 6:
                System.out.println("Assign tone");
                break;
            case 7:
                System.out.println("send b'card");
                break;
            case 8:
                option();
            case 9:
                System.out.println("speed  dials");
                break;
            case 10:
                System.out.println("voice tags");
                break;

        }
    }

    public static void option() {
        System.out.println("""
                1. Type of view
                2. memory status
                 """);
        System.out.println("Enter  phone button 1 or 2: ");
        int option = input.nextInt();
        switch (option) {
            case 1:
                System.out.println("Type of view");
                break;
            case 2:
                System.out.println("Memory status");
                break;

        }
    }

    public static void messages() {
        System.out.println("""
                1. write messages
                2. inbox
                3. out Box
                4. picture messages
                5. templates
                6.smileys
                7. messages settings
                8. info service
                9. voice mailbox number
                10. service command editor
                """);
        System.out.println("Enter phone button 1-7");
        int messages = input.nextInt();
        switch (messages) {
            case 1:
                System.out.println("Write messages");
                break;
            case 2:
                System.out.println("inbox");
                break;
            case 3:
                System.out.println("outbox");
                break;
            case 4:
                System.out.println("picture messages");
                break;
            case 5:
                System.out.println("templates");
                break;
            case 6:
                System.out.println("smileys");
                break;
            case 7:
                messagesSetting();
                break;


        }
    }

    public static void messagesSetting() {
        System.out.println("""
                1. Set 1
                2. Common
                """);
        System.out.println("Enter phone button 1-2: ");
        int messagesSetting = input.nextInt();
        switch (messagesSetting) {
            case 1:
                set1();
                break;
            case 2:
                common();
                break;
        }
    }

    public static void set1() {
        System.out.println("""
                1. Messages center number
                2. Messages sent as
                3. Messages validity
                """);
        System.out.println("Enter phone button 1-3: ");
        int set1 = input.nextInt();
        switch (set1) {
            case 1:
                System.out.println("Messages center number");
                break;
            case 2:
                System.out.println("Messages sent as");
                break;
            case 3:
                System.out.println("validity");
                break;
        }
    }

    public static void common() {
        System.out.println("""
                1. Delivery reports
                2. Reply via same centre
                3. Character support
                """);
        System.out.println("Enter phone button 1-3");
        int common = input.nextInt();
        switch (common) {
            case 1:
                System.out.println("Delivery report");
                break;
            case 2:
                System.out.println("Reply via same center");
                break;
            case 3:
                System.out.println("Character support");
                break;
        }
    }

    public static void callRegister() {
        System.out.println("""
                1. Missed calls
                2. Receive calls
                3. Dialled numbers
                4. Erase recent call lists
                5. Show call duration
                """);
        System.out.println("Enter phone button 1-5: ");
        int callRegister = input.nextInt();
        switch (callRegister) {
            case 1:
                System.out.println("Missed calls");
                break;
            case 2:
                System.out.println("Receive calls");
                break;
            case 3:
                System.out.println("Dialled numbers");
                break;
            case 4:
                System.out.println("Erase recent call list");
                break;
            case 5:
                showCallDuration();
                break;
        }
    }

    public static void  showCallDuration(){
        System.out.println("""
                1. Last call duration
                2. All calls duration
                3. Received calls' duration
                4. Dialled calls' duration
                5. Clear timers
                """);
        System.out.println("Enter phone button 1-5: ");
        int showCallDuration = input.nextInt();
           switch (showCallDuration){
               case 1:
                   System.out.println("Last call duration");
                   break;
               case 2:
                   System.out.println("All calls duration");
                   break;
               case 3:
                   System.out.println("Receive calls' duration");
                   break;
               case 4:
                   System.out.println("Dialled call's duration");
                   break;
               case 5:
                   System.out.println("Clear Timers");
                   break;
           }
    }
    public static void tones(){
        System.out.println("""
                1. Ringing tone
                2. Ringing volume
                3. Incoming call alert
                4. Composer
                5. Message alert tone
                6. keypad tones
                7. Warning and Game tone
                8. Vibrating alert
                9. Screen saver
                """);
        System.out.println("Enter phone button 1-9: ");
        int tones = input.nextInt();
        switch (tones){
            case 1:
                System.out.println("Ringing tones");
                break;
            case 2:
                System.out.println("Ringing Volume");
                break;
            case 3:
                System.out.println("Incoming call alert");
                break;
            case 4:
                System.out.println("Composer");
                break;
            case 5:
                System.out.println("Message alert tones");
                break;
            case 6:
                System.out.println("Keypad tones");
                break;
            case 7:
                System.out.println("Warning and Game tones");
                break;
            case 8:
                System.out.println("Vibrating alert");
                break;
            case 9:
                System.out.println("Screen saver");
                break;
        }
    }
    public static void settings(){
        System.out.println("""
                1. call settings
                2. phone setting
                3. security settings
                4. Restore factory settings
                
                """);
        System.out.println("Enter phone button 1-4: ");
        int settings = input.nextInt();
        switch (settings){
            case 1:
                System.out.println("Call settings");
                break;
            case 2:
                System.out.println("phone settings");
                break;
            case 3:
                System.out.println("Security settings");
                break;
            case 4:
                System.out.println("Restore factory settings");
                break;
        }


    }
    public static void callSettings(){
        System.out.println("""
                1. Automatic radial
                2. Speed dialling
                3. Call waiting options
                4. Owm number sending
                5. Phone line in use
                6. Automatic answer
                """);
        System.out.println("Enter phone button 1-6: ");
        int callSettings = input.nextInt();
        switch (callSettings){
            case 1:
                System.out.println("Automatic radial");
                break;
            case 2:
                System.out.println("speed dialling");
                break;
            case 3:
                System.out.println("call waiting option");
                break;
            case 4:
                System.out.println("own number sending");
            case 5:
                System.out.println("phone line is use");
                break;
            case 6:
                System.out.println("Automatic answer");
                break;
        }

    }
    public static void phoneSettings(){
        int phoneSettings = input.nextInt();
        System.out.println("""
                1. Language
                2. call info display
                3. Welcome note
                4. Network selection
                5. Light
                6. Confirm Sim service actions
                """);
        System.out.println("Enter phone button 1-6: ");
         phoneSettings = input.nextInt();
         switch (phoneSettings){
             case 1:
                 System.out.println("Language");
                 break;
             case 2:
                 System.out.println("call info display");
                 break;
             case 3:
                 System.out.println("Welcome");
                 break;
             case 4:
                 System.out.println("network selection");
                 break;
             case 5:
                 System.out.println("Light");
                 break;
             case 6:
                 System.out.println("Confirm Sim service actions");
                 break;

         }
    }
    public static void securitySettings(){
        System.out.println("""
                1.pin code request
                2.call barring service
                3.Fixed dialling
                4.Closed user group
                5.phone security
                6.Change access codes
                
                """);
        System.out.println("Enter your phone settings option 1-6: ");
        int securitySettings = input.nextInt();
        switch (securitySettings){
            case 1:
                System.out.println("pin code request");
                break;
            case 2:
                System.out.println("call barring service");
                break;
            case 3:
                System.out.println("Fixed dialling");
                break;
            case 4:
                System.out.println("Closed User group");
                break;
            case 5:
                System.out.println("phone security");
                break;
            case 6:
                System.out.println("Change access codes");
                break;
        }
    }
    public static void games(){
        int games = input.nextInt();
        System.out.println("""
                8. Games
                """);
        System.out.println("Enter no 8: ");
        switch (games){
            case 8:
                System.out.println("games");
                break;
        }

    }
    public static void callDivert(){
        System.out.println("""
                7.Call divert
                """);
        System.out.println("Enter No 7: ");
        int callDivert = input.nextInt();
        switch (callDivert){
            case 7:
                System.out.println("Call divert");
                break;
        }
    }
    public static void calculator(){
        System.out.println("""
                9.Calculator
                """);
        System.out.println("Enter integer 9: ");
        int calculator = input.nextInt();
        switch (calculator){
            case 9:
                System.out.println("Calculate");
                break;
        }
    }
    public static void reminder(){
        System.out.println("""
                10.Reminders
                """);
        System.out.println("Enter integer 10: ");
        int reminder = input.nextInt();
        switch (reminder){
            case 10:
                System.out.println("Reminder");
                break;
        }
    }
    public static void clock(){
        System.out.println("""
                1.Alarm clock
                2.clock settings
                3.date settings
                4.Stopwatch
                5.Countdown timer
                6.Auto update of date and time
                """);
        System.out.println("Enter an integer 1-6: ");
        int clock = input.nextInt();
        switch (clock){
            case 1:
                System.out.println("Alarm clock");
                break;
            case 2:
                System.out.println("Clock settings");
                break;
            case 3:
                System.out.println("Date Settings");
                break;
            case 4:
                System.out.println("Stopwatch");
                break;
            case 5:
                System.out.println("Countdown");
                break;
            case 6:
                System.out.println("Auto update of date and time");
                break;
            default:
                System.out.println("Enter 0 to Go Back");
                break;
        }
    }
    public static void profiles(){
        System.out.println("""
                12.profiles
                """);
        System.out.println("Enter integer 12: ");
        int profiles = input.nextInt();
        switch (profiles){
            case 12:
                System.out.println("Profiles");
                break;
        }
    }
    public static void simServices(){
        System.out.println("""
                13.Sim service
                """);
        System.out.println("Enter a phone button 13: ");
        int simService = input.nextInt();
        switch (simService){
            case 13:
                System.out.println("Sim Service");
                break;
        }
    }
    public static void restoreFactorySettings(){
        System.out.println("""
                4.RestoreFactorySettings
                """);
        System.out.println("Enter a phone button 4: ");
        int restoreFactorySettings = input.nextInt();
        switch (restoreFactorySettings){
            case 4:
                System.out.println("RestoreFactorySettings");
                break;
        }
    }





}
