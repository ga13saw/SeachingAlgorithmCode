package com.code4you.infiniteSortedArray;

public class Solution {

	public static void main(String[] args) {

		int[] numArr = {1,10,15,20,40,80,90,100,500};
		int findNum = 100;
		//int findNum=50;
		int seachNum = seachNum(numArr,findNum);
		int seachNum2 = seachNum2(numArr,findNum);
		System.out.println(" index of "+findNum+" is: "+seachNum);
		System.out.println(" index of "+findNum+" is: "+seachNum2);
	}

	private static int seachNum2(int[] numArr, int findNum) {

		if(numArr[0]==findNum){
			return 0;
		}
		int index=1;
		while(numArr[index]<findNum){
			index*=2;
			if(numArr[index]==findNum){
				return index;
			}
		}
		return binarySearch(numArr,findNum,(index/2)+1,index);
	}
	
	
	private static int binarySearch(int[] numArr, int findNum, int i, int index) {
			
		while(i<=index){
			int mid = (i+index)/2;
			if (numArr[mid]==findNum) {
				return mid;
			}else if(numArr[mid]<findNum){
				i=mid+1;
			}else{
				index=mid-1;
			}
		}
		return -1;
	}

	private static int seachNum(int[] numArr, int findNum) {
		
		if(numArr[0]==findNum){
			return 0;
		}
		int index=1;
		while(true){
			
			if(numArr[index]==findNum){
				return index;
			}else if (numArr[index]>findNum) {
					for (int i = (index/2)+1; i < index; i++) {
						if (numArr[i]==findNum) {
							return i;
						}
					}
					return -1;
				
			}else {
				index=2*index;
			}
				
			
		}
		
	}
	
		
	}
	


