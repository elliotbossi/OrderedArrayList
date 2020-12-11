public class Tester {

    public static void main(String[] args) {
            NoNullArrayList<String> a = new NoNullArrayList<String>(6);
            a.add(0, "1");
            a.add(1, "0");
            a.add("-2");
            System.out.println(a.get(0));
            System.out.println(a.get(1));
            System.out.println(a.get(2));
            a.set(0,"0");
            System.out.println(a.get(0));

            OrderedArrayList<String> b = new OrderedArrayList<String>(6);
            b.add(0, "1");
            b.add(1, "0");
            b.add("-2");
            System.out.println(b.get(0));
            System.out.println(b.get(1));
            System.out.println(b.get(2));
            b.set(0, "100");
            System.out.println(b.get(0));
            System.out.println(b.get(1));
            System.out.println(b.get(2));

            //a.add(0, null);
            //b.add(0, null);
    }
}
