
public class myPrime {

	public static void main(String[] args) {
		checkMyPrime num1 = new checkMyPrime();
		System.out.println("Is 5 a prime number? "+ num1.isMyPrime(5));
		

	}

}
class checkMyPrime {
	
	public boolean isMyPrime(int number){ //writing a method to check if number is prime
		for(int i=2;i<=number/2;i++){
			if(number%i == 0){
				return false;
			}
		}return true;
	}
}
	
	
	

