import java.util.*;
class datevalidation
{
    public void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a date");
        String date=sc.nextLine();
        if(isValid(date))//calls function which checks if date is valid
            System.out.println("Date is valid");
        else
            System.out.println("Date is not valid");
    }
    boolean isValid(String d)//function to check for valid dates
    {
        int dd=Integer.valueOf(d.substring(0,2));//stores day
        int mm=Integer.valueOf(d.substring(3,5));//stores month
        int y=Integer.valueOf(d.substring(6));//stores year
        if(((y%4==0&&y%100!=0)||(y%400==0))&&mm==2)//checks february on leap years
            if(dd>0&&dd<30)
                return true;
        if(mm==2)//checks for february for non-leap years
            if(dd>0&&dd<29)
                return true;
        if(mm==1||mm==3||mm==5||mm==7||mm==8||mm==10||mm==12)//checks for months with 31 days
            if(dd>0&&dd<32)
                return true;
        if(mm==4||mm==6||mm==9||mm==11)//checks for months with 30 days
            if(dd>0&&dd<31)
                return true;
        return false;
    }
}        