
public class Calc {
	
	public void Show(int bill, int paid) {
//		change:
		int change = paid - bill;
		
//		note counters:
		int fifty = 0;
		int twenty = 0;
		int ten = 0;
		int five = 0;
		int two = 0;
		int one = 0;
		
//		figure out change:
		if (change % 50 == change) {
			fifty = 0;
		} else {
			fifty = change/50;
			change = change - fifty*50;
			System.out.println("Fifty:" + fifty);
		}
		
		if (change % 20 == change) {
			twenty = 0;
		} else {
			twenty = change/20;
			change = change - twenty*20;
			System.out.println("Twenty:" + twenty);
		}
		
		if (change % 10 == change) {
			ten = 0;
		} else {
			ten = change/10;
			change = change - ten*10;
			System.out.println("Ten:" + ten);
		}
		
		if (change % 5 == change) {
			five = 0;
		} else {
			five = change/5;
			change = change - five*5;
			System.out.println("Five:" + five);
		}
		
		if (change % 2 == change) {
			two = 0;
		} else {
			two = change/2;
			change = change - two*2;
			System.out.println("Two:" + two);
		}
		
		if (change % 1 == change) {
			one = 0;
		} else {
			one = change/1;
			change = change - one*1;
			System.out.println("One:" + one);
		}
	}
}
