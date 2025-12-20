class Sort {

   static int[] merge(int[] a, int[] b) {
        int indexA = 0;
        int indexB = 0;
        int[] merged = new int[a.length + b.length];
        int indexMerge = 0;

        while(indexA < a.length || indexB < b.length) {
            if (indexB >= b.length) {
                merged[indexMerge] = a[indexA];
                indexMerge++;
                indexA++;
                
            } else if (indexA >= a.length) {
                merged[indexMerge] = b[indexB];
                indexMerge++;
                indexB++;
                
            } else if (a[indexA] < b[indexB]) {
                merged[indexMerge] = a[indexA];
                indexMerge++;
                indexA++;
            } else if (a[indexA] > b[indexB]) {
                merged[indexMerge] = b[indexB];
                indexMerge++;
                indexB++;
            } 
            
           
        }
        return merged;
    }

    static int[] sort(int[] zahlen) {
        if(zahlen.length == 1) {
            return zahlen;
        }

        int[] arrayA = firstPart(zahlen);
        int[] arrayB = lastPart(zahlen);

        arrayA = sort(arrayA);
        arrayB = sort(arrayB);

        int[] merged = merge(arrayA, arrayB);

        return merged;
    }

    private static int[] firstPart(int[] zahlen) {
        int firstPartLength = zahlen.length / 2;
        int[] firstPart = new int [firstPartLength];
        for (int i = 0; i < firstPartLength; i++) {
            firstPart[i] = zahlen[i];
        }
        return firstPart;
    }

    private static int[] lastPart(int[] zahlen) {
        int lastPartLength = zahlen.length - zahlen.length / 2;
        int[] lastPart = new int [lastPartLength];
        for (int i = 0; i < lastPartLength; i++) {
            lastPart[i] = zahlen[i + zahlen.length / 2];
        }
        return lastPart;
    }

    static void main() {
        //int[] a = {1,4,6,7};
        //int[] b = {2,3,8,9};
        //int[] merged = merge(a,b);
        //System.out.println(java.util.Arrays.toString(merged));


        int[] zahlen = {4,2,-1,9,0,5,3,6};
        System.out.println(java.util.Arrays.toString(firstPart(zahlen)));
        System.out.println(java.util.Arrays.toString(lastPart(zahlen)));

        int[] sortiert = sort(zahlen);
        System.out.println(java.util.Arrays.toString(sort(zahlen)));
    }
}