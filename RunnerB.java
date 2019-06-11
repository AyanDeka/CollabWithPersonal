public class RunnerB{

	public static void main(String[]args){
		PerfectSquareInterface squareInterface = (int num) -> Math.sqrt(num) == Math.round(Math.sqrt(num));
		System.out.println(squareInterface.perfectSum(49));
	}
}