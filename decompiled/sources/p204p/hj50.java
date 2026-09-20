package p204p;

import java.util.concurrent.locks.AbstractOwnableSynchronizer;

/* JADX INFO: loaded from: classes4.dex */
public final class hj50 extends AbstractOwnableSynchronizer implements Runnable {

    /* JADX INFO: renamed from: a */
    public final ij50 f91965a;

    public hj50(ij50 ij50Var) {
        this.f91965a = ij50Var;
    }

    /* JADX INFO: renamed from: a */
    public static void m47672a(hj50 hj50Var, Thread thread) {
        hj50Var.setExclusiveOwnerThread(thread);
    }

    public final String toString() {
        return this.f91965a.toString();
    }

    @Override // java.lang.Runnable
    public final void run() {
    }
}
