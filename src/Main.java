public class Main {
        public static int count_EVEN(int[] a, int size){
            int index =0;
            for(int i = 0; i < size; i++){
                if(a[i] % 2 == 0){
                    index++;
                }
            }
            return index;
        }
        public static void main(String[] args) {
            int[] foo = {0, 1, 2, 3, 4};
            int i = 0;
            int[] bar= new int[100];
            while (i <= 99) {
                bar[i] = i;
                i++;
            }
            System.out.println("The number of even numbers in foo is:");
            System.out.println(count_EVEN(foo, 5));
            System.out.println("The number of even numbers in bar is:");
            System.out.println(count_EVEN(bar, 100));
        }
}
