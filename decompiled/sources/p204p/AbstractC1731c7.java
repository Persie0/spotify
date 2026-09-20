package p204p;

import sun.misc.Unsafe;

/* JADX INFO: renamed from: p.c7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class AbstractC1731c7 {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m31591a(Unsafe unsafe, AbstractC1694b7 abstractC1694b7, long j, Object obj, Object obj2) {
        while (!unsafe.compareAndSwapObject(abstractC1694b7, j, obj, obj2)) {
            if (unsafe.getObject(abstractC1694b7, j) != obj) {
                return false;
            }
        }
        return true;
    }
}
