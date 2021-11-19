package Arrays;

public class StaticArrayConcept {

	public static void main(String[] args) {

   // int Array
		//limitation of array:
		//1. size is fixed: static array
		//2. Similar datatype can be stored: to overcome Object array
		//but we can use ArrayList<objects>--collection
		
		int i[] = new int[4];
		//i[-1]=40
		i[0]=10;
		i[1]=20;
		i[2]=10;
		i[3]=20;
		
		System.out.println("Li = " + 0);
		
		int len=i.length;//4
		System.out.println("length= " + len);
		System.out.println("Hi = " +(len-1));
		
		System.out.println(i[1]);
		System.out.println(i[2]);
		//System.out.println(i[4]);//ArrayIndexOutOfBoundsException
		
		for (int k=0;k<i.length; k++) {
			System.out.println(i[k]);
		}
		for (Integer e :i) {
			System.out.println(e);
		}
		
		//Object Array: 
		
		Object ob[] = new Object[5];
		ob[0]= "Lal";
		ob[1]=22;
		ob[2]= 'f';
		ob[3]= 33.22;
		ob[4]=true;
		
		for(Object e: ob)
		{
			System.out.println(e);
		}
	}

}
