//3.     მოცემულია მასივი, რომელიც შედგება მთელი რიცხვებისგან. დაწერეთ ფუნქცია
// რომელსაც გადაეცემა ეს მასივი და აბრუნებს მინიმალურ მთელ რიცხვს,
// რომელიც 0-ზე მეტია და ამ მასივში არ შედის.
class NotContains {

    static void notContains(int[] array){
        int result = 0;
        int i = 1;
            for (int num:array) {
                while (num==i){
                    i++;
                }result=i;
            }
        System.out.println(result);
    }

    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 6, 7, 8, 9};
        notContains(array);
    }
}
