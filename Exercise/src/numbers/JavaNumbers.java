package numbers;

public class JavaNumbers {

	public static void main(String[] args) {

		System.out.println("-----------------------Octal Numbers-------------------------");
		
		//Octal
		//octal numbers: 0-7
		int octalNumber1 = 015;//this will be stored as 13 in decimal
		int octalNumber2 = 0104;//this will be stored as 68 in decimal
		int sumOctalNumbers = octalNumber1 + octalNumber2;//81 in decimal
		
		System.out.println("octalNumber1 in decimal: " + octalNumber1);
		System.out.println("octalNumber2 in decimal: " + octalNumber2);
		System.out.println("result in decimal: " + sumOctalNumbers);
		System.out.println("result as octal: " + Integer.toOctalString(sumOctalNumbers));
		
		System.out.println("-----------------------Hexadecimal Numbers-------------------------");
		
		//Hexadecimal
		int hexNumber1 = 0x1B0;//432 in decimal
		int hexNumber2 = 0x2F;//A-F 47 in decimal
		int sumHexNumbers = hexNumber1 + hexNumber2;//479 in decimal
		
		System.out.println("hexNumber1 in decimal: " + hexNumber1);
		System.out.println("hexNumber2 in decimal: " + hexNumber2);
		System.out.println("sumHexNumbers in decimal: " + sumHexNumbers);
		System.out.println("sumHexNumbers as hexadecimal: " + Integer.toHexString(sumHexNumbers));
		
		System.out.println("-----------------------Binary Numbers-------------------------");
		
		//Binary
		int binaryNumber1 = 0b1001;// as 9 in decimal
		int binaryNumber2 = 0b1011;// as 11 in decimal
		int sumBinaryNumbers = binaryNumber1 + binaryNumber2; //20
		
		System.out.println("binaryNumber1 in decimal: " + binaryNumber1);
		System.out.println("binaryNumber2 in decimal: " + binaryNumber2);
		System.out.println("sumBinaryNumbers in decimal: " + sumBinaryNumbers);
		System.out.println("sumBinaryNumbers as binary: " + Integer.toBinaryString(sumBinaryNumbers));
		
	}

}
