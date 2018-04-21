package com.hossi.lotto;

import java.util.Random;

public class Lotto {
	
	/*
	 * 변환값이 있는 함수의 경우
	 * 1. 변환타입으로 result 변수를 먼저 선언하고
	 * 
	 * 10. 마지막 줄에 return 해놓고 코딩을 시작한다.
	 */
	public  int[] generate(int count) {
		int[] result = new int[count];
		
		// 코드 작성
		// 36개의 코드 중에 count개를 랜덤으로 출력해준다.
		
		Random random = new Random();
		
		for (int i =0 ; i < count ;) {
			int randomNumber = random.nextInt(35)+1;
			if(!isExist(randomNumber,result)) {
			result[i] = randomNumber;
			i = i +1;
			}
		}
		
		
		return result;
		
	}
	
	private boolean isExist(int randomNumber, int randomArray[]) {
		boolean result = false;
	
		for(int num : randomArray) {
			if(num == randomNumber) {
				return true;
			}
		}
		
		
		return result;
	}

	
	final int Default_Count=6;
	// default 숫자는 6
	public int[] generate() {
		//int defaultCount = 6;
		return generate(Default_Count);
	}
}
