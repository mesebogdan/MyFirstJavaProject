public class LogicalOperations {

    public int checkBiggerNumber(int first, int second) {
        if (first > second) {
            return first;
        } else return second;
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
        return numero % 2 == 0;
    }

    public String isEligibleToVote(int varsta){
        if (varsta >= 18)
            return "true";
        else return "false";
    }

    public void numbertohundred (int x){
        for (int i=x; i <= 100; i++){
            System.out.println(i);
        }
    }

    public void numbertominushundred(int x){
        for (int i=x; i >= -100; i--) {
            System.out.println(i);
        }
    }

   public void numbertonumber(int x, int y){
        for (int i = x; i <= y; i++){
           System.out.println(i);
       }
   }

    public void numbertonumber2(int x, int y){
      if (x<y)
        for (int i = x; i <= y; i++){
            System.out.println(i);
        }
     else if (x>y)
        for (int i = y; i < x; i++){
            System.out.println(i);
        }
        else {
          System.out.println("nimic");
      }
    }

    public void evennumber(int x){
        for (int i = x; i <=100; i++){
            if (i % 2==0){
                System.out.println(i);

            }
            }
    }
    public void oddnumber(int x){
        for (int i=x; i<=100; i++){
            if (i %2 !=0){
                System.out.println(i);
            }
        }
    }

    public double sumtohundred(int p){
        int sum = 0;
        for (int i = p; i <= 100; i++){
            sum = sum + i;
        }
        return sum;

    }
    public double sumsiavarage(int b){
        int sum = 0;
        double count = 0;
        for (int i = b; i <= 100; i++){
            sum +=i;
            count = count ++;
        }
        return sum/count;
}
}




