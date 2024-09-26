import java.util.*;
class Binary
{
    public static void main(String args[])
    {
        int a[]=new int[5];
        a[0]=1;
        a[1]=2;
        a[2]=3;
        a[3]=4;
        a[4]=5;
        int low=0,high=4,mid;
        int flag=0;
        System.out.println("enter any key value");
        Scanner sc=new Scanner(System.in);
        int key=sc.nextInt();
        while(low<=high)
        {
            mid=(low+high)/2;
            if(key=a[mid])
            {
                flag=1;
                break;
            }
            else if(key<a[mid])
              high=mid-1;
            else
              low=mid+1;
        }
        if(flag==1)
        {
            System.out.println("key is found");
        }
        else
        {
            System.out.println("key is not found");
        }
    }
}