package p204p;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes2.dex */
public final class yg71 extends vf60 {

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f272507g = AtomicIntegerFieldUpdater.newUpdater(yg71.class, "_state$volatile");
    private volatile /* synthetic */ int _state$volatile;

    /* JADX INFO: renamed from: e */
    public final Thread f272508e = Thread.currentThread();

    /* JADX INFO: renamed from: f */
    public hwr f272509f;

    /* JADX INFO: renamed from: l */
    public static void m93589l(int i) {
        throw new IllegalStateException(("Illegal state " + i).toString());
    }

    @Override // p204p.vf60
    /* JADX INFO: renamed from: i */
    public final boolean mo25338i() {
        return true;
    }

    @Override // p204p.vf60
    /* JADX INFO: renamed from: j */
    public final void mo25339j(Throwable th) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        do {
            atomicIntegerFieldUpdater = f272507g;
            i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i == 1 || i == 2 || i == 3) {
                    return;
                }
                m93589l(i);
                throw null;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 2));
        this.f272508e.interrupt();
        atomicIntegerFieldUpdater.set(this, 3);
    }

    /* JADX INFO: renamed from: k */
    public final void m93590k() {
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f272507g;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i != 2) {
                    if (i == 3) {
                        Thread.interrupted();
                        return;
                    } else {
                        m93589l(i);
                        throw null;
                    }
                }
            } else if (atomicIntegerFieldUpdater.compareAndSet(this, i, 1)) {
                hwr hwrVar = this.f272509f;
                if (hwrVar != null) {
                    hwrVar.dispose();
                    return;
                }
                return;
            }
        }
    }
}
