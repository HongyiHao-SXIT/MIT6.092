class Marathon {
    public static void main (String[] arguments) {
        String[] names = {
            "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
            "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda",
            "Aaron", "Kate"
        };

        int[] times = {
            341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299,
            343, 317, 265
        };

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + ": " + times[i]);
        }
        int MAX = times[0];
        int NUM = 0;
        for( int i = 0 ; i < names.length; i++){
            if(times[i] >= MAX){
                MAX = times[i];
                NUM = i;
            }
        }
            System.out.println("The Best is : "+ names[NUM] +":" +MAX);
    }
    
} 