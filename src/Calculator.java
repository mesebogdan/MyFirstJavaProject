public class Calculator {

    public int adunare(int x, int y){
        return x+y;
    }
    public int scadere(int x, int y){
        return x-y;
    }
    public int inmultire(int x, int y){
        return x*y;
    }
    public double impartire(double x, double y){
        return x/y;
    }
    public double restulimpartirii(double x, double y){
        return x % y;
    }
    public int operatia1(int x, int y, int z) {
        return x + y * z;
    }
    public int operatia2(int x, int y, int z) {
        return (x + y) % z;
    }
    public double operatia3(double x, double y, double z, double p) {
        return x + ( y * z / p);
    }
    public double operatia4(double x, double y, double z, double p, double m, double n) {
        return x + (y / z * p) - (m % n);
    }

    public int medianumerelor(int x, int y, int z){
        return ( x + y + z ) / 3;
    }

    public double FahrenheittoCelsius(double x){
        return ( x - 32) * 5 / 9;
    }

    public double inchtocm (double x){
        return x * 0.0254 ;
    }

    public double speedinkm (double distanta, double ore, double min, double sec){
        double minuteacumulate = (ore * 60 + min + sec / 60) / 60;
        double distantainkm = distanta /100;
        return distantainkm / minuteacumulate;

    }

    public double speedinmile (double distanta, double ore, double min, double sec){
        double minuteacumulate = (ore * 60 + min + sec / 60) / 60;
        double distantainmile = distanta / 1609;
        return distantainmile / minuteacumulate;
    }

    public double speedinms (double distanta, double ore, double min, double sec){
        double secundeacumulate = ore * 3600 + min * 60 + sec;
        return distanta / secundeacumulate;

        }
    }

