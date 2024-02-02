import java.util.Scanner;
import java.lang.String;

class SY2023BIT509 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SY2023BIT509 oSY509 = new SY2023BIT509();       
		
		System.out.print("Enter the count of Student: ");
		int iCount = sc.nextInt();
		
		String[] sStudentRegArray = new String[iCount];
		
		System.out.println("Enter registration numbers - ");
		for (int i = 0; i < iCount; i++)
			sStudentRegArray[i] = sc.next();
			
		int iResult = oSY509.getValidRegistrationsCount(sStudentRegArray);
		
		System.out.println("Valid registration no. count : " + iResult);
	
	}       
	
	public int getValidRegistrationsCount(String[] registrations) {
		int iValidRegCount = 0;
		int iRegLength = registrations.length;
		
		if (iRegLength <= 0)
         		return iValidRegCount;  // if the registrations array is empty valid registration numbers will be 0.
          
    		for (int i = 0; i < iRegLength; i++) {
         		String sYear = registrations[i].substring(0, 2);
         		String sDept = registrations[i].substring(4, 7);
         
         		// valid for the year 2000 onward.
         		if (sYear.startsWith("20")) {
				// checking the valid department or not.
            			if (sDept.equalsIgnoreCase("bit") || sDept.equalsIgnoreCase("bcs") || sDept.equalsIgnoreCase("bce") || sDept.equalsIgnoreCase("bme")) {
              				iValidRegCount++;
            			} 
         		} 
    		}	
		
		return iValidRegCount;	
	}
}

/*
2023bit509
Computer science       - BCS
Information Technology - BIT
Chemical Engineering   - BCE
Mechanical Engineering - BME
*/
