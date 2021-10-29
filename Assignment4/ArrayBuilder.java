public class ArrayBuilder {
	/*
	 * TODO 1: Provide three overloaded methods as shown below:
	 * 		+ getArray(a: int, b: int) : int[]
	 * 		+ getArray(a: int, b: int, c: int) : int[]
	 * 		+ getArray(a: int, b: int, c: int, d: int) : int[]
	 * 
	 * 		1. All three methods should be of public and static type.
	 * 		2. All three methods should be named getArray().
	 * 		3. All three methods should take some int arguments and return an array
	 * 			containing those arguments.
	 */
	public static int[] getArray(int a, int b) {
		return new int[] {a, b};
	}
	
	public static int[] getArray(int a, int b, int c) {
		return new int[] {a, b, c};
	}
	
	public static int[] getArray(int a, int b, int c, int d) {
		return new int[] {a, b, c, d};
	}
}
