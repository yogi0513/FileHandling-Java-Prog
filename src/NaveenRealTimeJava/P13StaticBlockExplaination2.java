package NaveenRealTimeJava;

/*
 * 
   Q4. How can we create objects if we make the constructor private ? 
      
   Q5. Is it possible to compile and run a Java program without writing main( ) method? 
   
   Q6. Can we initialize member variables within static block ?
 */

public class P13StaticBlockExplaination2 {

	//Q 4 -- solution
	/*
	 *  if you make constructor of class as private you cannot use it in another class ---for that create the object 
	 *  into static block 
	 */
	
	
	int age; 
	
	static {
		P13StaticBlockExplaination2 pbe = new P13StaticBlockExplaination2();
		
	}
	
	
	public static P13StaticBlockExplaination2 createObjectInstance() {
		P13StaticBlockExplaination2 pbe = new P13StaticBlockExplaination2();
		return pbe;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	
	//private constructor 
	private P13StaticBlockExplaination2() {
		this.age=34;
	}
	
	
	//main method 
	public static void main(String[] args) {
	
		P13StaticBlockExplaination2 pbe = new P13StaticBlockExplaination2();
		System.out.println(pbe.age);
		
		// P13 -- 3rd class trying to load outside class -- Q -5, 6
		
		P13StaticBlockExplaination3 pbd = new P13StaticBlockExplaination3();  // static block will be executed 
		System.out.println(P13StaticBlockExplaination3.age);   // age is static field
		
	}
	
	
	
}
