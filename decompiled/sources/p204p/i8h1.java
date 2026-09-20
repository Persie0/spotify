package p204p;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class i8h1 {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m49948a(Unsafe unsafe, l8h1 l8h1Var, long j, k8h1 k8h1Var, k8h1 k8h1Var2) {
        while (!unsafe.compareAndSwapObject(l8h1Var, j, k8h1Var, k8h1Var2)) {
            if (unsafe.getObject(l8h1Var, j) != k8h1Var) {
                return false;
            }
        }
        return true;
    }
}
