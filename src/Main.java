import cities.Kyoto;
import cities.Osaka;
import cities.Tokyo;
import util.Printer;

public class Main {
	public static void main(String[] args) {

		Osaka osaka = new Osaka();
		Printer osakaPrinter = new Printer(osaka);
		osaka.setup();
		osakaPrinter.printHeading();
		osakaPrinter.printAllLocations();
		System.out.println();
		osakaPrinter.printAllPaths();
		System.out.println();
		osakaPrinter.printAllTransportation();

		System.out.println();
		Printer.printDivider();
		System.out.println();

		Kyoto kyoto = new Kyoto();
		Printer kyotoPrinter = new Printer(kyoto);
		kyoto.setup();
		kyotoPrinter.printHeading();
		kyotoPrinter.printAllLocations();
		System.out.println();
		kyotoPrinter.printAllPaths();
		System.out.println();
		kyotoPrinter.printAllTransportation();

		System.out.println();
		Printer.printDivider();
		System.out.println();

		Tokyo tokyo = new Tokyo();
		Printer tokyoPrinter = new Printer(tokyo);
		tokyo.setup();
		tokyoPrinter.printHeading();
		tokyoPrinter.printAllLocations();
		System.out.println();
		tokyoPrinter.printAllPaths();
		System.out.println();
		tokyoPrinter.printAllTransportation();

	}
}