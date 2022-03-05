import java.util.Scanner;

class DoubleArraySum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of first array: ");
        int arr1Length = sc.nextInt();
        System.out.println("Enter length of second array: ");
        int arr2Length = sc.nextInt();

        double arr1[] = new double[arr1Length];
        double arr2[] = new double[arr2Length];
        System.out.println("Enter elements of first array: ");
        for(int i = 0; i < arr1Length; i++){
            arr1[i] = sc.nextDouble();
        }
        System.out.println("Enter elements of second array: ");
        for(int i = 0; i < arr2Length; i++){
            arr2[i] = sc.nextDouble();
        }
        sc.close();
        
        int minLen = Math.min(arr1Length, arr2Length);
        int maxLen = Math.max(arr1Length, arr2Length);
        int result[] = new int[maxLen];

        for(int i = 0; i<minLen;i++){
            result[i] = (int) (arr1[i] + arr2[i]);
        }
        for(int i = minLen; i<maxLen;i++){
            if(arr1Length > arr2Length){
                result[i] = (int) (arr1[i]);
            }
            else{
                result[i] = (int) (arr2[i]);
            }
        }

        System.out.println("The resultant sum array is: ");
        for(int i = 0; i<maxLen;i++){
            System.out.print(result[i] + " ");
        }

    }
}