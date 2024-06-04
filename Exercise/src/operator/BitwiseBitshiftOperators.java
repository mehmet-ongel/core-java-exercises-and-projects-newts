package operator;

public class BitwiseBitshiftOperators {

	public static void main(String[] args) {

		System.out.println("----------------------Bitwise AND (&) Operator-------------------");
		
		//Bitwise AND (&)
		int num1 = 8;// 1000
		int num2 = 9;// 1001
					 // 1000 -> 8
		System.out.println("num1 as binary: " + Integer.toBinaryString(num1));
		System.out.println("num2 as binary: " + Integer.toBinaryString(num2));
		System.out.println("num1 & num2 as binary: " + Integer.toBinaryString(num1&num2));
		System.out.println("num1 & num2 as decimal: " + (num1&num2));
		
		System.out.println("----------------------Bitwise Inclusive OR (|) Operator-------------------");
		
		//Bitwise Inclusive OR (|)
		int num3 = 8;// 1000
		int num4 = 9;// 1001
					 // 1001 -> 9 in decimal
		System.out.println("num3 as binary: " + Integer.toBinaryString(num3));
		System.out.println("num4 as binary: " + Integer.toBinaryString(num4));
		System.out.println("num3 | num4 as binary: " + Integer.toBinaryString(num3|num4));
		System.out.println("num3 | num4 as decimal: " + (num3|num4));
		
		System.out.println("----------------------Bitwise Exclusive OR (^) Operator-------------------");
		
		//Bitwise Exclusive OR (^)
		int num5 = 8;// 1000
		int num6 = 9;// 1001
					 // 0001 -> 1 in decimal
		System.out.println("num5 as binary: " + Integer.toBinaryString(num5));
		System.out.println("num6 as binary: " + Integer.toBinaryString(num6));
		System.out.println("num5 ^ num6 as binary: " + Integer.toBinaryString(num5^num6));
		System.out.println("num5 ^ num6 as decimal: " + (num5^num6));
		
		
		System.out.println("----------------------Signed Left-shift (<<) Operator-------------------");
		
		//Signed Left-shift (<<) Operator
		int num7 = 8;// 1000 << 2 ->100000 -> 32 in decimal
		
		System.out.println("num7 as binary: " + Integer.toBinaryString(num7));
		System.out.println("num7 << 2 as binary: " + Integer.toBinaryString(num7<<2));
		System.out.println("num7 << 2 as decimal: " + (num7<<2));
		
		System.out.println("----------------------Signed Right-shift (>>) Operator-------------------");
		
		//Signed Right-shift (>>) Operator
		int num8 = 8;// 1000 >> 2 ->10 -> 2 in decimal
		
		System.out.println("num8 as binary: " + Integer.toBinaryString(num8));
		System.out.println("num8 >> 2 as binary: " + Integer.toBinaryString(num8>>2));
		System.out.println("num8 >> 2 as decimal: " + (num8>>2));
		
		System.out.println("----------------------Unary Bitwise Complement (~) Operator-------------------");
		
		//Unary Bitwise Complement (~) Operator
		int num9 = 8;// 1000 ~ ->0111 -> 7 in decimal
		//1111 1111 1111 1111 1111 1111 1111 0111 -> -9 -> 7 - 16 = -9
		
		System.out.println("num9 as binary: " + Integer.toBinaryString(num9));
		System.out.println("~num9 as binary: " + Integer.toBinaryString(~num9));
		System.out.println("~num9 as decimal: " + (~num9));
		
		
		int num10 = 33;// ~0010 0001 ->1101 1110 -> 222 in decimal -> 2^8 = 256
		//1111 1111 1111 1111 1111 1111 1101 1110 -> -34 -> 222 - 256 = -34
		
		System.out.println("num10 as binary: " + Integer.toBinaryString(num10));
		System.out.println("~num10 as binary: " + Integer.toBinaryString(~num10));
		System.out.println("~num10 as decimal: " + (~num10));
		
	}

}











