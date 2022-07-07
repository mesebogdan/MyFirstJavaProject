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

    public int switchnumber(int numberno) {
        switch (numberno) {
            case 1:
                System.out.println("The number is 1!");
                break;
            case 2:
                System.out.println("The number is 2!");
                break;
            case 3:
                System.out.println("The number is 3!");
                break;
            case 4:
                System.out.println("The number is 4!");
                break;
            case 5:
                System.out.println("The number is 5!");
                break;
            case 6:
                System.out.println("The number is 6!");
                break;
            case 7:
                System.out.println("The number is 7!");
                break;
            case 8:
                System.out.println("The number is 8!");
                break;
            case 9:
                System.out.println("The number is 9!");
                break;
            case 10:
                System.out.println("The number is 10!");
                break;
            default:
                System.out.println("not 1 or 2");


        }
        return 0;
    }

    public boolean isNumberEven(int numero) {
        return numero % 2 == 0;
    }

    public String isEligibleToVote(int varsta) {
        if (varsta >= 18)
            return "true";
        else return "false";
    }

    public void numbertohundred(int x) {
        for (int i = x; i <= 100; i++) {
            System.out.println(i);
        }
    }

    public void numbertominushundred(int x) {
        for (int i = x; i >= -100; i--) {
            System.out.println(i);
        }
    }

    public void numbertonumber(int x, int y) {
        for (int i = x; i <= y; i++) {
            System.out.println(i);
        }
    }

    public void numbertonumber2(int x, int y) {
        if (x < y)
            for (int i = x; i <= y; i++) {
                System.out.println(i);
            }
        else if (x > y)
            for (int i = y; i < x; i++) {
                System.out.println(i);
            }
        else {
            System.out.println("nimic");
        }
    }

    public void evennumber(int x) {
        for (int i = x; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);

            }
        }
    }

    public void oddnumber(int x) {
        for (int i = x; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    public double sumtohundred(int p) {
        int sum = 0;
        for (int i = p; i <= 100; i++) {
            sum = sum + i;
        }
        return sum;

    }

    public double sumsiavarage(int b) {
        int sum = 0;
        double count = 0;
        for (int i = b; i <= 100; i++) {
            sum += i;
            count++;
        }
        return sum / count;
    }
    public void printstars(){
        String star="*";
        for (int j=0; j<=7; j++){
            for (int i=7-j; i>=1; i--){
                System.out.print(star);
            }
            System.out.println();
        }

    }

    public void onetohundredwhile(int x) {
        while (x <= 100) {
            System.out.println(x);
            x++;
        }

    }

    public void onetominushundredwhile(int y) {
        while (y >= -100) {
            System.out.println(y);
            y--;

        }
    }

    public void numbertonumberwhile(int x, int y) {
        while (x <= y) {
            System.out.println(x);
            x++;
        }
    }

    public void numbertonumber2while(int x, int y) {
        if (x < y) {
            while (x <= y) {
                System.out.println(x);
                x++;
            }
        } else if (y < x) {
            while (y <= x) {
                System.out.println(y);
                y++;
            }
        } else {
            System.out.println("nimic");
        }
    }

    public void evennumber2(int x) {

        while (x <= 100) {
            x++;
            if (x % 2 == 0) {
                System.out.println(x);
            }
        }
    }

    public void oddnumber2(int x) {
        while (x <= 100) {
            x++;
            if (x % 2 != 0) {
                System.out.println(x);
            }
        }
    }

    public void sumandaverage2(int firstnumber, int secondnumber) {
        int sum = 0;
        double count = 0;

        while (firstnumber <= secondnumber) {
            sum = sum + firstnumber;
            firstnumber++;
            count++;
        }
        System.out.println(sum);
        System.out.println(sum / count);
    }
    public float div7(int x, int y) {

        float sum = 0F;
        float count = 0F;

        while (x <= y) {
            if (x % 7 == 0) {
                count++;
                sum += x;
            }
            x++;
        }
        float average = sum / count;
        return average;

    }

    public void fibonacci(int number1, int number2) {
        int count = 20;

        int i = 1;
        while (i <= count) {

            System.out.println(number1 + " ");
            int sumOfPrevTwo = number1 + number2;
            number1 = number2;
            number2 = sumOfPrevTwo;
            i++;
        }

    }


    public void cozalozawoza(int x, int y){
        while (x<=y){
            if (x %3 == 0 && x%5==0 && x%7==0){
                System.out.print("CozaLozaWoza"+" ");
            } else if (x%5==0 && x%7==0) {
                System.out.print("WozaLoza"+" ");
            } else if (x%3==0 &&x%7==0) {
                System.out.print("CozaWoza"+" ");
            } else if (x%3==0&&x%5==0) {
                System.out.print("CozaLoza"+" ");
            } else if (x%7==0) {
                System.out.print("Woza"+" ");
            } else if (x%5==0) {
                System.out.print("Loza"+" ");
            } else if (x%3==0) {
                System.out.print("Coza"+" ");
            }else {
                System.out.print(x + " ");
            }
            if (x%11==0){
                System.out.println();
            }
            x++;
        }
    }
}




