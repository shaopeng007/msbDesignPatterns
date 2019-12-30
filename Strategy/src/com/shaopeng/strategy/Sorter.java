package com.shaopeng.strategy;

public class Sorter {

  public void sort(int[] arr){
      for (int i = 0; i <arr.length ; i++) {

          int minPos=i;

          for (int j = i+1; j < arr.length; j++) {
              minPos= arr[j]<arr[minPos] ? j : minPos;

          }
          swap(arr,i,minPos);

      }

  }

  public void swap(int [] arr,int i,int j){
      int temp=arr[i];
      arr[i]=arr[j];
      arr[j]=temp;

  }
}
