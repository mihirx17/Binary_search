public class Main {
    public static int binary(int number[],int key)
    {
int start=0;
int end= number.length-1;
while (start<=end)
{
    int mid=(start+end)/2;
    if(number[mid]==key)
    {
        return mid;
    }
    if (number[mid]<key)
    {
        start=mid+1;
    }
    else
    {
        end=mid-1;
    }
}
return -1;
    }
    public static void main(String[] args) {

      int number[]={1,2,4,5,6,7,10};
      int key=6;
        System.out.println(binary(number,key));
        int number1 =new [10];

    }
}