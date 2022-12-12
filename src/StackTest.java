public class StackTest {

    public StackTest() {
        System.out.println("Konstruktor aufgerufen");
    }

    public int recursive(int n) {
        int x = 10, y = 12, z = 13;
        System.out.println(n);
        this.recursive(++n);
        return x + y + z;
    }

    public static void main(String[] args) {
        StackTest st = new StackTest();
        st.recursive(0);
    }
}
