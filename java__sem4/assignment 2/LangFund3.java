class LangFund3{
    static void smallestDistance(int [] array){
   
        int smallest = Math.abs(array[0]-array[1]);
        int index = 0;
        for(int i=1; i<array.length-1; i++){
            int value = Math.abs(array[i]-array[i+1]);
            if(value< smallest){
            smallest= value;
            index = i;
            }
               
        }
        System.out.println(smallest);
        System.out.println(index);   
           
    }
    public static void main(String [] args){
        int []arr= new int[]{4,8,6,1,2,9,4};
        smallestDistance(arr);
    }
} 