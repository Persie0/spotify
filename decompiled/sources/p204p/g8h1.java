package p204p;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class g8h1 {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m43959a(Unsafe unsafe, l8h1 l8h1Var, long j, Object obj, Object obj2) {
        while (!unsafe.compareAndSwapObject(l8h1Var, j, obj, obj2)) {
            if (unsafe.getObject(l8h1Var, j) != obj) {
                return false;
            }
        }
        return true;
    }
}
