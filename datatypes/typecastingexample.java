package core.programs;

public class typecastingexample {

	  public static void main(String[] args)
	  {  //-------typecasting between INT and LONG-----------//
		  int i =100;
		  long l =i;  //automatic type converstion from int to long
		  System.out.println("long value" + l);
		  
		  int o = (int) l;
		  System.out.println("int value " + o);
		  
		  char t=(char) i;
		  System.out.println("char value " + t);
		  
		  //-----double and float-------//
		  double d = 15554565565587.58919459643157879;
		  float r=(float) d; // explicit typecasting from double to float
		  System.out.println("float value" + t);
		  System.out.println("double value" + d);
		  
		  //------double>> long>>int-------//
		  
		  double d2 = 10985656555656265566.3698745288;
		  long l2 = (long)d2; //explicit typecasting is required
		  long i2 = (int)l2;  //explicit typecasting is required
		  System.out.println("double value" +d2);
		  System.out.println("long value" + l2);
		  System.out.println("int value" + i2);
		  
		  
		  //---------------lond and float----------//
		  
		  float f=l; //automatic typecasting
		  System.out.println("float value" + f);
		  
		  //------------byte,int,double---------//
		  byte b;
		  int ii =257;
		  double dd =323.145;
		  System.out.println("conversion of int to byte.");
		  b=(byte)ii; // i%256 will happen
		  System.out.println("ii = " + ii + " b= " +b);
		  
		  System.out.println("conversation of double to byte.");
				  
		  b= (byte) dd; // d%256 will happen
		  System.out.println("dd = " + dd +"b= "+ b);
		  
		  
		  
	  }
}
