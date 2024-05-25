package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class CountStudents {
    public static void main(String[] args) {
      int[]  students = {1,1,0,0};
      int[] sandwiches = {0,1,0,1};
countStudents(students,sandwiches);
    }

    public static int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> queue=new LinkedList<>();

            for (int student:students)
            {
                queue.add(student);
            }

            int index=0;

            while(!queue.isEmpty())
            {
               int student= queue.poll();
               if(student==sandwiches[index])
               {
                   index++;
               }
               else {
                   queue.add(student);
               }
               if(index == sandwiches.length || queue.size() == queue.stream().distinct().count())
               {
                   break;
               }

            }
        return queue.size();

        }




    }


