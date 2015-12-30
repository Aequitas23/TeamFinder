import java.util.Scanner;
public class RegexTeamData {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		/*System.out.println("Number of Rows: ");
		int x = sc.nextInt();
		String[] array1 = new String[x];*/
		System.out.println("Enter data: ");
String s1= "<h3> 6127 iBots </h3><p> Wildwood , MO </p><p>Bio: Hello! We are a private team based in Wildwood, Missouri. and is made up of thirteen members who are extremely passionate about science, technology, engineering, and math. This website was created by us as part of our community outreach program. Thanks for stopping by! </p><p>Available For: Shadowing, Mentoring </p><h4>Contact Information<h4><p>Email: stlwizftc@gmail.com </p><p>Phone Number: </p><p>Additional Contact Information: Facebook: Ftc IBots </p> ";


		String s2 = s1.replaceAll(">\\s+",">");
		String s3 = s2.replaceAll("\\s+<","<");
		String s4 = s3.replaceAll(";\\s+",";");
		System.out.println(s4);

	}
}
