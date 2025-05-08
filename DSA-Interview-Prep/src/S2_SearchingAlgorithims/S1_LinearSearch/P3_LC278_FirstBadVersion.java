package S2_SearchingAlgorithims.S1_LinearSearch;

public class P3_LC278_FirstBadVersion {
    public static void main(String[] args){
        //call from here....
    }

    private static int firstBadVersion(int n) {
        int firstBadVersion = -1;
        for(int version = 1; version <= n; version++){
            if(isBadVersion(version)){
                firstBadVersion = version;
                break;
            }
        }

        return firstBadVersion;
    }

    //method provided by leetcode
    private static boolean isBadVersion(int version) {
        return true ;
    }
}
