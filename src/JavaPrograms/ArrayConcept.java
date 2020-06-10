package JavaPrograms;

public class ArrayConcept {

	public static void main(String[] args) {
		
		
		//limitation of array
		
		//1. size is fixed. that is why it is called static array-- to solve this problem we can use dynamic array : Arraylist
		//2. it can only store similar type of values-->to solve this problem we can use static array object
		
		//1. int array 
		
		
	
		int i[]= new int[4];//Array Declaration
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		
		System.out.println(i[0]);
		
		System.out.println(i[3]);
		
		System.out.println(i[0]+i[2]);
		
		//System.out.println(i[4]);//ArrayIndexOutOfBoundsException
		
		
		//System.out.println(i[-1]);//ArrayIndexOutOfBoundsException

        System.out.println(i.length);//size of the array
        
        //Default value of integer,double is 0
        
        //Default value of String is NULL
        
        
        //to print all the values of array
        
        for(int k=0; k<i.length;k++)
        {
        	
        	System.out.println(i[k]);
        }

        
        
        //2.double array
        
        double d[]= new double[2];
        d[0]=1.2;
        d[1]=2.3;
        
        System.out.println(d[0]+ "test" +d[1]);
        
        //3. String array
        
        String names[]= new String[3];
        names[0]="Akshat";
        names[1]= "Alladin";
        names[2]="Joey";
        
        


	}

}
