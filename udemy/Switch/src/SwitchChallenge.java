public class SwitchChallenge {

    public static void main(String[] args) {

        char letter = 'F';

        switch (letter) {
            case 'A':
                System.out.println(letter + " is spelled Able");
                break;
            case 'B':
                System.out.println(letter + " is spelled Baker");
                break;
            case 'C':
                System.out.println(letter + " is spelled Charlie");
                break;
            case 'D':
                System.out.println(letter + " is spelled Dog");
                break;
            case 'E':
                System.out.println(letter + " is spelled Easy");
                break;
            default:
                System.out.println(letter + " was not found");
                break;
        }
    }
}
