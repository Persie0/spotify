package p204p;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes2.dex */
public class fna0 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f71251a = AtomicReferenceFieldUpdater.newUpdater(fna0.class, Object.class, "_cur$volatile");
    private volatile /* synthetic */ Object _cur$volatile = new hna0(8, false);

    /* JADX INFO: renamed from: a */
    public final boolean m42214a(Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f71251a;
            hna0 hna0Var = (hna0) atomicReferenceFieldUpdater.get(this);
            int iM48000a = hna0Var.m48000a(runnable);
            if (iM48000a == 0) {
                return true;
            }
            if (iM48000a == 1) {
                y8a0.m93104i(atomicReferenceFieldUpdater, this, hna0Var, hna0Var.m48002c());
            } else if (iM48000a == 2) {
                return false;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final int m42215b() {
        hna0 hna0Var = (hna0) f71251a.get(this);
        hna0Var.getClass();
        long j = hna0.f93272f.get(hna0Var);
        return (((int) ((j & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j))) & 1073741823;
    }

    /* JADX INFO: renamed from: c */
    public final Object m42216c() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f71251a;
            hna0 hna0Var = (hna0) atomicReferenceFieldUpdater.get(this);
            Object objM48003d = hna0Var.m48003d();
            if (objM48003d != hna0.f93273g) {
                return objM48003d;
            }
            hna0 hna0VarM48002c = hna0Var.m48002c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, hna0Var, hna0VarM48002c) && atomicReferenceFieldUpdater.get(this) == hna0Var) {
            }
        }
    }
}
