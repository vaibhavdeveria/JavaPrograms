package com.testPackage;

public class ReverseNo {

	public  void reverse_no() {
		
		int no = 2569;
		String rev = "";
		
		for(int i = 0; i<4; i++) {
			//if(no!=0) {
			int num = no%10; //3
			rev = rev+num;  //43
			no = no/10; //123
			//}
		}
		System.out.println(rev);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ReverseNo obj = new ReverseNo();
		obj.reverse_no();

	}

}
