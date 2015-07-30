/**
 * description:
 * 对象优先分配在Eden空间，当不足时，发生Minor GC的操作
 * author: xirong
 * date: 2015-07-30
 * version: 1.0
 * copyright 2015 ,all rights reserved.
 */
public class MinorGC {
    private static final int _1MB=1024*1024;

    /*
    vm : -verbose:gc -Xmx20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8
     */
    public static void main(String[] args){
        byte[] a1,a2,a3,a4;
        a1 =new byte[2*_1MB];
        a2 =new byte[2*_1MB];
        a3 =new byte[2*_1MB];
        a4 =new byte[4*_1MB];

        System.out.println("main is over!");
    }
}

/*



 */