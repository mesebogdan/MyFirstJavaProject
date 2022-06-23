public class LogicalOperations {

    public int checkBiggerNumber(int first, int second) {
        if (first > second) {
            return first;
        }
        return second;
    }

    public String textandnumbertoshow(String textinput, int number) {
        if (textinput.equals("FastTrackIT") && number <= 3) {
            return (textinput + number);
        } else if (!textinput.equals("FastTrackIT") && number >= 4) {
            return (number + textinput);
        }
        return "nimic";
    }

    public String verifytext(String textinput) {
        if (textinput.equals("FastTrack")) {
            return "Learning text comparisation";
        } else if (!textinput.equals("FastTrack")) {
            return "Got to try some more";

        }
        return "0";

    }

    public int printanumber(int x) {
        if (x >= 2 && x <= 8) {
            return x;
        }
        return 0;
    }

    public String snowshow(int number) {
        if (number > 8 || number == 6)
            return "The amount of snow this winter was (cm): " + number;
        return "The forecast snow is (cm): " + number;
    }

    public String greaternumbers(int y) {
        if (y > 3 && y != 4)
            return "The number is greater than 3 and not equal to 4";
        else if (y == 4)
            return "The number is equal to 4";
        else if (y < 3)
            return "The number is lower than 3";
        return "nimic";
    }
    public int switchnumber(int numberno){
        switch (numberno){
            case 1: System.out.println("The number is 1!");break;
            case 2: System.out.println("The number is 2!");break;
            case 3: System.out.println("The number is 3!");break;
            case 4: System.out.println("The number is 4!");break;
            case 5: System.out.println("The number is 5!");break;
            case 6: System.out.println("The number is 6!");break;
            case 7: System.out.println("The number is 7!");break;
            case 8: System.out.println("The number is 8!");break;
            case 9: System.out.println("The number is 9!");break;
            case 10: System.out.println("The number is 10!");break;
            default: System.out.println("not 1 or 2");


        }return 0;
    }

    public boolean isNumberEven(int numero){
        if (numero % 2 == 0)
            return true;
        else return false;
    }

    public String isEligibleToVote(int varsta){
        if (varsta >= 18)
            return "true";
        else return "false";
    }

}

