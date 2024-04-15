package List;

import java.util.Arrays;

public class CustomArrayList {
  private   int[] data;
  private static int DEFAULT_SIZE=10;
  private int size=0;

  public CustomArrayList()
  {
      this.data=new int[DEFAULT_SIZE];
  }

  public void add(int num)
  {
      if(isFull())
      {
resize();
      }
      data[size++]=num;
  }

  private void resize()
  {
      int[] temp=new int[DEFAULT_SIZE*2];
      for (int i = 0; i < data.length; i++) {
          temp[i]=data[i];
      }
      data=temp;
  }

  public int remove()
  {
     int removed= data[size--];
     return removed;
  }

  public  int get(int index)
  {
    return   data[index];
  }

  public  int size()
  {
      return size;
  }

  public  void set(int index,int value)
  {
      data[index]=value;
      size++;
  }

    private boolean isFull()
    {
        return  size==data.length;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        CustomArrayList customArrayList=new CustomArrayList();
        customArrayList.add(10);
        customArrayList.add(20);
        customArrayList.add(30);

        System.out.println(customArrayList);
        customArrayList.set(3,50);
        System.out.println(customArrayList.remove());
        System.out.println(customArrayList.size());
        System.out.println(customArrayList.get(1));

        System.out.println(customArrayList);
    }
}
