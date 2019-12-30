package com.shaopeng.strategy;

public class SorterCompareble {

  public void sort(Comparable[] arr){
      for (int i = 0; i <arr.length ; i++) {

          int minPos=i;

          for (int j = i+1; j < arr.length; j++) {
              minPos= arr[j].compareTo(arr[minPos])==-1 ? j : minPos;

          }
          swap(arr,i,minPos);

      }

  }

  public void swap(Comparable[] arr,int i,int j){
      Comparable temp=arr[i];
      arr[i]=arr[j];
      arr[j]=temp;

  }
}
