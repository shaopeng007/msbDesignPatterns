package com.shaopeng.strategy;

import java.util.Comparator;

public class SorterComparator <T> {

  public void sort(T [] arr , Comparator<T> co){
      for (int i = 0; i <arr.length ; i++) {

          int minPos=i;

          for (int j = i+1; j < arr.length; j++) {
              minPos= co.compare(arr[j],arr[minPos])==-1 ? j : minPos;

          }
          swap(arr,i,minPos);

      }

  }

  public void swap(T[] arr,int i,int j){
      T temp=arr[i];
      arr[i]=arr[j];
      arr[j]=temp;

  }
}
