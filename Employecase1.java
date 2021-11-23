public class Employecase1 {
<<<<<<< HEAD
	innt a=234
		float valu=2334
=======
	innt a=123
		float valu=234
>>>>>>> 2305ece47f60224104dca4e303f09739e39e26cf
	public static void main (String[]  args) {
		int is_present = 1;
		int per_day_wage=20;
		int working_hours=8;
		int total_wage=0;
		double attendance = Math.floor((Math.random() *10) % 2);
		System.out.println(attendance);
		

<<<<<<< HEAD
hello world opn
git process opn
main branch opn
branch opn
=======
hello world sys
	
git process sys
main branch  sys
branch  sys
>>>>>>> 2305ece47f60224104dca4e303f09739e39e26cf



		if  (attendance == 1) {
			System.out.println("employe iss present");
			total_wage= working_hours*per_day_wage;
			System.out.println("total wage of an employe  "+total_wage);	
		}
		else
			System.out.println("employe is absent");
		
	}
}
