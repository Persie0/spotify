package p204p;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class tpf1 {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m81260a(Unsafe unsafe, lpf1 lpf1Var, long j, Object obj, Object obj2) {
        while (!qpf1.m73439a(unsafe, lpf1Var, j, obj, obj2)) {
            if (unsafe.getObject(lpf1Var, j) != obj) {
                return false;
            }
        }
        return true;
    }
}
