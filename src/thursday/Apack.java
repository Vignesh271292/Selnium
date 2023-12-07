package thursday;

public class Apack {
	public Apack() {
		this("Muthu");
		System.out.println("par default constructor");
	}
	public Apack(int id) {
		System.out.println("parent integer constructor:"+id);
	}
	public Apack(String name ) {
		this(55);
		System.out.println("string constructor :"+name);
	}
	public static void main(String[] args) {
		Apack a=new Apack();
	}


	
	
		
	}


