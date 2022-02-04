public class Arrays {
    public static void main(String[] args) {
        int [] numbers=new int[5];

        numbers[0]=10;
        numbers[1]=15;
        numbers[2]=20;
        numbers[3]=25;
        numbers[4]=30;

        int [] numbers2 ={10,15,20,25,30};
        for(int i=0;i<numbers.length;i++)
        {
            System.out.println(numbers[i]);
        }

        System.out.println();
        for(int val:numbers)
        {
            System.out.println(val);
        }


    }
}
