package Medium_Problems.Recursion.TowerOfHanoi;

public class toh {
    // public static void main(String[] args) {
    //     int N = 3, from = 0, to = 0, aux = 0;
    //     System.out.println(tohanoi(N, from, to, aux));
    // }
    
    public static long tohanoi(int N, int start, int destinatiom, int aux) {
        if (N == 0) {
            return 0;
        }
        tohanoi(N - 1, start, aux, destinatiom);
        System.out.println("move disk " + N + " from rod " + start + " to rod " + destinatiom);
        tohanoi(N - 1, aux, destinatiom, start);
        return (long) Math.pow(2, N) - 1; // for the steps
    }
}
