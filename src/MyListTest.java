public class MyListTest {
    public static void main(String[] args) {
        MyList myList = new MyList();

        myList.add(0,1);
        myList.add(1,2);
        myList.add(2,1);
        myList.add(3,3);
        myList.add(4,5);

        System.out.println(myList.indexOf(1));
        System.out.println(myList.contains(2));
        System.out.println(myList.contains(3));
        System.out.println(myList.size());
        System.out.println(myList.remove(5));
        System.out.println(myList.size());
        System.out.println(myList.add(4));
        System.out.println(myList.indexOf(4));
        System.out.println(myList.add("hello"));
        System.out.println(myList.indexOf("hello"));
        System.out.println(myList.add(null));
        System.out.println(myList.get(6));

        myList.clear();
        System.out.println(myList.get(1));


    }
}
