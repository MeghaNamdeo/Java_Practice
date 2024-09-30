public class Main {
    static int count = 0;

    static {
        System.out.println("This is static block ");
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
//frist static block execute then static method

public class Main {
    static int count = 0;

    static {
        System.out.println("This is static block ");
    }
    Main()
    {
        System.out.println("This is constructor ");
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


//output
This is static block 
This is constructor 
1
This is constructor 
2
This is constructor 
3
