class Main
{
    public static void main(String[] args)
    {   
        int number = 123456;
        int reverseNum = 0;
        int remainder;
        System.out.println(number);
        while(number != 0)
        {
            remainder = number % 10;
            reverseNum = reverseNum * 10 + remainder;
            number = number / 10;
        }
        System.out.println(reverseNum);
        
    }
}