package p204p;

import java.util.concurrent.locks.AbstractOwnableSynchronizer;

/* JADX INFO: loaded from: classes4.dex */
public final class w8h1 extends AbstractOwnableSynchronizer implements Runnable {

    /* JADX INFO: renamed from: a */
    public final l9h1 f248936a;

    public /* synthetic */ w8h1(l9h1 l9h1Var) {
        this.f248936a = l9h1Var;
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void m87462a(Thread thread) {
        setExclusiveOwnerThread(thread);
    }

    public final String toString() {
        return this.f248936a.toString();
    }

    @Override // java.lang.Runnable
    public final void run() {
    }
}
