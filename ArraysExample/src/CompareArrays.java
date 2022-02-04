public class CompareArrays {
    public static void main(String[] args) {
        int [] num1={2,4,6,8,10};
        int [] num2={2,4,8,8,10};

        boolean arraysEqual=true;
        int i=0;

        if(num1.length !=num2.length)
        {
            arraysEqual=false;
        }
        while(arraysEqual && i<num1.length)
        {
            if(num1[i]!=num2[i])
            {
                arraysEqual=false;
            }
            i++;
        }
        if(arraysEqual)
        {
            System.out.println("they are same");
        }
else
        {
            System.out.println("They are not same");
        }
    }
}
