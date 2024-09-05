class Main {
    
    public static int calculateSum(int a, int b) {
        int result = a + b; // 'result' is a local variable within calculateSum
        return result;
    }

    //public static void main(String[] args) {
     //   calculateSum(5, 3);
       // System.out.println(result); // Error: 'result' cannot be accessed here
    //}


    public static void main(String[] args) {
    int sum = calculateSum(5, 3); // Capture the returned sum
    System.out.println(sum); // Now 'sum' is accessible and can be printed
    }
      }
//use online compiler to run the code