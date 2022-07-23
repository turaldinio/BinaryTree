public class BinaryTree {
    private void mark(int[] arr, int left, int right, int level, int[] levels) {
        if (left == right) {
            levels[left] = level;
            return;
        }
        int middle = (left + right) / 2;
        levels[middle] = level;
        mark(arr, left, middle - 1, level + 1, levels);
        mark(arr, middle + 1, right, level + 1, levels);
    }

    public void build(int[] arr) {
        boolean needEnter = false;

        int[] levels = new int[arr.length];
        mark(arr, 0, arr.length - 1, 0, levels);

        for (int a = 0; a < levels.length / 2 + 1; a++) {
            for (int b = 0; b < arr.length; b++) {

                if (levels[b] == a) {
                    System.out.print(arr[b]);
                    needEnter = true;
                } else {
                    System.out.print(" " + " ");
                }
            }
            if (needEnter) {
                System.out.println();
                needEnter = false;
            }
        }
    }
}
