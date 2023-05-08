package week3.eomchaewon.q2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Set<String> stringSet = new HashSet<>();

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		while (N-- > 0) {
			stringSet.add(br.readLine());
		}

		int count = 0;
		while (M-- > 0) {
			if (stringSet.contains(br.readLine())) {
				count++;
			}
		}

		System.out.println(count);
	}
}
