public class Main {
    int count = 0;

    Main() {
        count++;
    }

    void display() {
        System.out.println(count);
    }

    public static void main(String[] args) {
        Main A1 = new Main(); // count becomes 1 for A1
        A1.display();         // Outputs: 1

        Main A2 = new Main(); // count becomes 1 for A2
        A2.display();         // Outputs: 1

        Main A3 = new Main(); // count becomes 1 for A3
        A3.display();         // Outputs: 1
    }
}



//using static 
public class Main {
    static int count = 0;

    Main() {
        count++;
    }

    static void display() {
        System.out.println(count);
    }

    public static void main(String[] args) {
        Main A1 = new Main(); // count becomes 1 for A1
        Main.display();         // Outputs: 1

        Main A2 = new Main(); // count becomes 2 for A2
        Main.display();         // Outputs: 2

        Main A3 = new Main(); // count becomes 3 for A3
        Main.display();         // Outputs: 3
    }
}
