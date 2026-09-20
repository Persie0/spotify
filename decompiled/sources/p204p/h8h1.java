package p204p;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class h8h1 {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m46832a(Unsafe unsafe, l8h1 l8h1Var, long j, c8h1 c8h1Var, c8h1 c8h1Var2) {
        while (!unsafe.compareAndSwapObject(l8h1Var, j, c8h1Var, c8h1Var2)) {
            if (unsafe.getObject(l8h1Var, j) != c8h1Var) {
                return false;
            }
        }
        return true;
    }
}
