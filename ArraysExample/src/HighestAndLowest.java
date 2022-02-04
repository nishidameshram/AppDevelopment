public class HighestAndLowest
{
    public static void main(String[] args) {
        int [] nmbers= {2,6,10,12,15,17,1};

        int highest= nmbers[0];

        for(int i=1;i<nmbers.length;i++)
        {
            if(nmbers[i]>highest)
            {
                highest=nmbers[i];
            }
        }
        System.out.println("The highest value is:"+highest);

        int lowest =nmbers[0];
        for(int i=1;i<nmbers.length;i++)
        {
            if(nmbers[i]<lowest)
            {
                lowest=nmbers[i];
            }
        }
        System.out.println("The lowest value is:"+lowest);
    }
}
