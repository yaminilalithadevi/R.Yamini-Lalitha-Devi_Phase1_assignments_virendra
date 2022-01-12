package shapearea;

public class shape {
    int side;
    float radius;
    int length;
    int breadth;
    shape(){
    	
    }
    shape(int s){
    side =s;	
    }
    
    shape(float r){
    	radius = r;
    }
    shape(int l,int b){
    	length=l;
    	breadth=b;
    	
    }
    
    public float areaofcircle(){
    	return 3.14f*radius*radius;
    }
    public int areaofsquare(){
    return side*side;	
    }
    public int areaofrectangle(){
    	return length*breadth;
    }
    public int area(int height,int base){
    	return (height*base)/2;
    }
    public float area(float diagonal1,float diagonal2){
    	return(diagonal1 * diagonal2)/2;
    }
    
    public static void main(String[] args){
    	
    	shape square =new shape(9);
    	shape rectangle =new shape(5,5);
    	shape circle =new shape(5f);
    	shape traingle =new shape();
    	shape rhombus =new shape();
    	System.out.println("Area of circle:" + circle.areaofcircle());
    	System.out.println("Area of square:" + square.areaofsquare());
    	System.out.println("Area of rectangle:" + rectangle.areaofrectangle());
    	System.out.println("Area of traingle:" + traingle.area(8,9));
    	System.out.println("Area of rhombus:" + rhombus.area(5,4));
    	
    
    }
}
