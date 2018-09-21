import java.util.Scanner;

public class DistanceTestMain {

    public static void main(String[] args) {

        System.out.println("Name the first city and the distance from North and West border:");

        CitiesDistance FirstCity = new CitiesDistance();

        Scanner ci = new Scanner(System.in);
        Scanner no = new Scanner(System.in);
        Scanner we = new Scanner(System.in);
        String cit = ci.nextLine();
        int nor = no.nextInt();
        int wes = we.nextInt();
        FirstCity.setCity(cit);
        FirstCity.getCity();

        FirstCity.setDistanceNorth(nor);
        FirstCity.setDistanceWest(wes);

        System.out.println(FirstCity + ", distance from South=" + FirstCity.getDistanceSouth() + "km, " + "distance from East=" + FirstCity.getDistanceEast() + "km");

        System.out.print("----------------------------");

        System.out.println("Name the second city and the distance from North and West border:");
        CitiesDistance SecondCity = new CitiesDistance();

        Scanner ci2 = new Scanner(System.in);
        Scanner no2 = new Scanner(System.in);
        Scanner we2 = new Scanner(System.in);
        String cit2 = ci2.nextLine();
        int nor2 = no2.nextInt();
        int wes2 = we2.nextInt();
        SecondCity.setCity(cit2);
        SecondCity.getCity();

        SecondCity.setDistanceNorth(nor2);
        SecondCity.setDistanceWest(wes2);

        System.out.println(SecondCity + ", distance from South=" + SecondCity.getDistanceSouth() + "km, " + "distance from East=" + SecondCity.getDistanceEast() + "km");

        System.out.println("----------------------------");

        double a = Math.abs(FirstCity.getDistanceNorth() - SecondCity.getDistanceNorth());
        double b = Math.abs(FirstCity.getDistanceWest() - SecondCity.getDistanceWest());

        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.println("The distance between "+FirstCity.getCity()+" and "+SecondCity.getCity()+" in a straight line is: "+Math.round(c)+"km.");


    }

}

