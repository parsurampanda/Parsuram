class HallowTriangle {
	public static void main(String[] args) {
		int spaces = 40;
		int stars = 1;
		String alpha = " ";
		for(int j=1; j<=9; j++) {
			for(int i=0; i<spaces; i++) System.out.print(" ");
			for(int i=0; i<stars; i++) {
				if(i==0 || i==(stars-1) || j==9) {
					alpha = "*";
				} else {
					alpha = " ";
				}
				System.out.print(alpha);
			}
			System.out.println();
			spaces--; stars+=2;
		}
	}
}
