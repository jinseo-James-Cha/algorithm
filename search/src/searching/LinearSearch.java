package searching;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {

		/*
		 * Linear Search(Sequential Search)
		 * 
		 * 
		 * 종료조건
		 * 1. 검색할 값을발견하지 못하고 배열의 끝을 지나간 경우
		 * 2. 검색할 값과 같은 요소를 발견한 경우 
		 * 
		 * 보초법(Sentinel Method)
		 * - 검색하려는 값을 배열 맨끝에 보초를 세운다.
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("number of elements : ");
		int num = sc.nextInt();
		int[] x = new int[num + 1];
		
		for(int i = 0; i < num; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = sc.nextInt();
		}
		
		System.out.print("search number : ");
		int ky = sc.nextInt();
		
		int idx = seqSearchSen(x, num, ky);
		
		if(idx == -1) {
			System.out.print("no results");
		}
		else {
			System.out.print("found your search at " + idx);
		}
	
	}
	
	public static int seqSearchSen(int[] a, int n, int key) {
		
		int i = 0;
		
		a[n] = key;
		
		while(true) {
			if(a[i] == key)
				break;
			i++;
		}
		
		return i == n ? -1 : i;
	}

}
