import java.util.*;

public class Solution{
    public static int calc(int N, List<Integer> A) {
        Map<Integer, Integer> frequency = new HashMap<>();
        int maxSum = 0;
        int basket1Size = 0;
        int basket2Size = 0;

        for (int i = 0; i < N; i++) {
            int num = A.get(i);
            frequency.put(num, frequency.getOrDefault(num, 0) + 1);

            if (frequency.get(num) == 1) {
                basket1Size++;
                maxSum = Math.max(maxSum, basket1Size);
            } else {
                basket2Size++;
                maxSum = Math.max(maxSum, basket2Size);
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = Integer.parseInt(scan.nextLine().trim());

        List<Integer> A = new ArrayList<>(N);
        for (int j = 0; j < N; j++) {
            A.add(Integer.parseInt(scan.nextLine().trim()));
        }

        int result = calc(N, A);
        System.out.println(result);
    }
}
