class Alphabet {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            if (i % 2== 0) {
                for (char ch = 'A'; ch < 'A' + i; ch++) {
                    System.out.print(ch);
                }
            } 
            else {
                for (char ch = (char)('A' + i - 1); ch >= 'A'; ch--) {
                    System.out.print(ch);
                }
            }
            System.out.println();
        }
    }
}
