public class LeadersArray {
    public static void main(String[] args) {
        int []arr={7,10,4,8,6,5};
        int n=arr.length;
        System.out.println("Real array:-");
        for (int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");

        }
        System.out.println();
        System.out.println("Leaders array:-");
        for (int i=0;i<n-1;i++)
        {
            if (arr[i]>arr[i+1])
            {
                System.out.print(arr[i]+" ");
            }
        }
        System.out.print(arr[n-1]);
        System.out.println();
    }
}
