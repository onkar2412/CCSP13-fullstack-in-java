// write a code to take a amount as an input and print its available denomination 
// available denomination = {500,200,100,50,20,10,5,2,1}
// input = 9997
// output 500*19=9500
// 200*2=400
// 50*1=50
// 20*2=40
// 5*1=5
// 2*1=2
// total = 9997

public class Exmp2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter amount in Rupees:  ");
		int curr[] = {500, 200, 100, 50, 20 , 10, 5, 2, 1};
		int rupees = sc.nextInt();
		
		for(int i = 0; i < curr.length;i++) {
				if(curr[i] <= rupees) {
				int notes = rupees / curr[i];
				System.out.println(curr[i] + " " + "Notes = " + (curr[i]) * notes);
				rupees = rupees -(curr[i] * notes);
			}
		}
	}
}