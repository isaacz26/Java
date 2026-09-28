
class Main {
	public static void main(String[] args) {
    	(new Main()).init();
	}

  void init(){
/*  
    Challenge 1:
    1) Create the variables, ask the user for the variable values, write the equation in file EQ1-act6 and display the equation value.
*/
    System.out.println("Give a value");
    int x = Input.readInt();
    double y = 0;
    y = Math.pow(x, 7);
    System.out.println(y);

/*  
    Challenge 2:
    1) Create the variables, ask the user for the variable values, write the equation in fileEQ1.1-act6 and display the equation value.
*/
    System.out.println("Give a value");
    int z = Input.readInt();
    double q = 0;
    q = Math.pow(z, 3) + 5;
    System.out.println(q);

/*  
    Challenge 3:
    Create the variables, ask the user for the variable values, write the equation in file EQ2-act6 and display the equation value..
    
*/
    System.out.println("Give a value");  
    int t = Input.readInt();
    System.out.println("Give another value");  
    int r = Input.readInt();
    double s = 0;
    s = Math.pow(t, 5)*Math.pow(r+2, 4);
    System.out.println(s);

/*  
    Challenge 4:
    Create the variables, ask the user for the variable values, write the equation in file EQ3-act6 and display the equation value..
    
*/
    System.out.println("Give a value");
    int b = Input.readInt();
    System.out.println("Give another value");
    int a = Input.readInt();
    double c = 0;
    c = Math.sqrt(a+b);
    System.out.println(c);


/*  
    Challenge 5:
    Create the variables, ask the user for the variable values, write the equation in file EQ4-act6 and display the equation value..
    
*/
    System.out.println("Give a value for x2");
    int x2 = Input.readInt();
    System.out.println("Give a value for x1");
    int x1 = Input.readInt();
    System.out.println("Give a value for y2");
    int y2 = Input.readInt();
    System.out.println("Give a value for y1");
    int y1 = Input.readInt();
    double d = 0;
    d = Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2));
    System.out.println(d);

/*  
    Challenge 6:
    Create the variables, ask the user for the variable values, write the equation g=sin(deg) and display the equation value..
    
*/
    




/*  
    Challenge 7:
    Create the variables, ask the user for the variable values, write the equation in file EQ5-act6 and display the equation value.
    
*/




/*  
    *** Bonus Challenge ***:
    Create the variables, ask the user for the variable values, write the equation in file Ch-act6 and display the equation value.

    HINT: What does the "plus minus: after "-b" mean.
*/





    // **************************************************
    // **** Don't write any code below here.  ***********
    // **************************************************
  }
}