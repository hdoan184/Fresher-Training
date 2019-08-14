
public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sumDigits(178));
	}
	
	public static int sumDigits(int num) {
		int result = 0;
		if (num / 10 <= 0) result += num;
		else {
			result = result + num%10 + sumDigits(num/10);
		}
		return result;
	}
	
	static int sum_of_digit(int n) 
    {  
        if (n == 0) 
            return 0; 
        return (n % 10 + sum_of_digit(n / 10)); 
    }
}
