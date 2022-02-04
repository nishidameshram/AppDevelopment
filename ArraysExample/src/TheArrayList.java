import java.util.ArrayList;

public class TheArrayList
{
    public static void main(String[] args)
    {
        ArrayList<String> names= new ArrayList<>();
        names.add("James"); //0
        names.add("Nishida"); //1
        names.add("Peter"); //3
        names.add(4,"Kylie") ;//4
        names.set(1,"Zach"); //replace
         //names.remove(0);

        for (int i=0; i < names.size();  i++)
        {
            System.out.println(names.get(i)); //get method instead of length for string values
        }
    }
}
