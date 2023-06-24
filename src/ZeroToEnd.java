                                                       // wap to move zero to end:-

public class ZeroToEnd {

    static void zero(int arr[]){
        int re=0;
        int n=arr.length;
        for (int i=0;i<n;i++)
        {

           if (arr[i] !=0){
             int temp=arr[i];
                arr[i]=arr[re];
                arr[re]=temp;
                re++;

            }


        }

    }
    public static void main(String[] args) {
        int []arr={1,0,3,0,5,6};
        int n=6;
        System.out.println("before shiftig");
        for (int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");

        }
        System.out.println();

       zero(arr);
        System.out.println("after shifting");
        for (int i=0;i<n;i++)

        {
            System.out.print(arr[i]+" ");
        }


    }
}
