public class Employecase1 {
	innt 
		float
	public static void main (String[]  args) {
		int is_present = 1;
		int per_day_wage=20;
		int working_hours=8;
		int total_wage=0;
		double attendance = Math.floor((Math.random() *10) % 2);
		System.out.println(attendance);
		

hello world
git process
main branch
branch



		if  (attendance == 1) {
			System.out.println("employe iss present");
			total_wage= working_hours*per_day_wage;
			System.out.println("total wage of an employe  "+total_wage);	
		}
		else
			System.out.println("employe is absent");
		
	}
}
