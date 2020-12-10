Public class prac7
{

Public static void main(String args[])
{
Int sum=0;

Try{
For(int i=0;i<args.length;i++)
{
Sum=sum+Integer.parseInt(args[i]);

}

System.out.println(“ SUM OF ENTERED
ELEMENTS = “+sum);
}
Catch (Exception e)
{System.out.println(“#ERROR#\nEnter value as
positive integers in the command line \n*TRY
AGAIN*”); }

}

}
