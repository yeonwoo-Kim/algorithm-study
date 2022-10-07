package AlgorithmCode;

public class DynamicProgramming02 {
    /*
    2 x n 타일링 (백준 온라인 저지 11726번)
    2 x n 타일링 2 (백준 온라인 저지 11727번)

     */
     static int[] value = new int[1001];

    public int tiling(int n) {
        if(n == 1) return 1;
        if(n == 2) return 2;
        if(value[n] != 0) return value[n];
        return value[n] = (tiling(n - 1) + tiling(n -2)) % 10007;
    }

    public int tiling2(int n) {
        if(n == 1) return 1;
        if(n == 2) return 3;
        if(value[n] != 0) return value[n];
        return value[n] = (tiling(n - 1) + 2*tiling(n -2)) % 10007;
    }
}
