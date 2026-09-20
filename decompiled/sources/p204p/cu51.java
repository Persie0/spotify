package p204p;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes2.dex */
public final class cu51 extends bqa implements ft51 {

    /* JADX INFO: renamed from: Y */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f42054Y = AtomicReferenceFieldUpdater.newUpdater(cu51.class, Object.class, "_subscription$volatile");

    /* JADX INFO: renamed from: Z */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f42055Z = AtomicIntegerFieldUpdater.newUpdater(cu51.class, "_requested$volatile");

    /* JADX INFO: renamed from: X */
    public final int f42056X = 1;
    private volatile /* synthetic */ int _requested$volatile;
    private volatile /* synthetic */ Object _subscription$volatile;

    @Override // p204p.bqa
    /* JADX INFO: renamed from: I */
    public final void mo30217I() {
        ot51 ot51Var = (ot51) f42054Y.getAndSet(this, null);
        if (ot51Var != null) {
            ot51Var.cancel();
        }
    }

    @Override // p204p.bqa
    /* JADX INFO: renamed from: K */
    public final void mo30219K() {
        f42055Z.incrementAndGet(this);
    }

    @Override // p204p.bqa
    /* JADX INFO: renamed from: L */
    public final void mo30220L() {
        ot51 ot51Var;
        int i;
        int i2;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f42055Z;
            int i3 = atomicIntegerFieldUpdater.get(this);
            ot51Var = (ot51) f42054Y.get(this);
            i = i3 - 1;
            if (ot51Var != null && i < 0) {
                i2 = this.f42056X;
                if (i3 == i2 || atomicIntegerFieldUpdater.compareAndSet(this, i3, i2)) {
                    break;
                }
            } else if (atomicIntegerFieldUpdater.compareAndSet(this, i3, i)) {
                return;
            }
        }
        ot51Var.request(i2 - i);
    }

    @Override // p204p.ft51
    public final void onComplete() {
        m30233l(null, false);
    }

    @Override // p204p.ft51
    public final void onError(Throwable th) {
        m30233l(th, false);
    }

    @Override // p204p.bqa, p204p.ft51
    public final void onNext(Object obj) {
        f42055Z.decrementAndGet(this);
        mo30231j(obj);
    }

    @Override // p204p.ft51
    public final void onSubscribe(ot51 ot51Var) {
        f42054Y.set(this, ot51Var);
        while (!mo30213E()) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f42055Z;
            int i = atomicIntegerFieldUpdater.get(this);
            int i2 = this.f42056X;
            if (i >= i2) {
                return;
            }
            if (atomicIntegerFieldUpdater.compareAndSet(this, i, i2)) {
                ot51Var.request(i2 - i);
                return;
            }
        }
        ot51Var.cancel();
    }
}
