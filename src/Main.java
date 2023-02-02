import lesson_20.*;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void printSeparator() {
        String separator = "--------------------------------";
        System.out.println(separator + separator);
    }
    public static void printSeparator(String message) {
        String separator = " =============  ";
        System.out.println(separator + message + separator);
    }
    public static void main(String[] args) {
        ArrayList<Transport> transportsList = new ArrayList<>();
        ArrayList<Mechanic> mechanicsList = new ArrayList<>();
        ArrayList<Mechanic> mechanicsList2 = new ArrayList<>();
        ArrayList<CarDriver> carDriversList = new ArrayList<>();
        ArrayList<BusDriver> busDriversList = new ArrayList<>();
        ArrayList<TruckDriver> truckDriversList = new ArrayList<>();


        mechanicsList.add(new Mechanic("Vasiliy","Petrovich", "OOO Servis"));
        mechanicsList.add(new Mechanic("Ivan","Fedorovich", "OOO Primus"));
        mechanicsList.add(new Mechanic("Aleksandr","Simonov", "OOO Remont"));

        mechanicsList2.add(new Mechanic("Anatoliy","Irorevich", "OOO Pochinim"));
        mechanicsList2.add(new Mechanic("Denis","Vasiliev", "OOO Remont"));

        carDriversList.add(new CarDriver("First Car Driver", 10));
        carDriversList.add(new CarDriver("Second Car Driver", 1));
        busDriversList.add(new BusDriver("First Bus Driver", 1));
        busDriversList.add(new BusDriver("Second Bus Driver", 12));
        truckDriversList.add(new TruckDriver("First Truck Driver", 2));
        truckDriversList.add(new TruckDriver("Second Truck Driver", 7));

        Transport car1 = new Car("Lada", "Vesta", 1.5, carDriversList.get(0), mechanicsList);
        Transport car2 = new Car("Lada", "XRay", 1.8, carDriversList.get(1), mechanicsList2);
        Transport bus1 = new Bus("Икарус", "553", 3, busDriversList.get(1), mechanicsList);
        Transport truck1 = new Truck("Scania", "S580 Highline", 5, truckDriversList.get(0), mechanicsList2);

        transportsList.add(car1);
        transportsList.add(bus1);
        transportsList.add(truck1);
        transportsList.add(car2);

        printSeparator("First Task 1.1");

        for (Transport transport : transportsList) {
            printSeparator();
            transport.printMessage();
            transport.printMechanicsList();
        }
        printSeparator();
        mechanicsList.get(0).makeDiagnostic();
        mechanicsList.get(1).repairTransport();

        printSeparator("Second Task 1.2");

        ServiceStation serviceStation = new ServiceStation<>();
        for(Transport ts: transportsList)
            serviceStation.addToQueue(ts);
        printSeparator();
        System.out.println("Очередь на обслуживание: "+serviceStation);
        printSeparator();

        for(int i = 0; i < transportsList.size();i++)
            serviceStation.makeDiagnostic();

    } // main
} // Main