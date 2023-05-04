import  java.util.Scanner;
public  class  Main
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
            //System.out.print("Enter the number to be converted into binary  : ");
            int num = input.nextInt();
            int default_number=num;
            long  binary=0;
            int  m=1,r;
            while (num>0)
            {
                r= num%2;
                binary=binary+m*r;
                m*=10;
                num=num/2;
            }
            System.out.println("Given the number:   "+default_number);
            System.out.println("binary  is    : "+binary);
    }
}