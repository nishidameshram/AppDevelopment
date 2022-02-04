public class StringArrays
{
    public static void main(String[] args)
    {
        String[] names = getNames();
        for (int i = 0; i < names.length; i++)
        {
            System.out.println(names[i].charAt(0));
        }

    }


    public static String[] getNames() {
        String[] names = new String[4];
        names[0] = "John";
        names[1] = "love";
        names[2] = "Paul";

        return names;


    }
}