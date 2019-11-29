package main;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Queue<Integer> queue = new PriorityQueue<>();
        queue.offer(13);
        queue.offer(3);
        queue.offer(7);
        queue.offer(3);
        queue.offer(1);
        queue.offer(10);
        System.out.print(queue.poll()+" ");
        System.out.print(queue.poll()+" ");
        queue.add(2);
        while (!queue.isEmpty()) {
            System.out.print(queue.poll()+" ");
        }

        Queue<Person> people = new PriorityQueue<>();
        people.add(new Person(1,"wqfewf", 2));
    }

    private void run3() {
        List<Integer> list = new ArrayList<>(Arrays.asList(10, 2, 6, 7, 8, 3, 4, 11));
//        for (int i = 0; i < list.size(); ) {
//            if (list.get(i) % 2 == 0) {
//                list.remove(i);
//            } else i++;
//        }
        list.removeIf(x -> x % 2 == 0);
        System.out.println(list);
    }

    private void run2() {
        List<Integer> list = new ArrayList<>(Arrays.asList(10, 2, 6, 7, 8, 3, 4, 11));
        List<Integer> list1 = list.subList(1, 6);
        Collections.sort(list1);
        System.out.println(list1);
        list1.remove(0);
        System.out.println(list);
    }

    private void run1() {
        Set<Integer> numbers = new HashSet<>(16);
        numbers.add(12);
        numbers.add(2);
        numbers.add(7);
        numbers.add(8);
        numbers.add(10);
        numbers.add(1);
        numbers.add(18);
        numbers.add(26);
        numbers.add(16);
        numbers.add(17);
        numbers.add(19);
        numbers.add(33);

        System.out.println(numbers);
        numbers.add(15);
        System.out.println(numbers);
    }
}
