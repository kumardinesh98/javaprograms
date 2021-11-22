public class EmployeCase3 {
	public static void main (String[]  args) {
		int is_present = 1;
		int per_hour_wage=20;
		int working_hours=8;
		int total_wage=0;
		int part_time=4;
		double attendance = Math.floor((Math.random() *10) % 3);
		System.out.println(attendance);
		
		if  (attendance == 1) {
			System.out.println("employe iss present");
			total_wage= working_hours*per_hour_wage;
			System.out.println("total wage of an employe  "+total_wage);	
		}
		
		else if (attendance == 2)  {
			System.out.println("employe is part time");
			total_wage= part_time*per_hour_wage;
			System.out.println("total wage of an employe  "+total_wage);	
		}
		else
			System.out.println("employe is absent");
		
	}
}
