public class DividedNumber {

    //to print the numbers between 1to100 which can be divided by 3 and 5 separately

    //main method
    public static void main(String[] args) {
        int i=1;
        //using while method
        while (i<=100){
            if(i%3==0){
                System.out.println("The Number which can divide By 3 is:" +"\t"+i);
            }
            i++;
        }
        System.out.println("***************");
        int j=1;
        while (j<=100){
            if(j%5==0){
                System.out.println("The Number which can divide By 5 is:" +"\t"+j);
            }
            j++;
        }
    }
}
