//5.     გვაქვს n სართულიანი კიბე, ერთ მოქმედებაში შეგვიძლია ავიდეთ 1 ან 2 საფეხურით.
// დაწერეთ ფუნქცია რომელიც დაითვლის n სართულზე ასვლის ვარიანტების რაოდენობას.
public class CountVariants {
    public static int totalWays(int n)
    {
        if (n < 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }
        return totalWays(n - 1) + totalWays(n - 2);
    }

    public static void main(String[] args)
    {
        int n = 6;
        System.out.println(totalWays(n));
    }
}
