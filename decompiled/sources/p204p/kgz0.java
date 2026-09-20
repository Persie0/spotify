package p204p;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public abstract class kgz0 {

    /* JADX INFO: renamed from: a */
    public static final gfz0 f122489a = new gfz0(new byte[0], 0, 0, false, false);

    /* JADX INFO: renamed from: b */
    public static final int f122490b;

    /* JADX INFO: renamed from: c */
    public static final AtomicReference[] f122491c;

    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f122490b = iHighestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i = 0; i < iHighestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference();
        }
        f122491c = atomicReferenceArr;
    }

    /* JADX INFO: renamed from: a */
    public static final void m56374a(gfz0 gfz0Var) {
        if (gfz0Var.f79494f != null || gfz0Var.f79495g != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (gfz0Var.f79492d) {
            return;
        }
        AtomicReference atomicReference = f122491c[(int) (Thread.currentThread().getId() & (((long) f122490b) - 1))];
        gfz0 gfz0Var2 = f122489a;
        gfz0 gfz0Var3 = (gfz0) atomicReference.getAndSet(gfz0Var2);
        if (gfz0Var3 == gfz0Var2) {
            return;
        }
        int i = gfz0Var3 != null ? gfz0Var3.f79491c : 0;
        if (i >= 65536) {
            atomicReference.set(gfz0Var3);
            return;
        }
        gfz0Var.f79494f = gfz0Var3;
        gfz0Var.f79490b = 0;
        gfz0Var.f79491c = i + 8192;
        atomicReference.set(gfz0Var);
    }

    /* JADX INFO: renamed from: b */
    public static final gfz0 m56375b() {
        AtomicReference atomicReference = f122491c[(int) (Thread.currentThread().getId() & (((long) f122490b) - 1))];
        gfz0 gfz0Var = f122489a;
        gfz0 gfz0Var2 = (gfz0) atomicReference.getAndSet(gfz0Var);
        if (gfz0Var2 == gfz0Var) {
            return new gfz0();
        }
        if (gfz0Var2 == null) {
            atomicReference.set(null);
            return new gfz0();
        }
        atomicReference.set(gfz0Var2.f79494f);
        gfz0Var2.f79494f = null;
        gfz0Var2.f79491c = 0;
        return gfz0Var2;
    }
}
