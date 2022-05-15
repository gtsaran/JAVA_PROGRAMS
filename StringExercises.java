public class StringExercises {

	public static void main(String[] args) {
		
		
		//split sentence into words using split()
		System.out.println("***split sentence into words using split()***");
		
		
		/* 
		  Scanner sc=newScanner(System.in); 
		  String s=sc.nextLine(); 
		  sc.close();
		 */
		
		String s="Hello World!"; 
        String[] words =s.split("\\s"); // Here "\\s" denotes split the string using white space
                                        //Here "" denotes split everything into character
        for(String a:words)
            System.out.println(a);
        
        
        
        System.out.println("\n"+"\n"+"\n");
        //split word into character using toCharArray() 
        System.out.println("***split word into character using toCharArray()***");
        String word="JavaProgramming";
        char[] letters= word.toCharArray();
        for(char ch:letters)
        	System.out.println(ch);
        
        System.out.println("\n"+"\n"+"\n");
        
        
        
        System.out.println("***split a word into character using charAt()***");
        String str="welome";
        for (int i = 0;i < str.length(); i++){
            System.out.println(str.charAt(i));
        }
        
        /*String num="5055";
        int n=Integer.parseInt(num);
        n+=200;
        System.out.println(n);*/
        
        	

	}

}
