package Act3;

public class SeqOfLowLet {

	public static void main(String[] args) {
		String n="Welcome_To_My_Youtube_Channel";
		boolean k=false;
		for(int i=0;i<n.length();i++) {
			if(n.charAt(i)=='_') {
				if(Character.isLowerCase(0)) {
					k=true;
					break;
				}
			}
			if(k) {
				System.out.println("Matched");
			}
			else {
				System.out.println("Not Matched..");
			}
		}

	}

}
