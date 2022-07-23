import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{10, 13, 16, 19, 22, 25, 28, 31, 34, 37, 40, 43, 46, 49, 52};

        BinaryTree binaryTree = new BinaryTree();
        binaryTree.build(array);

    }
}
