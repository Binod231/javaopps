public class LeftRotate {
    static void leftRotate(int arr[]){
        int n=arr.length;

        for (int i=1;i<n;i++){
            int temp=arr[i];
            arr[i]=arr[i-1];
            arr[i-1]=temp;

        }
    }
    public static void main(String[] args) {
        int []arr={1,6,7,8,9};
        int n=arr.length;
        System.out.println("Before Rotate:- ");
        for (int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        leftRotate(arr);
        System.out.println("After Rotate:-");
        for (int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");

        }


    }
}
