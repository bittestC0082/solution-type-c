package problem04;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Main {
	public int[][] gugudan = new int[18][2];
	public boolean[] isTrue = new boolean[18];
	
	public int[] testTime(int x, int y) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int answer = sc.nextInt();
		long start = System.currentTimeMillis();
		
		while (true) {
			if (answer==x*y) 
				break;
			count++;
		}
		long end = System.currentTimeMillis();
		
		long testTime = start-end;
		int[] result = {count, (int)testTime};
		
		return result;
	}
	
	public void test() {
		for (int dan = 0; dan<9; dan++) {
			int pre = -1;
			for (int i=0; i<2; i++) {
				while (true) {
					int rd = new Random(10).nextInt();
					
					if (rd!=pre){
						int idx = danRandom();
						gugudan[idx][1] = dan;
						gugudan[idx][2] = rd;
						pre = rd;
						break;
					}
				}
			}
		}
	}
	
	public int danRandom() {
		while (true) {
			int dna_rd = new Random(18).nextInt();

			if (isTrue[dna_rd])
				return dna_rd;
		}
	}
	
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\Desktop");
		BufferedWriter bw = new BufferedWriter(new FileWriter(file));
		Main m = new Main();
		m.test();
		int ismore = 0;
		
		for (int i=0; i<m.gugudan.length; i++) {
			int[] result = m.testTime(m.gugudan[i][0], m.gugudan[i][1]);
		}
	}
}