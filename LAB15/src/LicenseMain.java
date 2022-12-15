import java.util.Scanner;
public class LicenseMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		LicenseSys.addLicense();
		
		System.out.println("Here is the list of licenses");
		System.out.println(LicenseSys.display());
		
		System.out.println("Calculate and display the fees of all Licenses:");
		LicenseSys.calculateFee();
		System.out.println(LicenseSys.display());
		
		System.out.println("Enter License id to search");
		

		System.out.println(LicenseSys.searchLicense(sc.nextInt()).toString());
		
		System.out.println("Enter id to delete");
		LicenseSys.removeLicense(sc.nextInt());
		
		System.out.println("After deletion");
		System.out.println(LicenseSys.display());
		
		
		
		

	}

}
