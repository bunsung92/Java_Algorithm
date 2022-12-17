package baekjoon.recursion;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Fibonacci5 {
}

class MainFibonacci5 {
    static FastReader scan = new FastReader();
    static StringBuilder sb = new StringBuilder();
    static int N, ans;
    static int[] col;
    static void input() {
        N = scan.nextInt();
        col = new int[N + 1];
    }

    static void output(int result) throws IOException {
        scan.output(result);
    }

    public static void main(String[] args) throws IOException {
        input();

        int result = recursionFibonacci(N);

        output(result);
    }

    //재귀 함수 구현 부분.
    private static int recursionFibonacci(int n) { // n = 시도 횟수 0 / 1 / 1 / 2/ 3
        if (n <= 1) {
            return n;
        }

        return recursionFibonacci(n - 1) + recursionFibonacci(n - 2);
    }


    static class FastReader {
        BufferedReader br;
        BufferedWriter bw;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
            bw = new BufferedWriter(new OutputStreamWriter(System.out));
        }

        public FastReader(String s) throws FileNotFoundException {
            br = new BufferedReader(new FileReader((s)));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

        public void output(int result) throws IOException {
            bw.write(String.valueOf(result));
            bw.flush();
        }
    }
}
